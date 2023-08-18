package Day17;

public class Customer {
protected int customerID; //고객ID
protected String customerName; //고객명
protected String customerGrade; //고객등급
protected int bonusPoint; //보너스합계
protected double bonusRatio; //적립비율

public Customer() { }
public Customer(int customerID, String customerName) {
this.customerID = customerID;
this.customerName = customerName;
initCustomer();
// this.customerGrade = "Silver";
// this.bonusRatio = 0.01;
}
private void initCustomer() {
this.customerGrade = "Silver";
this.bonusRatio = 0.01;
}

//보너스 적립 계산 메서드
public void calcPrice(int price) {
bonusPoint = bonusPoint + (int)(price*bonusRatio); //보너스적립
System.out.println(customerName+"님의 구매금액: "+price);
}
//출력 메서드
public void customerInfo(){
System.out.print(customerName+"님 등급은 "+customerGrade+"이며,");
System.out.println(" 보너스 포인트는 "+bonusPoint+"입니다");
}

public int getCustomerID() {
return customerID;
}
public void setCustomerID(int customerID) {
this.customerID = customerID;
}
public String getCustomerName() {
return customerName;
}
public void setCustomerName(String customerName) {
this.customerName = customerName;
}
public String getCustomerGrade() {
return customerGrade;
}
public void setCustomerGrade(String customerGrade) {
this.customerGrade = customerGrade;
}
public int getBonusPoint() {
return bonusPoint;
}
public void setBonusPoint(int bonusPoint) {
this.bonusPoint = bonusPoint;
}
public double getBonusRatio() {
return bonusRatio;
}
public void setBonusRatio(double bonusRatio) {
this.bonusRatio = bonusRatio;
}
}