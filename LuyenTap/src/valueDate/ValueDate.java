package valueDate;

import java.util.Scanner;

public class ValueDate {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    static Scanner scanner = new Scanner(System.in);

    public static String valueDateString(String regex) {
        while (true) {
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            }
            System.out.println("Sai định dạng vui lòng chọn lại");
        }
    }

    public static int valueDateNumber(String regex) {
        while (true) {
            String choice = scanner.nextLine();
            if (choice.matches(regex)) {
                return Integer.parseInt(choice);
            } else {
                System.out.println(" sai định dạng vui lòng chọn lại ");
            }
        }
    }
}