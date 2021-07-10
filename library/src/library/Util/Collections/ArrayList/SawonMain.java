package library.Util.Collections.ArrayList;
import java.text.MessageFormat;
import java.util.*;
public class SawonMain {
	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====메뉴=====");
		System.out.println("1. 사원 전체 목록 ");
		System.out.println("2. 사원 추가 ");
		System.out.println("3. 사원 수정 ");
		System.out.println("4. 사원 삭제 ");
		System.out.println("5. 사원 상세보기 ");
		System.out.println("6. 종료 ");
		System.out.println("============");
		System.out.print("메뉴 선택 : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		SawonMain sm = new SawonMain();
		SawonManager smg = new SawonManager();
		while(true) {
			int m=sm.menu();
			if(m==6) {
				System.out.println("종료");
				break;
			}
			else if(m==1) {
				ArrayList<SawonDTO> list = smg.listData();
				System.out.println("=====사원 목록=====");
				String msg = "{0}\t{1}\t{2}\t{3}\t{4}\t{5}";
				for(SawonDTO s : list) {
					Object[] sa= {s.getNo(),s.getName(),s.getJob(),s.getDetp(),s.getLoc(),s.getPay()};
					String data = MessageFormat.format(msg, sa);
					System.out.println(data);
				}
			}
			else if(m==2) {
				Scanner sc = new Scanner(System.in);
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("직위 입력 : ");
				String job = sc.next();
				System.out.print("부서 입력 : ");
				String dept = sc.next();
				System.out.print("근무지 입력 : ");
				String loc = sc.next();
				System.out.print("연봉 입력 : ");
				long pay = sc.nextLong();
				//사번
				ArrayList<SawonDTO> list = smg.listData();
				int max = list.size();
				SawonDTO sa = list.get(max-1);
				int sabun = sa.getNo()+1;
				smg.insert(new SawonDTO(sabun,name,job,dept,loc,pay));
			}
			else if(m==3) {
				
			}
			else if(m==4) {
				Scanner sc = new Scanner(System.in);
				System.out.print("삭제할 사번 입력 : ");
				int sabun = sc.nextInt();
				smg.delete(sabun);
				System.out.println("사원 삭제 완료");
			}
		}
	}
}
