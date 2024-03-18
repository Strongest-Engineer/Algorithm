'''
문제 : https://www.acmicpc.net/problem/1260
접근 방식 : 그래프 생성 후 시작점 기준으로 DFS, BFS 탐색
          단, 방문할 수 있는 정점이 여러개인경우 작은거 먼저 방문해야하기 때문에 그래프는 오름차순으로 정렬
'''
import sys
from collections import deque

input = sys.stdin.readline

def dfs(graph, v, visited):
    # 현재 노드를 방문 처리
    visited[v] = True
    print(v, end=' ')

    # 현재 노드와 연결된 다른 노드를 재귀적으로 방문
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

def bfs(graph, start, visited):
    # 큐(Queue) 구현을 위해 deque 라이브러리 사용
    queue = deque([start])
    # 현재 노드를 방문 처리
    visited[start] = True
    # 큐가 반복 될 때까지 반복
    while queue:
        # 큐에서 하나의 원소를 뽑아 출력
        v = queue.popleft()
        print(v, end =' ')
        # 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
        for i in graph[v]:
            if not visited[i] :
                queue.append(i)
                visited[i] = True

N, M, V = map(int, input().split())
visited_dfs = [False] * (N+1)
visited_bfs = [False] * (N+1)

# graph 초기화
graph = [[] for _ in range(N + 1)]
for _ in range(M):
    i, j = map(int, input().split())
    graph[i].append(j)
    graph[j].append(i)

for row in graph:
    row.sort()

dfs(graph, V, visited_dfs)
print()
bfs(graph, V, visited_bfs)