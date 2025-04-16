public class fee {

    public static void main(String[] args) {
        int fee=125000;
        int discountpercentage=10;
        double discountamount=(fee * discountpercentage)/100;
        double discountedfee=fee - discountamount;
        System.out.println("The discount amount is INR" + " and final discounted fee is INR:\n" + discountamount + "," + discountedfee); 
    }
}