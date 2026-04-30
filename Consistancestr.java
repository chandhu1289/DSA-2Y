import java.util.Scanner;

public class Consistancestr {

    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCase; i++) {
            String str = sc.nextLine();
            int[] freq = new int[26];
            int vowel = 0;
            int consonant = 0;

            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char upperCh = Character.toUpperCase(ch);
                    freq[upperCh - 'A']++;
                    if (isVowel(upperCh))
                        vowel++;
                    else
                        consonant++;
                }
            }

            int ans = Integer.MAX_VALUE;

            for (char j = 'A'; j <= 'Z'; j++) {
                int count = freq[j - 'A'];
                int cost;

                if (isVowel(j)) {
                    cost = consonant * 1 + (vowel - count) * 2;
                } else {
                    cost = vowel * 1 + (consonant - count) * 2;
                }

                ans = Math.min(ans, cost);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
