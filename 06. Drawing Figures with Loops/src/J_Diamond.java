import java.util.Scanner;

public class J_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 2) {
            System.out.println(repeatStr("*", n));
        } else {
            if (n % 2 == 0){
                int starCount = 2;
                int sideDashesCount = (n - starCount) / 2;
                int middDashesCount = 0;

                for (int i = 0; i < n / 2; i++) {
                    String sideDashes = repeatStr("-", sideDashesCount);
                    String middDashes = repeatStr("-", middDashesCount);
                    System.out.printf("%s*%s*%s%n", sideDashes, middDashes, sideDashes);

                    sideDashesCount--;
                    middDashesCount += 2;
                }

                sideDashesCount += 2;
                middDashesCount -= 4;

                for (int i = 0; i < n / 2 - 1; i++) {
                    String sideDashes = repeatStr("-", sideDashesCount);
                    String middDashes = repeatStr("-", middDashesCount);
                    System.out.printf("%s*%s*%s%n", sideDashes, middDashes, sideDashes);

                    sideDashesCount++;
                    middDashesCount -= 2;
                }
            } else {
                int sideDashesCount = (n - 1) / 2;

                System.out.printf("%s*%s%n", repeatStr("-", sideDashesCount),
                        repeatStr("-", sideDashesCount) );

                int middleDashesCount = 1;

                for (int i = 1; i <= (n - 1) / 2; i++) {
                    sideDashesCount--;
                    System.out.printf("%s*%s*%s%n",
                            repeatStr("-", sideDashesCount),
                            repeatStr("-", middleDashesCount ),
                            repeatStr("-", sideDashesCount));
                    middleDashesCount+= 2;
                }

                middleDashesCount-= 4;
                sideDashesCount++;

                for (int i = 1; i < (n - 1) / 2; i++) {
                    System.out.printf("%s*%s*%s%n",
                            repeatStr("-", sideDashesCount),
                            repeatStr("-", middleDashesCount ),
                            repeatStr("-", sideDashesCount));
                    middleDashesCount-= 2;
                    sideDashesCount++;
                }

                System.out.printf("%s*%s%n", repeatStr("-", sideDashesCount),
                        repeatStr("-", sideDashesCount) );
            }
        }
    }
    public static String repeatStr (String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
