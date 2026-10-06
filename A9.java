import java.util.Scanner;

public class A9 {
     public static void main(String[] args) {
        int n;
        n =input();
       for(int i=1;i<=n;i++){
            star(n-i,'#');
            star(i);
       }
    }
    public static void star(int x,char c) { 
        int i;

        for(i=1 ;i<=x ;i++){ 
            System.out.print(c);
        }
        
    }
    public static void star(int x){
        int i;
        for(i=1;i<=x;i++){
            System.out.print(i);
       }
       System.out.println();
    }
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入要跑幾遍");
        return  sc.nextInt();
    }
}
