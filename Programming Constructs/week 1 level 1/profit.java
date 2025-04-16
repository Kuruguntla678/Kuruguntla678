public class profit{
    public  static void main(String[] args) {
        double sellingprice=191;
        double actualprice=129;
        double profit=sellingprice - actualprice;
        double profitpercentage=(profit/actualprice) * 100;
        System.out.println("The actualPrice is INR" + actualprice + " and Selling Price is INR " + sellingprice + "\n" + " The Profit is INR " + profit + " and the Profit Percentage is " + profitpercentage + "%");

    }
}