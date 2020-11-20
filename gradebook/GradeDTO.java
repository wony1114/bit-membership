package gradebook;

public class GradeDTO {
	private String name;
	private int kor, eng, math, sum;
	private float average;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	@Override
	public String toString() {
		return "성적관리 [이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 영어=" + math + ", 합계=" + sum
				+ ", 평균=" + average + "]";
	}
	
}
