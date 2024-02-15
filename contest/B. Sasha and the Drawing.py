#https://codeforces.com/contest/1929/problem/B
import math
 
def solution():
    n, k = map(int, input().split())
    ans = 0
    if (4 * n - 2) == k:
        ans = math.ceil(k / 2.0) + 1
    else:
        ans = math.ceil(k / 2.0)
    print(ans)
 
def main():
    t = int(input())
    for _ in range(t):
        solution()
 
if __name__ == "__main__":
    main()