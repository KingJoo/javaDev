package test;

class Movie_{
	int mno;
	String title;
	Movie_(){
		this.print();
	}
	Movie_(int mno){
		this.mno=mno;
		this.print();
	}
	Movie_(int mno, String title){
		this.mno=mno;
		this.title=title;
		this.print();
	}
	void print() {
		System.out.println("mno = "+mno+", title = "+title);
	}
}

public class Init_0629 {
	public static void main(String[] args) {
		Movie_ m;
		m = new Movie_();
		m = new Movie_(2);
		m = new Movie_(3,"크");
	}
}
