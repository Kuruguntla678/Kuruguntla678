public class miles{
    public static void main(String[] args){
        double distanceinkilometers=10.8;
        double covertionfactorkmtomiles=1.6;
        double distanceinmiles=(distanceinkilometers * covertionfactorkmtomiles);
        System.out.println("The distance\n" + distanceinkilometers + "km in miles:" + distanceinmiles );
    }
}