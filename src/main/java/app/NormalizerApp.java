package app;


public class NormalizerApp {
    public static void main(String[] args) {
        Normaliser normaliser = new Normaliser();

        String test1 = "java Engineer";
        String test2 = "java software";
        String test3 = "C# data scients";
        String test4 = "Quantity tester";

        System.out.println(normaliser.normalise(test1));
        System.out.println(normaliser.normalise(test2));
        System.out.println(normaliser.normalise(test3));
        System.out.println(normaliser.normalise(test4));
    }
}
