package PatternProgramForPractice;

public class Demo12 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int space = 0; space <i ; space++) {
                System.out.print(" ");
            }
                for (int colomn = 5; colomn >=i; colomn--) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
