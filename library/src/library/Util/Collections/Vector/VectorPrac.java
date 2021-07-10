package library.Util.Collections.Vector;

import java.net.*;
import java.io.*;
import java.util.*;

class Server implements Runnable{
	private Vector waitVc =new Vector();
	private ServerSocket ss;
	public Server() {
		try {
			ss=new ServerSocket(3355);
			System.out.println("서버 가동");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		try {
			while(true) {
				Socket s = ss.accept();// 접속 대기
				System.out.println("접근한 클라이언트 IP : "+s.getInetAddress().getAddress());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class VectorPrac {
	public static void main(String[] args) {
		
	}
}
