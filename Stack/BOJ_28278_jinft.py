'''
문제 : https://www.acmicpc.net/problem/28278
접근 방식 : 입력값에 따라 아래의 로직을 수행한다.
            1 : push
            2 : pop
            3 : size
            4 : empty
            5 : top
'''
import sys
input = sys.stdin.readline

n = int(input())
stack = []
for _ in range(n):
    cmd = list(map(int, input().split()))
    if cmd[0] == 1:
        stack.append(cmd[1])
    elif cmd[0] == 2:
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif cmd[0] == 3:
        print(len(stack))
    elif cmd[0] == 4:
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    elif cmd[0] == 5:
        if stack:
            print(stack[-1])
        else:
            print(-1)