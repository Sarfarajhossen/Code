#https://codeforces.com/contest/1926/problem/A
#Vlad and best five
 
t = int(input())
 
for _ in range(t):
    sum = input()
    count_A = sum.count('A')
    count_B = sum.count('B')
 
    if count_A > count_B:
        print('A') 
    else:
        print('B')