import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số nguyên n:  ");
        int n = scanner.nextInt();
        double tongBieuThuc=0;
        for(int i=1 ; i<=n ;i++){
            tongBieuThuc+=1.0/i;
        }
        System.out.println("Kết quả phép tính 1: "+tongBieuThuc);

        long tongGiaiThua=0;
        for(int i=1 ; i<=n ;i++){
            int gt=1;
            for(int j=1 ; j<=i ;j++){
                gt=gt*j;
            }
            tongGiaiThua+=gt;
        }
        System.out.println("Kết quả phép tính 2: "+tongGiaiThua);
    }
}
