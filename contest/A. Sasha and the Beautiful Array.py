#https://codeforces.com/contest/1929/problem/A
def max_beauty(t, test_cases):
    results = []
    for case in test_cases:
        n = case[0]
        arr = sorted(case[1])
 
        beauty = 0
        for i in range(1, n):
            beauty += arr[i] - arr[i-1]
 
        results.append(beauty)
 
    return results
 
# Input reading
t = int(input())
test_cases = []
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    test_cases.append((n, a))
 
# Calculate and print results
results = max_beauty(t, test_cases)
for res in results:
    print(res)