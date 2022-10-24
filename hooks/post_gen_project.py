import glob
import os
import shutil

if '{{ cookiecutter.license }}' != 'Unlicensed':
    open('LICENSE.md', 'w').write(open('licenses/{{ cookiecutter.license }}','r').read())
shutil.rmtree('licenses')

if '{{ cookiecutter.build_system }}' == 'Maven':
    source = 'app/'
    allfiles = os.listdir(source)
    for f in allfiles:
        src_path = os.path.join(source, f)
        dst_path = os.path.join('.', f)
        shutil.move(src_path, dst_path)
    shutil.rmtree(source)
    all_delete_files = glob.glob(os.path.join('.', '*gradle*'), recursive=True)
    for f in all_delete_files:
        shutil.rmtree(f) if os.path.isdir(f) else os.remove(f)
    open('.versioning', 'a+').write(
        '\n[[tool.proman.versioning.files]]\
        \ncompat = "semver"\
        \nfilepath = "pom.xml"\
        \npattern = "<version>${version}</version>"'
    )
else:
    os.remove('pom.xml')
    open('.versioning', 'a+').write(
        '\n[[tool.proman.versioning.files]]\
        \ncompat = "semver"\
        \nfilepath = "gradle.properties"\
        \npattern = "version=${version}"'
    )
