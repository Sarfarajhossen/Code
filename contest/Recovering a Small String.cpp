///https://codeforces.com/contest/1931/problem/A
#include <iostream>

using namespace std;

string FromEncoding(int n) {
    for (int i = 1; i <= 26; ++i) {
        for (int j = 1; j <= 26; ++j) {
            for (int k = 1; k <= 26; ++k) {
                if (i + j + k >= n) {
                    return string(1, char(i + 'a' - 1)) +
                           string(1, char(j + 'a' - 1)) +
                           string(1, char(k + 'a' - 1));
                }
            }
        }
    }
    return "";  // This line should not be reached
}

int main() {
    int t;
    cin >> t;

    for (int i = 0; i < t; ++i) {
        int n;
        cin >> n;

        string result = FromEncoding(n);
        cout << result << endl;
    }

    return 0;
}
