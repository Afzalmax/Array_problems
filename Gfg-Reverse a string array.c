// Initial Template for C
#include <stdio.h>
#include <string.h>

// User function Template for C
char* reverseWord(char* s) {
    int length = strlen(s);
    for (int i = 0; i < length / 2; i++) {
        char temp = s[i];
        s[i] = s[length - 1 - i];
        s[length - 1 - i] = temp;
    }
    return s;
}

// Driver Code Starts.
char* reverseWord(char* s);

int main() {
    int t;
    scanf("%d", &t);
    while (t--) {
        char s[100001];
        scanf("%s", s);
        printf("%s\n", reverseWord(s));
    }
    return 0;
}
// Driver Code Ends
