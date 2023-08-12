import java.util.Scanner;

public class bai3 {
    static Scanner sc = new Scanner(System.in);
    static void sapXep(int n , int [] a){
        for(int i=0 ; i<n ;i++){
            System.out.print("a["+i+"] = ");
            a[i]= sc.nextInt();
        }
        for(int i=0 ; i<n ;i++){
            for(int j=i+1 ; j<n ; j++){
                if(a[i]>a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        System.out.print("mảng sau khi sắp xếp là: ");
        for(int i=0 ; i<n ;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.print("nhập số lượng phần từ: ");
        int n=sc.nextInt();
        int [] a =new int[n];
        sapXep(n,a);
    }
}
