package Day12;

public class Class05강사님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV2 a = new TV2();
		a.isPower();
		a.isPower();
		
		
	}

}
class TV2{
	
	private boolean power; //기본 : false
	private int ch; //기본 0
	private int vol; //기본 0
	
	//기본 생성자 생략
	
	public void power() {
		if(power) { //TV가 켜져있는 상태 => 전원버튼을 클릭
			System.out.println("전원이 꺼집니다.");
			power=false;//power의 상태변경
		}else { //TV가 켜져있는 상태 => 전원버튼 클릭
			System.out.println("전원이 꺼집니다.");
			power=true; //power의 상태변경
		}
	}
	//멤버변수의 기본값은 별도 값을 주지 않더라도 기본 0 / 문자라면 null
	public void chUp() {
		//ch의 기본 값 = 0
		if(power) {
			ch++;
			System.out.println("현재 채널 : "+ch);
			if(ch>=20) {
				ch=0;
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	public void chDown() {
		if(power) {
			ch--;
			System.out.println("현재 채널 : "+ch);
			if(ch<=0) {
				ch=20;
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}

	public void volUp() {
		if (power) {
			System.out.println("현재 볼륨 : " + vol);
			vol++;
			if (vol > 10) {
				vol = 10;
			} else {
				System.out.println("전원이 꺼져있습니다.");
			}
		}
	}

	public void volDown() {
		if(power) {
			System.out.println("현재 볼륨 : "+vol);
			vol--;
			if(vol<=0) {
				vol=0;
				System.out.println("음소거");
				
			}else {
				System.out.println("현재 볼륨 : "+vol);
			}
			
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
}

