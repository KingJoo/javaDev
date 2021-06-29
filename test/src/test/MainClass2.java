package test;

class Movie{
	String title,director,actor,genre,grade;
	boolean isShow;
	Movie(){
		this("","","","","",false);
	}
	Movie(String t, String d,String a,String genre,String grade,boolean b){
		title = t;
		director = d;
		actor = a;
		this.genre = genre;
		this.grade = grade;
		isShow = b;
	}
	void setting(String t, String d,String a,String genre,String grade,boolean b) {
		title = t;
		director = d;
		actor = a;
		this.genre = genre;
		this.grade = grade;
		isShow = b;
	}
	void showMenu(){
		System.out.println("영화 제목 : "+title);
		System.out.println("영화 감독 : "+director);
		System.out.println("영화 배우 : "+actor);
		System.out.println("영화 장르 : "+genre);
		System.out.println("영화 등급 : "+grade+'\n');
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		Movie m1=new Movie("1123", "1123456", "~~~~~~~", "액션", "18세이상관람가", true);
		Movie m2=new Movie();
		m2.setting("발신제한", "김창주", "조우진,이재인,진경,지창욱,김지효", "스릴러/드라마", "15세이상관람가", true);
		m1.showMenu();
		m2.showMenu();
	}
}
