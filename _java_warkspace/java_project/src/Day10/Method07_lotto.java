package Day10;

public class Method07_lotto {

	public static void main(String[] args) {
		/*
		 * 로또 번호를 생성(1~45 랜덤으로 생성) 당첨확인
		 */

		int lotto[] = new int[7]; // 당첨번호+보너스번호 => 랜덤생성
		int user[] = new int[6]; // 사용자번호

		// lotto 배열과 user 배열을 random값으로 채우기
		randomArray(lotto);
		randomArray(user);
		// print
		printArray(lotto);
		printArray(user);

		// 메개변수 자리에 다른 값이 들어가도 자료형만 맞으면 에러가 나지 않음.
		int rank = lottoRank(lotto, user);
		if (rank == -1) {
			System.out.println("꽝~!!");
		} else {
			System.out.println(rank + "등 당첨입니다~!!");
		}
	}

	/*
	 * 1.번호를 랜덤으로 생성하는 기능.(1~45까지) 
	 * 매개변수 : x 
	 * 리턴타입 : 랜덤 값 1개 => int 
	 * 메서드명 : random
	 */
	public static int random() {

		return (int) (Math.random() * 45) + 1;
	}

	/*
	 * 2.배열에 1번의 랜덤번호를 저장하는 기능. 
	 * 매개변수 : 배열 => int arr[] 
	 * 리턴타입 : void 
	 * 메서드명 : randomArray
	 */
	public static void randomArray(int arr[]) {
		// 배열을 받아서 배열에 랜덤 값을 채우기
		// isContain

		/*
		 * for (int i = 0; i <= arr.length - 1; i++) { arr[i] = random(); }
		 */

		// user = 0 0 0 0 0 0
		int cnt = 0; // i를 의미
		while (cnt < arr.length) {
			int r = random();
			if (!isContain(arr, r)) { // true = 중복된다.
				arr[cnt] = r;
				cnt++;
			}
		}

	}

	/*
	 * 3. 배열을 콘솔에 출력하는 기능. 
	 * 매개변수 : 배열 => int arr[] 
	 * 리턴타입 : void 
	 * 메서드명 : printArray
	 */
	public static void printArray(int arr[]) {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/*
	 * 4. 같은 값이 있는지 확인하는 기능. 
	 * 매개변수 : 배열, 랜덤 값 //배열에 랜덤값이 있는지 체크. 있으면 true, 없으면 false
	 * 리턴타입 : boolean 
	 * 메서드명 : isContain
	 */
	public static boolean isContain(int arr[], int random) {

		/*
		 * boolean f; for(int i=0;i<=lotto.length-1;i++) { for(int
		 * j=0;j<=user.length-1;i++) { if(lotto[i]==user[j]) { f= true; }else { f=false;
		 * } } }//for문 끝 return f;
		 * 
		 */
		
		//같은 값이 있으면 true, 없으면 false
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == random) {
				return true; // for문과 상관없이 메서드 종료
			}
		}

		return false;
	}

	/*
	 * 5. 등수를 알려주는 메서드 
	 * 메개변수 : lotto[],user[] 
	 * 리턴타입 : int => 등수를 리턴 
	 * 메서드명 : lottoRank
	 * 
	 * 6개 일치 : 1등 
	 * 5개 일치+보너스 : 2등 
	 * 5개 일치 : 3등 
	 * 4개 일치 : 4등 
	 * 3개 일치 : 5등 
	 * 나머지는 꽝
	 */

	public static int lottoRank(int lotto[], int user[]) { // 이름은 상관 없음
		// lotto = 7개, user = 6개
		// lotto와 user는 개수가 다르기 때문에 바뀌어서 들어오면 error

		if (lotto.length <= user.length) {
			return -1;
		}
		int cnt = 0; // 일치 개수(보너스 제외)
		for (int i = 0; i <= user.length; i++) { // 보너스를 제외시키기 위해 user의 개수만큼 돌림
			if (isContain(user, lotto[i])) {
				cnt++;
			}
		}
		// cnt : 보너스 제외 맞춘 개수
		switch (cnt) {
		case 6:
			return 1;
		case 5:
			if (isContain(user, lotto[lotto.length - 1])) {
				return 2;
			} else {
				return 3;
			}
		case 4:
			return 4;
		case 3:
			return 5;
		default:
			return -1;
		}

	}

}
