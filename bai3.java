import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập số nguyên dương n: ");
             n = new Scanner(System.in).nextInt();
        }while(n<=0);

        boolean check=true;
        for(int i=2 ; i*i<=n ; i++){
            if(n%i==0){
                check=false;
                break;
            }
        }
        System.out.println("Kết quả: " );
        if(check && n>=2){
            System.out.println(n + " là sô nguyên tố " );
        }
        else{
            System.out.println(n + " không phải là sô nguyên tố " );
        }
    }
}
