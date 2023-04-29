package PatternProgramForPractice;

public class demo11 {
    public static void main(String[] args) {
        for (int row = 1; row <=5 ; row++) {
            for (int spaces = row; spaces <=5; spaces++) {
                System.out.print(" ");
            }
            for (int col =1; col <=row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        }
}

