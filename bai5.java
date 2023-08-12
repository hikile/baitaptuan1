import java.util.Scanner;

public class bai5 {
   static Scanner sc= new Scanner(System.in);

    public static String formatName(String name) {
        name = name.toLowerCase();
        String ans="";
        boolean check= true;
        for (int i=0 ; i<name.length() ; i++) {
            if (name.charAt(i)==' ') {
                check = true;
            } else if (check && ans.length()==0) {
                ans+=name.toUpperCase().charAt(i);
                check = false;
            }else if(check && ans.length()>0){
                ans+=" "+name.toUpperCase().charAt(i);
                check=false;
            }
            else {
                ans+=name.charAt(i);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Nhập vào một chuỗi tên: ");
        String name = sc.nextLine();
        System.out.println("Kết quả: " + formatName(name));
    }
}
