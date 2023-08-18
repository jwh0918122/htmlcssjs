package Day14;

public class EzenComMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EzenComputer e = new EzenComputer("장원희", "27", "970918", "010-1111-1111", "incheon");
		e.stuprint();
		
		e.add("java","2023/05/01~2023/12/30");
		e.add("파이썬", "1개월");
		e.add("파이썬", "1개월");
		e.add("파이썬", "1개월");
		e.subprint();
		
		
		
	}

	
}

