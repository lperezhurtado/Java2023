public class C010Palindromo {
    public static void main(String[] args) {
        String str = "dabale arroz a la zorra el abad";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome);

    }
}
