public class Main {
    public static void main(String[] args) {
        String name = "Jaret";
        for (int i=name.length()-1; i>=0;--i)
        {
            System.out.print(name.charAt(i));
        }

//        for(int i=0; i<=100; i=i+10)
//        {
//            //%d is a placeholder for a number in base 10 (i.e. int)
//            //%s is a placeholder for a String
//            //%n is a new line character
//            System.out.printf("%3d %s %n",i, (i%20 == 0)?"Java":"");
//        }
    }
}