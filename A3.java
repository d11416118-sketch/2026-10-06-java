public class A3 {
    public static void main(String[] args) {
        star(20);
        star(20);
    }
    public static void star(int x) { 
        int i;
        for(i=1 ;i<=x ;i++){ 
            System.out.print("*");
        }
        System.out.println(); 
    }
}
