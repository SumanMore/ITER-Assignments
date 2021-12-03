import re
string1="Welcome to python shell"
match=re.search('python',string1)
print(match.group())


string1="Welcome to python shell"
match=re.search('(p|P)ython',string1)
print(match.group())

string1="Python shell"
match=re.search('Shell',string1)
print(match.group())

