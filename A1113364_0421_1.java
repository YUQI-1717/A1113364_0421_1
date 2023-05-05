import java.util.*;

public class A1113364_0421_1{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("請輸入電子郵件信箱:");
        String email;
        email=sc.nextLine();

        if (email.matches("[a-z]+@[a-z]+\\.[a-z]{2,}")){
            System.out.println("電子郵件信箱格式正確!");
        }else{
            System.out.println("電子郵件信箱格式錯誤，請重新輸入!");
        }
        }

    }
