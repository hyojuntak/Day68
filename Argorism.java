package JC.Day68;

import java.util.Scanner;

public class Algorism {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] nk = new int[2];
        int n = 0;
        int m = 0;
        int maximum = 10001;


        for (int i = 0; i < 2; i++) {
             nk[i] = sc.nextInt();
        }

        n = nk[0];
        m = nk[1];

        

        int [] money_list = new int [n];
        for (int i = 0; i < money_list.length; i++) {
            money_list[i] = sc.nextInt();
        }


        int [] d = new int [(m+1)];
        for (int i = 0; i < d.length; i++) {
            d[i] = maximum;
        }

        d[0] = 0;
        
        int money_min = money_list[0]; 
        for (int i = 1; i < money_list.length; i++) {
            if(money_list[i]<money_min)
                money_min = money_list[i];
        }
        
        d[money_min] = 1;

        for (int i = money_min; i < m+1;i++) {
            for (int j = 0; j < money_list.length;j++) {
                if (i-money_list[j]<0) 
                    break;
                else
                    d[i] = Math.min(d[i], d[i-money_list[j]]+1);
                    //System.out.println(d[i]);
                
            }
        }

        if(d[m] == maximum)
            System.out.println(-1);
        else
            System.out.println(d[d.length-1]);

       
    }
}
