package try_catch;

public class MainClass {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Emp[] emp = dao.empAllData();
		for(Emp e : emp) {
			System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getJob()+" "+e.getSal());
		}
	}
}
