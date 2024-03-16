'''
문제 : https://www.acmicpc.net/problem/11047
접근 방식 : 주어진 돈보다 동전이 작은 경우 중에서 큰 값부터 순차적으로 거슬러줬을 때 최소 금액 구하기
'''
import sys
input = sys.stdin.readline

N, money = map(int, input().split())
coin = []
count = 0;

for _ in range(N) : 
    tmp = int(input());
    if tmp <= money:
        coin.append(tmp);

coin.sort(reverse=True) # 동전이 큰 순서대로 정렬

for i in coin:
    count += money // i # coin 몫만큼 더하기
    money %= i # 나머지 할당
    if money <= 0:
        break

print(count)