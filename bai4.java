import java.util.Scanner;

public class bai4 {
    static Scanner sc=new Scanner(System.in);
    static boolean doiXung(String s){
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("nhập chuỗi : ");
        String s= sc.nextLine();
        System.out.println(doiXung(s));
    }
}
