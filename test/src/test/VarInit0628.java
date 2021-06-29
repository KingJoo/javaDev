package test;

import java.util.Scanner;

public class VarInit0628 {
	// 변수 선언만~!
	int a;double d;String name;float f;byte b;short s;char c;boolean bl;
	//1. 명시적 초기화
	//int a=1;double d=2.321;String name="ㅇㅇ";float f=1.236f;byte b=17;short s=67;char c='d';boolean bl=true;
	//2. 초기화 블록
	//{a=100;d=9.8772893;name="daeofkd";f=0.0234f;b=20;s=4000;c='q';bl=true;}
	//3. 생성자
	VarInit0628(){}
	VarInit0628(int a,double d,String name,float f,byte b,short s,char c,boolean bl){
		this.a=a;
		this.d=d;
		this.name=name;
		this.f=f;
		this.b=b;
		this.s=s;
		this.c=c;
		this.bl=bl;
	}
	
	String[] data = new String[10];
	{
		data[0]="가나다";
		data[1]="라마바";
		data[2]="사아자";
		data[3]="차카타";
		data[4]="파하가";
		data[5]="나다라";
		data[6]="마바사";
		data[7]="아자차";
		data[8]="카타파";
		data[9]="하가나";
	}
	public static void main(String[] args) {
		VarInit0628 a = new VarInit0628(1, 1.2345, "dadfe", 0.123f, (byte)19, (short)456, '5', true);
		System.out.println(a.a);
		System.out.println(a.d);
		System.out.println(a.name);
		System.out.println(a.f);
		System.out.println(a.b);
		System.out.println(a.s);
		System.out.println(a.c);
		System.out.println(a.bl);
		
		
		for(int i=0;i<a.data.length;i++)
			System.out.println(a.data[i]);
		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력 : ");
		String s=sc.next();
		boolean ck=false;
		for(String name : a.data) {
			if(s.equals(name)) {
				System.out.println(s+"을(를) 찾았다!");
				ck=true;
				break;
			}
		}
		if(!ck)	System.out.println(s+"을(를) 못 찾았다!");
		
	}
}
