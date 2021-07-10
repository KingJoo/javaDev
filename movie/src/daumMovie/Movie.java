package daumMovie;

public class Movie{
	private String title;
	private String grade;
	private String regdate;
	private double score;
	private double reserve;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public double getReserve() {
		return reserve;
	}
	public void setReserve(double reserve) {
		this.reserve = reserve;
	}
}