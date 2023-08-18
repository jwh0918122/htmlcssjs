package 장원희시험;

public class 메인 {
public static void main(String[] args) {
//	Card2 c = new Card2();
//	c.print();
	
	
		
	CardPack2 a= new CardPack2();
	
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=13;j++) {
			Card2 tmp = a.pick();
			tmp.print();
		}
		System.out.println();
	}
	
}

}
