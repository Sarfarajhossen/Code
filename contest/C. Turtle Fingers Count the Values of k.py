#https://codeforces.com/contest/1933/problem/C
#C. Turtle Fingers: Count the Values of k..
#wrong answer.🥲
from math import gcd

def find_k_values(a, b, l):
    gcd_ab = gcd(a, b)
    lcm_ab = (a * b) // gcd_ab

    if l % gcd_ab != 0 or lcm_ab > l:
        return 0

    l //= gcd_ab

    factors = factorize(l)

    unique_factors = set(factors)

    count = 1
    for factor in unique_factors:
        count *= factors.count(factor) + 1

    return count

def factorize(num):
    factors = []
    divisor = 2

    while divisor * divisor <= num:
        while num % divisor == 0:
            factors.append(divisor)
            num //= divisor
        divisor += 1

    if num > 1:
        factors.append(num)

    return factors

# Read the number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    # Read a, b, and l for each test case
    a, b, l = map(int, input().split())

    # Calculate and print the result for each test case
    result = find_k_values(a, b, l)
    print(result)
