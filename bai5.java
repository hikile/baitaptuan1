import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chanh: ");
        int chanh = scanner.nextInt();
        System.out.print("Táo: ");
        int tao = scanner.nextInt();
        System.out.print("Lê: ");
        int le = scanner.nextInt();

        int kiemTra=0;
        while(chanh > 0 && tao > 1 && le > 3 ){
            chanh-=1;
            tao-=2;
            le-=4;
            kiemTra++;
        }
        System.out.println("");
        System.out.println(" => Tổng số quả tối đa: "+kiemTra*7+" (Chanh: "+kiemTra+", Táo: "+kiemTra*2+", Lê: "+kiemTra*4+" )");
    }
}
