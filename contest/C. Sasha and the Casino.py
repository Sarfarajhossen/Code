#https ://codeforces.com/contest/1929/problem/C..

def next_bet(cur_loss, k):
    return (cur_loss + k - 1) // (k - 1)

def main():
    t = int(input())
    
    for _ in range(t):
        k, x, a = map(int, input().split())
        
        u = 0
        ok = 1

        for i in range(x):
            v = next_bet(u, k)
            u += 1 if v == 0 else v
            ok = u <= a

        print("YES" if k * (a - u) > a else "NO")

if __name__ == "__main__":
    main()
