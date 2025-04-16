public class volume {

    public static void main(String[] args) {
        int radiuskm=6378;
        double pi=Math.PI;
        double volumeinkm3=(4/3) * pi * Math.pow(radiuskm,3);
        double volumeinmile3= volumeinkm3 * 0.239913;
        System.out.println("The volume of earth in cubic kilometers and cubic miles is\n" + volumeinkm3 + "," + volumeinmile3);

    }
}