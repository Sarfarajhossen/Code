#https://codeforces.com/contest/1926/problem/C
#C. Vlad and a Sum of Sum of Digits
t = int(input())
 
for _ in range(t):
    n = int(input())
 
    # Function to calculate the sum
    def Fsum(num):
        s = 0
        while num:
            s += num % 10
            num //= 10
        return s
 
    result = sum(Fsum(i) for i in range(1, n + 1))
 
    # Print result
    print(result)
"""
#C. Vlad and a Sum of Sum of Digits..
t = int(input())
 
for _ in range(t):
    n = int(input())
 
    # Function for  calculate the sum of digits
    def Fsum(num):
        return sum(int(digit) for digit in str(num))
    # calculate the exual result
    result = sum(Fsum(i) for i in range(1, n+1))
    
    #print result...
    print(result)
"""