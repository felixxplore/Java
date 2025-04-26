package InnerClasses;


class Order{
    private String id;
    private double totalAmount;

    public Order(String id, double totalAmount){
        this.id=id;
        this.totalAmount=totalAmount;
    }

    public void processOrder(double discountRate){

        class DiscountCalculator{
            private double rate;

            DiscountCalculator(double rate){
                this.rate=rate;
            }
            public double calculateDiscount(){
                double discount=totalAmount * rate;
                System.out.println("orderId :"+id+" discount  rate : "+discountRate +"% so discount is : "+discount);
                return discount;
            }
        }

        DiscountCalculator cal=new DiscountCalculator(discountRate);
        System.out.println("Without discount order price : "+totalAmount);
        double finalPrice=totalAmount-cal.calculateDiscount();
        System.out.println("Final amount of order Id with discount: "+finalPrice);
    }
}


public class LocalInnerClass {
    public static void main(String[] args) {

        Order o1=new Order("001",1000);
        o1.processOrder(0.2); // give 20% discount okay
    }
}
