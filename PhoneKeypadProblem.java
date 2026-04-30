import java.util.*;

class Solution {

    static Map<Character, String> map = new HashMap<>();

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(0, digits, "", result);
        return result;
    }

    static void backtrack(int index, String digits, String current, List<String> result) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = map.get(digits.charAt(index));

        for (char ch : letters.toCharArray()) {
            backtrack(index + 1, digits, current + ch, result);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("35"));
    }
}
