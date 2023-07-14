def solution(arr):
    answer = []
    for x in arr:
        answer.append(x)
    arr.sort()
    answer.remove(arr[0])
    if len(answer)==0:
        return [-1]

    return answer