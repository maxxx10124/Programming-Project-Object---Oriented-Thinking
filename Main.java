public class Main {
    public static void main(String[] args){
        Time t1 = new Time();
        Time t2 = new Time(555550000);
        Time t3 = new Time(5, 23, 55);
        System.out.print(t1 + "\n" + t2 + "\n" + t3);
    }
}
