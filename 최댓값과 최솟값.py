def solution(s):
    answer = ''
    list=s.split()
    print(list)
    for i in range(len(list)):
        list[i]=int(list[i])
    print(list)
    max=list[0]
    min=list[0]
    for i in range(len(list)):
        if max<list[i]:
            max=list[i]
        if min>list[i]:
            min=list[i]
    print(max)
    print(min)
    answer=str(min)+' '+str(max)
    return answer