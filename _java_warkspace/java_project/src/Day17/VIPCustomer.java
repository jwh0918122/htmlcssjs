package Day17;

public class VIPCustomer extends Customer {
public VIPCustomer() {}
public VIPCustomer(int customerID, String customerName) {
super(customerID, customerName);
super.customerGrade = "VIP";
super.bonusRatio = 0.05;
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