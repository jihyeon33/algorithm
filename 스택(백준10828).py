#2023. 2. 28. 성공

import sys

n=int(sys.stdin.readline())
stack=[]
for i in range(n):
    do=sys.stdin.readline()
    dosplit= do.split()
    do1 =dosplit[0]
    if len(dosplit)>1:
        do2=dosplit[1]
    if do1 =="push":
        stack.append(do2)
    elif do1=="pop":
        if len(stack)==0:
            print("-1")
        else:
            print(stack.pop())
    elif do1=="size":
        print(len(stack))
    elif do1=="empty":
        print("1" if len(stack)==0 else "0")
    elif do1=="top":
        if len(stack) ==0:
            print("-1")
        else:
            print(stack[-1])