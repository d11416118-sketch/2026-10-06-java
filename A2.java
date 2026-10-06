public class A2 {
     public static void main(String[] args) {
        star();
        star();
        System.out.println(star());
    }
    public static int star() { //void改int因為要return
        int i;//int i放外面
        for(i=1 ;i<=20 ;i++){ //改成給值
            System.out.print("*");
        }
        System.out.println(); //換行
        return (i-1);
    }
}
