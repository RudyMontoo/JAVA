class Solution {

    public String reverseWords(String s) {

        char[] arr = s.trim().replaceAll("\\s+", " ").toCharArray();

        // Reverse entire string
        reverse(arr, 0, arr.length - 1);

        // Reverse each word
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {

            if (i == arr.length || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }

        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}