package Day22;

public class Word { // public은 하나만 생성 가능(파일 이름과 같은)
	   private String word;
	   private String mean;

	   public Word() {
	   }

	   public Word(String word, String mean) {
	      super();
	      this.word = word;
	      this.mean = mean;
	   }

	   public void print() {
	      System.out.println(word + ":" + mean);
	   }

	   // getter,setter
	   public String getWord() {
	      return word;
	   }

	   public void setWord(String word) {
	      this.word = word;
	   }

	   public String getMean() {
	      return mean;
	   }

	   public void setMean(String mean) {
	      this.mean = mean;
	   }

	}