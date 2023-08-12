import java.util.Scanner;

public class bai2 {
    public static Scanner sc = new Scanner(System.in);

  static void them(int n, int []a){
      System.out.print("nhập vị trí cần thêm: ");
      int index = sc.nextInt();
      if(index >n || index <=0){
          System.out.println("vị trí cần thêm không hợp lệ");
      }
      else {
          System.out.print("nhập số cần thêm: ");
          int x = sc.nextInt();
          for (int i = n; i > index - 1; i--) {
              a[i] = a[i - 1];
          }
          n++;
          a[index - 1] = x;
          System.out.print("mảng sau khi thêm phần tử là: ");
          for (int i = 0; i < n; i++) {
              System.out.print(a[i] + " ");
          }
      }

    }
    static void xoa(int n, int []a){
        System.out.print("nhập vị trí cần xóa: ");
        int index = sc.nextInt();
        if(index >n || index <=0){
            System.out.println("vị trí cần thêm không hợp lệ");
        }
        else {
            for (int i = index - 1; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            n--;
            System.out.print("mảng sau khi xóa là : ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
      System.out.print("nhập vào số lượng phần tử: ");
      int n=sc.nextInt();
      int [] a =new int[n+5];
      for(int i=0 ;i<n ;i++){
          System.out.print("nhập vào phần tử thứ "+(i+1)+" : ");
          a[i]=sc.nextInt();
      }
      them(n,a);
        System.out.print("nhập vào số lượng phần tử: ");
        int x=sc.nextInt();
        int [] b =new int[x+5];
        for(int i=0 ;i<x ;i++){
            System.out.print("nhập vào phần tử thứ "+(i+1)+" : ");
            b[i]=sc.nextInt();
        }
      xoa(x,b);
    }
}
