def cut(s, i):
    if i+2 <= len(s)-1: 
        s= s[:i]+s[i+2:]
    else: 
        s= s[:i]
    return s


def solution(s):
    answer=0 
    if len(s)==0:
        return 1
    if len(s) %2 !=0: 
        return 0
    else:
        for i in range(len(s)):
            if i+1 <= len(s)-1:
                if  s[i]==s[i+1] :
                    s=cut(s,i)
                    if solution(s) == 1:
                        answer=1
                    break;                              
    return answer

    