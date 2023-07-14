def solution(n):
    answer = 0

    lis = list(map(int, str(n)))
    for x in lis:
        answer+= x
    return answer