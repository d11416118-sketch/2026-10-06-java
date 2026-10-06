public class A4 {
    public static void main(String[] args) {
        star(1);
        star(2);
        star(3);
        star(4);
        star(5);
        star(6);
    }
    public static void star(int x) { 
        int i;
        for(i=1 ;i<=x ;i++){ 
            System.out.print("*");
        }
        System.out.println(); 
    }
}
