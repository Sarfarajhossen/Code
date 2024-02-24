#https://codeforces.com/contest/1923/problem/A
#A. Moving Chips..
import math
''''
def prime(a):
    for i in range(2, int(math.sqrt(a)) + 1):
        if a % i == 0:
            return False
    return True

def lcm(a, b):
    return a * b // math.gcd(a, b)

def f(a):
    if a == 0:
        return 0
    elif a == 1:
        return 1
    else:
        return f(a - 1) + f(a - 2)

def fact(a):
    ans = 1
    for i in range(1, a + 1):
        ans *= i
    return ans

def power(n, k):
    if k == 0:
        return 1
    elif k % 2 == 0:
        x = power(n, k // 2)
        return x * x
    else:
        return n * power(n, k - 1)

def m_Div(a):
    for i in range(2, int(math.sqrt(a)) + 1):
        if a % i == 0:
            return i
    return a

def num_sum(a):
    _sum = 0
    for i in str(a):
        _sum += int(i)
    return _sum

def b_swap(a, b):
    cnt = 0
    c = a ^ b
    while c != 0:
        cnt += c & 1
        c = c >> 1
    return cnt

def to_binary(a):
    ans = ""
    for i in range(a, 0, -1):
        ans += str(i % 2)
    return ans[::-1]

def inv(a):
    if a > 0:
        return a * -1
    else:
        return abs(a)

def marh_1(x1, y1, x2, y2):
    return math.sqrt((x1 - x2)**2 + (y1 - y2)**2)
'''''
def run_code():
    a = int(input())
    arr = list(map(int, input().split()))
    ans = 0
    x = arr.index(1)
    y = len(arr) - 1 - arr[::-1].index(1)
    for i in range(x, y + 1):
        ans += (arr[i] == 0)
    print(ans)

if __name__ == "__main__":
    t = 1
    t = int(input())
    for _ in range(t):
        run_code()
