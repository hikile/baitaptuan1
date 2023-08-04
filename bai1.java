import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập độ dài của hình vuông: ");
        int n = scanner.nextInt();
        System.out.println("Kết quả: ");
        for(int i=1 ; i<=n ; i++)
        {
            System.out.print('*');
            if(i==n)
            {
                System.out.println(" ");
            }
        }
        for(int j=1 ; j<=n-2 ; j++) {
            for(int i=1 ; i<=n ; i++)
            {
                if(i==1)
                {
                    System.out.print('*');
                }
                else if(i==n)
                {
                    System.out.println('*');
                }
                else
                {
                    System.out.print(' ');
                }
            }
        }
        for(int i=1 ; i<=n ; i++)
        {
            System.out.print('*');
            if(i==n)
            {
                System.out.println(" ");
            }
        }
    }
}
