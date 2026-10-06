public class A6 {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++){
            star(i);
       }
    }
    public static void star(int x) { 
        int i;
        for(i=1 ;i<=x ;i++){ 
            System.out.print(i);
        }
        System.out.println(); 
    }
}
