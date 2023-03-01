# 2023.3.1. 성공

#str="baekjoon online judge"
str=input()

start=[0]
tagflag="n"
resltstring=""
for i in range(len(str)):

    if str[i]=="<" or str[i]==">":
        if str[i]=="<":
            st=start.pop()
            end=i
            tempstring="".join(reversed(str[st:end]))
            resltstring+=tempstring
            start.append(i)
            tagflag="y"
        else: 
            st=start.pop()
            end=i
            tempstring=str[st:end+1]
            resltstring+=tempstring
            start.append(i+1)
            tagflag="n"
    if str[i]==" ":
        if tagflag=="n":
            st=start.pop()
            end=i
            tempstring="".join(reversed(str[st:end]))
            resltstring+=tempstring
            while str[i] == " ":
                resltstring+=" "
                i+=1
            start.append(i)
    if i >=len(str)-1 :
        if len(start)==0:
            break
        else:
            st=start.pop()
            end=i
            tempstring="".join(reversed(str[st:end+1]))
            resltstring+=tempstring
print(resltstring)