package reverseString;

public class ReverseStringSwap {
    public static String execute(String string) {
        var arrayReversed = string.toCharArray();

        int lastIndex = string.length() - 1;
        for (int i = 0; i < string.length() / 2; i++) {
            arrayReversed[i] = string.charAt(lastIndex);
            arrayReversed[lastIndex] = string.charAt(i);
            lastIndex--;
        }

        return String.valueOf(arrayReversed);
    }

}
