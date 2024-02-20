///https://codeforces.com/contest/1926/problem/B
//B. Vlad and Shapes...
#include <iostream>
#include <vector>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while (t > 0) {
        int n;
        cin >> n;
        vector<vector<int>> arr(n, vector<int>(n, 0));
 
        vector<string> li;
 
        for (int i = 0; i < n; i++) {
            string s;
            cin >> s;
            li.push_back(s);
            for (int j = 0; j < n; j++) {
                char c = s[j];
                if (c == '1') {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
 
        int Result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (arr[i][j] == 1) {
                    if (arr[i][j - 1] == 0 && arr[i][j + 1] == 0) {
                        Result = 1;
                        break;
                    }
                }
            }
        }
        ///output ..
        if (Result == 1) {
            cout << "TRIANGLE" << endl;
        } else {
            cout << "SQUARE" << endl;
        }
 
        t--;
    }
 
    return 0;
}