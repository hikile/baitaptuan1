import java.util.Scanner;

public class bai1 {
    static  void tsuat(int n, int [] arr1,int [] arr2 ){
        for(int i=0 ; i<n ; i++){
            System.out.print("nhập phần tử thứ "+(i+1)+": ");
            arr1[i]=new Scanner(System.in).nextInt();
            arr2[i]=-1;
        }
        for(int i=0 ; i<n ;i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr1[i]>arr1[j]){
                    int tmp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=tmp;
                }
            }
        }
        for(int i=0 ; i<n ;i++){
            int dem=1;
            for(int j=i+1 ; j<n ;j++){
                if(arr1[i]==arr1[j]){
                    dem++;
                    arr2[j]=0;
                }
            }
            if(arr2[i]!=0)
            {
                arr2[i]=dem;
            }
        }
        for(int i=0 ; i<n ;i++){
            if(arr2[i]>0){
                System.out.println("số "+arr1[i]+ " xuất hiện : "+arr2[i]+" lần");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n=sc.nextInt();
        int [] arr1=new int[n];
        int [] arr2=new int[n];
        tsuat(n,arr1,arr2);
    }
}
