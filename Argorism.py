def get_money():
    n, m = map(int, input().split())
    maximum = 10001
    money_list= []
    for _ in range(n):
        money_list.append(int(input()))

    # DP용 리스트
    d = [maximum] * (m + 1)
    
    # 값 처리
    d[0]= 0
    d[min(money_list)] = 1
    for i in range(min(money_list), m+1):
        for money in money_list:
            
            # 음수가 되면 중단
            if i-money < 0:
                break
            else:
                d[i] = min(d[i], d[i-money]+1) # 최소값 갱신
                #print(d[i])

    # 출력불가시
    if d[m] == maximum:
        print(-1)
    # 그외
    else:
        print(d[-1])


    


get_money()
