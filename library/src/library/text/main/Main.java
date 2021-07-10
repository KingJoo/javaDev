package library.text.main;
import java.util.*;
import java.text.*;
import library.text.DAO.*;
public class Main {
	public static void main(String[] args) {
		double[] limits = {900,1000,2000,3000,4000};
		String[] grade = {"A등급","B등급","C등급","D등급","E등급"};
		
		String msg = "사번 : {0}\n이름 : {1}\n직위 : {2}\n사수 : {3}\n입사일 : {4}"
				+ "\n급여 : {5}\n성과급 : {6}\n부서번호 : {7}";
		Emp[] emp =new EmpDAO().empListData();
		for(Emp e : emp) {
			Object[] o= {e.getEmpno(),e.getEname(),e.getJob(),e.getMgr(),
					new SimpleDateFormat("yyyy년도 MM월 dd일!!").format(e.getHiredate()),e.getSal(),e.getComm(),e.getDeptno()};
			String msgInstance = MessageFormat.format(msg,o);
			System.out.println(msgInstance);
			ChoiceFormat cf = new ChoiceFormat(limits,grade);
			System.out.println("급여등급 : "+ cf.format(e.getSal()));
			System.out.println("======================================");
		}
	}
}
