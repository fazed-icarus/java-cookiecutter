import glob
import os
import shutil

if '{{ cookiecutter.license }}' != 'Unlicensed':
    open('LICENSE.md', 'w').write(open('licenses/{{ cookiecutter.license }}','r').read())
shutil.rmtree('licenses')

ver_syntax = '\n[[tool.proman.versioning.files]]\ncompat = "semver"'

if '{{ cookiecutter.build_system }}' == 'maven' or \
  '{{cookiecutter.build_system }}' == 'Maven':
    all_delete_files = glob.glob(os.path.join('.', '*gradle*'), recursive=True)
    for f in all_delete_files:
        shutil.rmtree(f) if os.path.isdir(f) else os.remove(f)
    open('.versioning', 'a+').write(
        '{}\
        \nfilepath = "pom.xml"\
        \npattern = "<version>{}</version>"\
        '.format(ver_syntax, '${version}')
    )
else:
    os.remove('pom.xml')
    open('.versioning', 'a+').write(
        '{}\
        \nfilepath = "gradle.properties"\
        \npattern = "version={}"\
        \n{}\
        \nfilepath = "build.gradle"\
        \npattern = "version = {}"\
        '.format(ver_syntax, '${version}', ver_syntax, '${version}')
    )
