package PatternProgramForPractice;

public class Demo3 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 5; j >=i ; j--)
            {
                // 1) System.out.print(+i);
               /* 2) System.out.print(+j);
                System.out.print("*");*/
                System.out.print("*");
                System.out.print(+i);
               // System.out.print("*");
                //System.out.print(+j);
                                                            /*11111    54321   5*4*3*2*1    *1*1*1*1*1   *5*5*5*5*5
                                                              2222     5432    5*4*3*2*     *2*2*2*2     *4*4*4*4
                                                              333      543     5*4*3*       *3*3*3       *3*3*3
                                                              44       54      5*4          *4*4         *2*2
                                                              5        5       5*           *5          *1       */
            }
            System.out.println();
        }
    }
}
