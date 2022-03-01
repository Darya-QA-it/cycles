package itstep;

public class bar3 {
    public static void main(String[] args) {
        for ( int i=-2; i<10;i++){
            i+=2;
            System.out.print(i);
            System.out.print(",");
            i--;
            System.out.print(i);
            System.out.print(",");
        }
    }
}
