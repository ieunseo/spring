import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        Map<Character, Integer> charCount = new HashMap<>();

        // magazine에 있는 문자 수 count
        for (char c : magazine.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        // ransomNote가 요구하는 문자 확인 후 magazine 이랑 비교
        for (char c : ransomNote.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; 
            }
            int countAfter = charCount.get(c) - 1;
            if (countAfter < 0) return false; // 부족하면 실패
            charCount.put(c, countAfter);
        }

        return true;
    }
}
