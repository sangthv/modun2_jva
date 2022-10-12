package valueDate;

import java.util.Scanner;

public class Validate {
    public static final String REGEX_STRING = "[A-Z][\\sA-Za-z]+";
    public static final String REGEX_NO_EMPTY= "^(?=\\s*\\S).*$";
    public static final String REGEX_ACCOUNT = "[A-Za-z0-9]{5,10}";
    public static final String REGEX_NUMBER = "[0-9]{2,8}";
    public static final String REGEX_NUM = "[0-9]+";
    static Scanner scanner = new Scanner(System.in);

    public static String valiDateAccount(String regex) {
        while (true) {
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            }
            System.err.println("bạn đã nhập sai tài khoản, đăng nhập lại :");
        }
    }

    public static String valiDatePassWord(String regex) {
        while (true) {
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            }
            System.err.println("nhập sai rồi , phải nhập từ 3 số trở lên:");
        }
    }
    public static String valiDateInPut(String regex) {
        while (true) {
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            }
            System.out.println("phải nhập vào không được để trống ");
        }
    }
}
