package try_catch;
// 캡슐화 -> 데이터 은닉화 -> 메소드로 접근
/*
 *	Emp 사원 정보
 *	empno : 사번
 *	ename : 이름
 *	job : 직위
 *	mgr : 사수번호
 *	hiredate : 입사일
 *	sal : 급여
 *	comm : 성과급
 *	deptno : 부서번호
 *	-> 오라클 (예외처리 반드시 -> 네트워크<컴파일 예외>)
 */
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private int sal;
	private int comm;
	private int deptno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
