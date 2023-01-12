public class Main {
    public static void main(String[] args) {
        for(int i=0; i<=100; i=i+10)
        {
            //%d is a placeholder for a number in base 10 (i.e. int)
            //%s is a placeholder for a String
            //%n is a new line character
            System.out.printf("%3d %s %n",i);
        }
    }
}