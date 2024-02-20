package reverseString;

public class ReverseStringJavaApi {


    public static String execute(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        return stringBuffer.reverse().toString();
    }

}
