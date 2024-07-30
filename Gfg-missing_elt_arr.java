public static int missingNumber(int n, int[] arr)
    {
        
        int[] hash = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }
