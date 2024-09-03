class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }

        int sum = 0;
        String numericString = sb.toString();
        for (char c : numericString.toCharArray()) {
            sum += c - '0';
        }

        for (int i = 1; i < k; i++) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
        }

        return sum;
    }
}
