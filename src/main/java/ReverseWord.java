public class ReverseWord {

    public static String reverse(String text){
        final char[] reversed = new char[text.length()];

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[text.length() - i - 1] = text.charAt(i);
        }

        return new String(reversed);
    }

    public static void main(String[] args) {
        System.out.println("Hello => " + reverse("Hello WORLD"));
    }
}
