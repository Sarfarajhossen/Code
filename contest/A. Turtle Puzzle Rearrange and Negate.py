#https://codeforces.com/contest/1933/problem/A
#A. Turtle Puzzle: Rearrange and Negate

def Max_Sum(arr):
    neg = [x for x in arr if x < 0]

    if len(neg) % 2 == 1:
        Min_neg = min(neg)
        arr[arr.index(Min_neg)] = -Min_neg

    arr = [-x if x < 0 else x for x in arr]

    return sum(arr)

# number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    n = int(input())

    arr_input = list(map(int, input().split()))
    # Calculate
    result = Max_Sum(arr_input)
    print(result)
