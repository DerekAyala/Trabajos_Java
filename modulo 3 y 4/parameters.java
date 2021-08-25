public class parameters {
    public static void main(String[] args) {
        recepi(3, 2, 1, 2, "chocolate chip", 10, 350);
    }

    public static void recepi(int Cups, int eggs,int Cupssugar,int CupsFavor, String Favor, int time, int degrees) {
        System.out.println("Recipe for baking " + Favor + " cookies");
        System.out.println(Cups + "  Cups flour");
        System.out.println(eggs + " Eggs");
        System.out.println(Cupssugar + " cup sugar");
        System.out.println(CupsFavor + " Cups "+ Favor);
        System.out.println("Mix all in a bowl, bake for "+ time + " minutes");
        System.out.println("at " + degrees + " degrees");
    }
}