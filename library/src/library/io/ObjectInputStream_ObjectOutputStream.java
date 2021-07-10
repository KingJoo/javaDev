package library.io;

import java.io.*;
import java.util.ArrayList;

class Sawon implements Serializable{
	private int sabun,pay;
	private String name,detp,job;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetp() {
		return detp;
	}
	public void setDetp(String detp) {
		this.detp = detp;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}

public class ObjectInputStream_ObjectOutputStream {
	public static void main(String[] args) {
		try {
			ArrayList<Sawon> list = new ArrayList<>();
			Sawon s = new Sawon();
			s.setSabun(1);
			s.setName("asdf");
			s.setDetp("개발부");
			s.setJob("대리");
			s.setPay(3000);
			list.add(s);
			s = new Sawon();
			s.setSabun(1);
			s.setName("asdf");
			s.setDetp("개발부");
			s.setJob("대리");
			s.setPay(3000);
			list.add(s);
			s = new Sawon();
			s.setSabun(1);
			s.setName("asdf");
			s.setDetp("개발부");
			s.setJob("대리");
			s.setPay(3000);
			list.add(s);
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/joo/Downloads/test.txt"));
			oos.writeObject(list);
			oos.close();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/joo/Downloads/test.txt"));
			ArrayList<Sawon> tmp = (ArrayList<Sawon>)ois.readObject();
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
