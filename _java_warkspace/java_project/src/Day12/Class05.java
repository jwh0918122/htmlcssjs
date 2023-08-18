package Day12;
public class Class05 {
	public static void main(String[] args) {
		/* TV 클래스 생성
		 * -power
		 * 
		 * -ch (up : +1씩 증가 / down : -1씩 감소)
		 *  ch은 20까지 있음. 20이 넘어가면 다시 0번으로 돌아감(순환). power가 켜져있어야 가능
		 *  
		 * -vol (up : +1씩 증가 / down : -1씩 감소)
		 *  vol은 10까지 있음. 10에서 더 안올라감. 0이면 음소거라고 출력. power가 켜져있어야 가능
		 *  
		 */
		TV t = new TV();
		
		t.powerOn();
		t.chDown();
		t.chUp();
		t.volDown();
		t.volUp();
		
		
	}
}
//클래스 생성위치
class TV {
	private boolean power;
	private int ch = 0;
	private int vol = 0;
	// 기본 생성자
	public TV() {
	}
	// 전원 켜기 powerOn
	public void powerOn() {
		if (power) {
			System.out.println("이미 켜져있습니다.");
			return;
		}
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}
	// 전원 끄기 powerOff
	public void powerOff() {
		if (power == false) {
			System.out.println("이미 꺼져있습니다.");
			return;
		}
		power = false;
		System.out.println("전원이 꺼졌습니다.");
	}
	// 채널 올림 chUp
	public void chUp() {
		if (power) {
			if (ch > 19) {
				ch = 0;
			} else {
				ch++;
			}
		} else {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		System.out.println("현재 채널 : " + ch);
	}
	// 채널 내림 chDown
	public void chDown() {
		if (power) {
			if (ch < 1) {
				ch=20;
			} else {
				ch--;
			}
		} else {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		System.out.println("현재 채널 : " + ch);
	}
	//소리 올림 volUp
	public void volUp() {
		if (power) {
			vol++;
			if (vol >= 10) {
				vol = 10;
				System.out.println("최고 볼륨입니다.");
			} else {
				System.out.println("현재 볼륨 : " + vol);
			}
		} else {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
	}
	//소리 내림 volDown
	public void volDown() {
		if (power) { 
			vol--;
			if (vol <= 0) {
				vol=0;
				System.out.println("음소거");
			} else {
				System.out.println("현재 볼륨 : "+vol);
			}
		} else {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		
	}
	
	//getter, setter
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
