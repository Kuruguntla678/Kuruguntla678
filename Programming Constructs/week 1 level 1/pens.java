public class pens {

    public static void main(String[] args) {
        int totalpens=14;
        int totalstudents=3;
        int pensperstudent=(totalpens / totalstudents);
        int remainingpens=(totalpens % totalstudents);
        System.out.println("The Pen Per Student is\n" + pensperstudent + "\n" + "and the remaining pen not distributed is\n" + remainingpens);
    }
}