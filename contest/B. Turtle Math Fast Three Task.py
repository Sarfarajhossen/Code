#https://codeforces.com/contest/1933/problem/B
#B. Turtle Math: Fast Three Task..
def fun():
    a = int(input())
    arr = list(map(int, input().split()))
    total_sum = sum(abs(x) for x in arr)

    if total_sum % 3 == 0:
        print("0")
        return

    for i in range(a):
        if (total_sum - arr[i]) % 3 == 0:
            print("1")
            return

    if (total_sum + 1) % 3 == 0:
        print("1")
        return

    print("2")

def main():
    t = int(input())
    for _ in range(t):
        fun()

if __name__ == "__main__":
    main()
'''''
#some test case isn't working here.
def min_moves_to_divisible_by_3(arr):
    total_sum = sum(arr)
    remainder = total_sum % 3

    if remainder == 0:
        return 0

    one_remainder = [i for i in arr if i % 3 == 1]
    two_remainder = [i for i in arr if i % 3 == 2]

    one_remainder.sort()
    two_remainder.sort()

    if remainder == 1:
        if len(one_remainder) >= 1:
            return 1
        elif len(two_remainder) >= 2:
            return 2
    elif remainder == 2:
        if len(two_remainder) >= 1:
            return 1
        elif len(one_remainder) >= 2:
            return 2

    return -1  # This case should not be reached

# Read the number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    # Read the number of elements in the array
    n = int(input())

    # Read the array elements
    arr_input = list(map(int, input().split()))

    # Calculate and print the result for each test case
    result = min_moves_to_divisible_by_3(arr_input)
    print(result)
'''''