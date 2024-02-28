#https://codeforces.com/contest/1933/problem/D
#D. Turtle Tenacity: Continual Mods..
t = int(input())

for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    string = {}

    for num in arr:
        if num not in string:
            string[num] = 1
        else:
            string[num] += 1

    if list(string.values())[0] == 1:
        print("YES")
        continue

    v = list(string.keys())

    if len(v) == 1:
        print("NO")
        continue

    flag = True
    for i in range(1, len(v)):
        if v[i] % v[0] != 0:
            print("YES")
            flag = False
            break

    if flag:
        print("NO")


''''
#failed in second test case..
t = int(input())#number of test case

for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    string = {}

    # Count the unique element in the array
    for num in arr:
        string[num] = string.get(num, 0) + 1

    if list(string.values())[0] == 1:
        print("YES")
    elif len(string) == 1:
        print("NO")
    else:
        v = list(string.keys())
	      # Check if elements
        flag = all(val % v[0] != 0 for val in v[1:])
        print("YES" if flag else "NO")
''''