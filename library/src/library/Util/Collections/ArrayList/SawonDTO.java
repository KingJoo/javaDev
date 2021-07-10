package library.Util.Collections.ArrayList;

public class SawonDTO {
	private int no;//사번
	private String name;//이름
	private String job;//직위
	private String detp;//부서
	private String loc;//근무지
	private long pay;//연봉
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDetp() {
		return detp;
	}
	public void setDetp(String detp) {
		this.detp = detp;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	
	//생성
	public SawonDTO() {}
	public SawonDTO(int no, String name, String job, String detp, String loc, long pay) {
		this.no = no;
		this.name = name;
		this.job = job;
		this.detp = detp;
		this.loc = loc;
		this.pay = pay;
	}
}
