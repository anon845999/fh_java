public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Gen<Integer,String> myGen = new Gen<Integer,String>();
        String type = "String";
        String g = myGen.get(type);
        System.out.println(g);






    }



}