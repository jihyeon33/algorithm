def solution(n):
    answer = 0
    dp=[]
    for i in range(0,n+1):
        if i ==0: 
            dp.append(0)
        elif i==1:
            dp.append(1)
        else:
            dp.append(dp[i-1]+dp[i-2])
        
    print(dp[i])   
    answer= dp[i] % 1234567
    return answer