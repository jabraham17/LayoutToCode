#!/usr/local/bin/python3

import argparse
import os
import glob
import layout2java as u2j

#compile based on the language provided
def compile(filename, lang):
    if lang == 'java':
        #defined in uml2java
        u2j.compile(filename)

#check if the file given has the proper extensions
#this is used by the arg parser
def check_file(name):
    #if no proper file extension, raise error
    if not name.endswith('.l2c'):
        raise argparse.ArgumentTypeError(f'{name} is not a proper file that can be used by this script')
    return name

#gets all files from the current directory
def all_files():
    return glob.glob(os.path.join(os.getcwd(), '*.u2c'))

#returns the parsed args
def arg_parser():
    parser = argparse.ArgumentParser(description='Convert class definition in a l2c file to a fully fledged class in a programming language')
    parser.add_argument('files', nargs='*', type=check_file, help='The list of files to compile to the language')
    parser.add_argument('--lang', nargs='?', default='java', choices=['java'], type=str, help='The language to compile to, the default is java')
    return parser

#main function
def main():
    #get the arg parser
    parser = arg_parser()
    #get the args
    args = parser.parse_args()

    #get the files to be parsed
    files = args.files

    #if no files were supplied by user, get all in current dir
    if len(files) == 0:
        #map the filenames to the open_file func
        files = list(map(check_file, all_files()))

    #compile each file
    for filename in files:
        compile(filename, args.lang)

main()
