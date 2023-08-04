import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        boolean check=true;
        for(int i=2 ; i*i<=n ; i++){
            if(n%i==0){
                check=false;
                break;
            }
        }
        System.out.println("Kết quả: " );
        if(check){
            System.out.println(n + " là sô nguyên tố " );
        }
        else{
            System.out.println(n + " không phải là sô nguyên tố " );
        }
    }
}
