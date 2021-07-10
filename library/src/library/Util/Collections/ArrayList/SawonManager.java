package library.Util.Collections.ArrayList;
import java.util.*;
public class SawonManager {
	private static ArrayList<SawonDTO> list = new ArrayList<>();
	// 사원 등록
	public SawonManager() {
		list.add(new SawonDTO(1,"홍길동","대리","개발부","서울",3600));
		list.add(new SawonDTO(2,"심청이","과장","기획부","부산",4500));
		list.add(new SawonDTO(3,"박문수","사원","영업부","인천",3200));
		list.add(new SawonDTO(4,"춘향이","사원","자재부","경기",3200));
		list.add(new SawonDTO(5,"이순신","부장","총무부","제주",6000));
	}
	// 사원 목록
	public ArrayList<SawonDTO> listData(){
		return list;
	}
	// 사원 추가
	public void insert(SawonDTO sa) {
		list.add(sa);
	}
	// 사원 삭제
	public void delete(int sabun) {
		for(int i=0;i<list.size();i++) {
			SawonDTO s=list.get(i);
			if(s.getNo()==sabun) {
				list.remove(i);
				break;
			}
		}
	}
	// 사원 수정
	public void update(SawonDTO sa) {
		for(int i=0;i<list.size();i++) {
			SawonDTO s=list.get(i);
			if(s.getNo()==sa.getNo()) {
				list.remove(i);
				break;
			}
		}
	}
}
