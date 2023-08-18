package Day17;

public class CustomerMain {
/* 일반고객 / Gold고객(할인) / VIP고객(할인)
*
* 고객ID : int customerID
* 고객이름 : String customerName
* 고객등급 : String customerGrade
* 보너스포인트 : int bonusPoint
* 보너스적립비율 : double bonusRatio
*
* 클래스 생성
* - 기본 customerGrade = 'Silver'
* - 기본 bonusRatio = 0.01 => 1%
*
* - 메서드
* 1. 보너스 적립 계산 메서드 (메서드명:calcPrice(int price))
*  => 보너스를 적립, 할인여부를 체크하여 price를 리턴 => silver는 할인여부 없음.
*  - 구매금액 주고 적립보너스를 계산 bonusPoint 누적
*  
* 2. 출력메서드 (메서드명:customerInfo)
*  => 홍길동님 등급은 VIP이며, 보너스 포인트는 1000입니다.
*  
* - silver 등급
*   => 제품을 살때 0%할인 / 보너스 포인트 1%적립
* - Gold 등급
*   => 제품을 살때 10%할인 / 보너스 포인트 2%적립
* - VIP 등급
*   => 제품을 살때 10%할인 / 보너스 포인트 5%적립
*  
*   GoldCustomer extends Customer{
*     기본 클래스를 오버라이딩 하여 사용
*   }
*   VIPCustomer extends Customer{
*     기본 클래스를 오버라이딩 하여 사용
*   }
*  
*   Main 클래스에서 확인
* */
public static void main(String[] args) {
	Customer c = new Customer(1111, "홍길동");
	GoldCustomer c1 = new GoldCustomer(2222, "김정태");
	VIPCustomer c2 = new VIPCustomer(3333, "박한수");

	Customer customerList[] = new Customer[10];
	int cnt = 0;
	customerList[cnt] = c;
	cnt++;
	customerList[cnt] = c1;
	cnt++;
	customerList[cnt] = c2;
	cnt++;

	System.out.println("--고객정보 출력--");
	for (int i = 0; i < cnt; i++) {
		customerList[i].customerInfo();
	}
	System.out.println();
	System.out.println("--구매금액과 할인율 계산--");
	int price = 10000;
	for (int i = 0; i < cnt; i++) {
		customerList[i].calcPrice(price);
		System.out.println("포인트 : " + customerList[i].getBonusPoint());
	}
// c.calcPrice(10000);
// c.customerInfo();
// c1.calcPrice(10000);
// c1.customerInfo();
// c2.calcPrice(10000);
// c2.customerInfo();

}

}