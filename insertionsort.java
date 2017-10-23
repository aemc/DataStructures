public static void insertionSort(char[] data) {
    int n = data.length;
    for (int k = 1; k < n; k++) {
        char curr = data[k];
        int j = k;
        while (j > k && data[j-1] > cur) {
            data[j] = data[j-1];
            j--;
        }
        data[j] = cur;
    }
}
