import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();
        //kiemTra dental
        double dental = b*b - 4*a*c;
        // nghiem
        double x1=(-b+Math.sqrt(dental))/(2*a);
        double x2=(-b-Math.sqrt(dental))/(2*a);


//Trường hợp a=0
        if(a==0){
            if(b<0 && c<0){
               System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 - "+(-c)+" = 0 vô nghiệm");
            }
            else if(b>0 && c>0){
                System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 + "+c+" = 0 vô nghiệm");
            }
            else if(b<0 && c==0){
                System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 "+c+" = 0 có vô số nghiệm ");
            }
            else if(b>=0 && c==0){
                System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 "+c+" = 0 có vô số nghiệm ");
            }
            else{
                System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 "+c+" = 0 có các nghiệm là: ");
                System.out.println("x1 = "+Math.sqrt(-c/b));
                System.out.println("x1 = "+(-Math.sqrt(-c/b)));
            }
        }
        // trường hợp a!=0
        else{
            //dental âm
            if(dental < 0 ){
                    if(b<0 && c<0){
                    System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 - "+(-c)+" = 0 vô nghiệm");
                }
                else if(b>=0 && c>=0){
                    System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 + "+c+" = 0 vô nghiệm");
                }
                else if(b>=0 && c<0){
                    System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 - "+(-c)+" = 0 vô nghiệm");
                }
                else{
                    System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 + "+c+" = 0 vô nghiệm");
                }
            }
            //dental == 0
            else if(dental == 0){
                // có nghiệm khác 0
               if(x1!=0){
                   if(b<0 && c<0){
                       System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                       System.out.println("x1 = "+Math.sqrt(x1));
                       System.out.println("x2 = "+(-Math.sqrt(x1)));
                   }
                    else if(b>=0 && c>=0){
                       System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 + "+c+" = 0 có các nghiệm là: ");
                       System.out.println("x1 = "+Math.sqrt(x1));
                       System.out.println("x2 = "+(-Math.sqrt(x1)));
                   }
                   else if(b>=0 && c<0){
                       System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                       System.out.println("x1 = "+Math.sqrt(x1));
                       System.out.println("x2 = "+(-Math.sqrt(x1)));
                   }
                   else{
                       System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 + "+c+" = 0 có các nghiệm là: ");
                       System.out.println("x1 = "+Math.sqrt(x1));
                       System.out.println("x2 = "+(-Math.sqrt(x1)));
                   }
               }
               // có nghiệm bằng 0
               else{
                   if(b<0 && c<0){
                       System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                       System.out.println("x = "+Math.sqrt(x1));
                   }
                    else if(b>=0 && c>=0){
                       System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 + "+c+" = 0 có các nghiệm là: ");
                       System.out.println("x = "+Math.sqrt(x1));
                   }
                   else if(b>=0 && c<0){
                       System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                       System.out.println("x = "+Math.sqrt(x1));
                   }
                   else{
                       System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 + "+c+" = 0 có các nghiệm là: ");
                       System.out.println("x = "+Math.sqrt(x1));
                   }
               }
            }
            else{
                // trường hợp không có nghiệm bằng 0
                if(x1 > 0 && x2 < 0){
                    if(b<0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+(-Math.sqrt(x1)));
                    }
                    else if(b>=0 && c>=0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 + "+c+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+(-Math.sqrt(x1)));
                    }
                    else if(b>=0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+(-Math.sqrt(x1)));
                    }
                    else{
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 + "+c+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+(-Math.sqrt(x1)));
                    }
                }
                else if(x1 < 0 && x2 > 0){
                    if(b<0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x2));
                        System.out.println("x2 = "+(-Math.sqrt(x2)));
                    }
                    else if(b>=0 && c>=0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 + "+c+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x2));
                        System.out.println("x2 = "+(-Math.sqrt(x2)));
                    }
                    else if(b>=0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x2));
                        System.out.println("x2 = "+(-Math.sqrt(x2)));
                    }
                    else{
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 + "+c+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x2));
                        System.out.println("x2 = "+(-Math.sqrt(x2)));
                    }
                }
                else if(x1 > 0 && x2 > 0){
                    if(b<0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+(-Math.sqrt(x1)));
                        System.out.println("x3 = "+Math.sqrt(x2));
                        System.out.println("x4 = "+(-Math.sqrt(x2)));
                    }
                    else if(b>=0 && c>=0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 + "+c+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+(-Math.sqrt(x1)));
                        System.out.println("x3 = "+Math.sqrt(x2));
                        System.out.println("x4 = "+(-Math.sqrt(x2)));
                    }
                    else if(b>=0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+(-Math.sqrt(x1)));
                        System.out.println("x3 = "+Math.sqrt(x2));
                        System.out.println("x4 = "+(-Math.sqrt(x2)));
                    }
                    else{
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 + "+c+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+(-Math.sqrt(x1)));
                        System.out.println("x3 = "+Math.sqrt(x2));
                        System.out.println("x4 = "+(-Math.sqrt(x2)));
                    }
                }
                else if(x1 < 0 && x2 < 0){
                    if(b<0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 - "+(-c)+" = 0 vô nghiệm");
                    }
                    else if(b>=0 && c>=0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 + "+c+" = 0 vô nghiệm");
                    }
                    else if(b>=0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 - "+(-c)+" = 0 vô nghiệm");
                    }
                    else{
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 + "+c+" = 0 vô nghiệm");
                    }
                }
                //trường hợp có nghiệm baằng 0
                else if(x1 ==0 && x2!=0){
                    if(b<0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+Math.sqrt(x2));
                        System.out.println("x3 = "+(-Math.sqrt(x2)));
                    }
                    else if(b>=0 && c>=0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 + "+c+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+Math.sqrt(x2));
                        System.out.println("x3 = "+(-Math.sqrt(x2)));
                    }
                    else if(b>=0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+Math.sqrt(x2));
                        System.out.println("x3 = "+(-Math.sqrt(x2)));
                    }
                    else{
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 + "+c+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+Math.sqrt(x2));
                        System.out.println("x3 = "+(-Math.sqrt(x2)));
                    }
                }
                else{
                    if(b<0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+Math.sqrt(x2));
                        System.out.println("x3 = "+(-Math.sqrt(x1)));
                    }
                    else if(b>=0 && c>=0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 + "+c+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+Math.sqrt(x2));
                        System.out.println("x3 = "+(-Math.sqrt(x1)));
                    }
                    else if(b>=0 && c<0){
                        System.out.println("=> Phương trình "+a+"x^4 + "+b+"x^2 - "+(-c)+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+Math.sqrt(x2));
                        System.out.println("x3 = "+(-Math.sqrt(x1)));
                    }
                    else{
                        System.out.println("=> Phương trình "+a+"x^4 - "+(-b)+"x^2 + "+c+" = 0 có các nghiệm là: ");
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+Math.sqrt(x2));
                        System.out.println("x3 = "+(-Math.sqrt(x1)));
                    }
                }
            }
        }
    }
}
