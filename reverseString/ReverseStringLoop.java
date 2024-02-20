package reverseString;

public class ReverseStringLoop {
    public static String execute(String string) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--)
            stringBuffer.append(string.charAt(i));
        return stringBuffer.toString();
    }

}
