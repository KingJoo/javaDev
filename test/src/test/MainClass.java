package test;

class Student{
	static String school;
	String name;
	int kor, eng, math;
	
	{name="블럭 초기화"; kor=eng=math=0;}
	Student(){}//2
	Student(String name){this.name=name;}
	Student(String name,int kor, int eng, int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	int sum(){return kor+eng+math;}
	double avg() {return sum()/3d;}
	char score() {
		return switch((int)avg()/10) {
		case 10,9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
	}
}

public class MainClass {
	public static void main(String[] args) {
		// 단일 변수
		String name1, name2;
		int kor1, kor2;
		int eng1, eng2;
		int math1, math2;
		// 배열
		String[] names;
		int[] kor, eng, math;
		// 클래스
		Student s1=new Student();
		Student s2=new Student("생성자 명시적 초기화",9,8,7);
		Student s3=new Student("강주우",99,99,99);
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.score());
	}
}
