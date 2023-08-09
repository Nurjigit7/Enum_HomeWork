import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                String s = scan.nextLine();
                if (s.equalsIgnoreCase("0")) {
                    break;
                }

                Days days = Days.valueOf(s.toUpperCase(Locale.ROOT));
                switch (days) {
                    case MONDAY -> System.out.println("Жава окуйм жаны сабак");
                    case TUESDAY -> System.out.println("Англис тили сабагын окуйм");
                    case WEDNESDAY -> System.out.println("Теориялык сабак окуйм ");
                    case THURSDAY -> System.out.println("Практикалык сабак окуйм ");
                    case FRIDAY -> System.out.println("Жаны-тил уйроном");
                    case SATURDAY -> System.out.println("Практикалык сабак окуйм");
                    case SUNDAY -> System.out.println("Дем алуу куну");
                }
                System.out.println("===Токтотту учун 0 ду басыныз ==\n" +
                        "=== Улантуу учун сан жазыныз==>");

            } catch (IllegalArgumentException s) {
                System.out.println("Туура эмес сан жаздыныз!!!");
            }
        }
    }
}