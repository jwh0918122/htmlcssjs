package Day17;

public class GoldCustomer extends Customer{
public GoldCustomer() {}
public GoldCustomer(int customerID, String customerName) {
super(customerID, customerName);
super.customerGrade = "Gold";
super.bonusRatio = 0.02;
}

@Override
public void calcPrice(int price) {
price = (int)(price-(price*0.1));
super.calcPrice(price);
}

@Override
public void customerInfo() {
// TODO Auto-generated method stub
super.customerInfo();
}



}