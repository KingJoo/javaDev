package library.Util.Map;

import java.util.*;

interface III {
	public void display();
}

class AA implements III {
	public void display() {
		System.out.println("AA");
	}
}

class BB implements III {
	public void display() {
		System.out.println("BB");
	}
}

class CC implements III {
	public void display() {
		System.out.println("CC");
	}
}

class DD implements III {
	public void display() {
		System.out.println("DD");
	}
}

class EE implements III {
	public void display() {
		System.out.println("EE");
	}
}

public class HashMapPrac {
	public static void main(String[] args) {
		Map<String, III> m = new HashMap<>();
		m.put("aa", new AA());
		m.put("bb", new BB());
		m.put("cc", new CC());
		m.put("dd", new DD());
		m.put("ee", new EE());
		Scanner sc = new Scanner(System.in);
		System.out.print("명령어 입력 : ");
		String cmd = sc.next();
		III i = m.get(cmd);
		i.display();
//		if(cmd.equals("aa")) {
//			
//		}
//		else if(cmd.equals("bb")) {
//			
//		}
//		else if(cmd.equals("cc")) {
//			
//		}else if(cmd.equals("dd")) {
//			
//		}else if(cmd.equals("ee")){
//			
//		}
	}
}
