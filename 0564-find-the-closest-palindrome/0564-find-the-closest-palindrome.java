import java.util.ArrayList;

class Solution {
    public Boolean isPalindrome(String a) {
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse().toString().equals(a);
    }

    public String nearestPalindromic(String n) {
        int len = n.length();
        long num = Long.parseLong(n);
        
        // Edge cases
        if (num <= 10) return String.valueOf(num - 1);
        if (num == Math.pow(10, len - 1)) return String.valueOf(num - 1);

        // Generate candidate palindromes
        ArrayList<Long> candidates = new ArrayList<>();
        candidates.add((long) Math.pow(10, len - 1) - 1); // 99...9 (one digit less)
        candidates.add((long) Math.pow(10, len) + 1);     // 100...001 (one digit more)

        long prefix = Long.parseLong(n.substring(0, (len + 1) / 2));
        for (long i = -1; i <= 1; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(prefix + i));
            String palindromeCandidate = sb.append(new StringBuilder(sb.substring(0, len / 2)).reverse()).toString();
            candidates.add(Long.parseLong(palindromeCandidate));
        }

        // Find the closest palindrome
        long closest = -1;
        for (long candidate : candidates) {
            if (candidate == num) continue; // Skip if it's the same as input
            if (closest == -1 || 
                Math.abs(candidate - num) < Math.abs(closest - num) || 
                (Math.abs(candidate - num) == Math.abs(closest - num) && candidate < closest)) {
                closest = candidate;
            }
        }

        return String.valueOf(closest);
    }

    
}