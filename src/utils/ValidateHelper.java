package utils;

public class ValidateHelper {
    public static boolean checkValue(String value, String data){
        return value.isEmpty() && !data.isEmpty();
    }

    public static boolean checkValue(int value, String data){
        return checkValue("" + value, data);
    }

}
