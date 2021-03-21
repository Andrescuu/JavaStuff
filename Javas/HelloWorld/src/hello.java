public class hello {

    public static String testing(){
        return "This is a test";
    }

    public static int squared(int x){
        return x*x;
    }

    public static void main(String[] args) {

        String text = testing();
        int testNum = squared(6);

        System.out.println(text);
        System.out.println(testNum);



    }

}
