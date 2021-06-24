package test;

import java.util.Scanner;

public class Method4 {
	static String[] music= {
					"1. 치맛바람 (Chi Mat Ba ...",
					"2. Butter",
					"3. 비와 당신",
					"4. Next Level",
					"5. Alcohol-Free",
					"6. 치맛바람 (Chi Mat Ba Ram)",
					"7. Butter",
					"8. 비와 당신",
					"9. Next Level",
					"10. Alcohol-Free",
					"11. 헤픈 우연",
					"12. Dun Dun Dance",
					"13. 추적이는 여름 비가 되어",
					"14. Ready to love",
					"15. 안녕 (Hello)",
					"16. 롤린 (Rollin')",
					"17. Peaches (Feat. Daniel Caesar & Giveon)",
					"18. 라일락",
					"19. Dynamite",
					"20. Celebrity",
					"21. ASAP",
					"22. 운전만해 (We Ride)",
					"23. 상상더하기",
					"24. 상상더하기",
					"25. Timeless",
					"26. 신호등",
					"27. Savage Love (Laxed - Siren Beat) (BTS Remix)",
					"28. 작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey)",
					"29. 다정히 내 이름을 부르면",
					"30. 이제 나만 믿어요",
					"31. 내 손을 잡아",
					"32. 마.피.아. In the morning",
					"33. 사이렌 Remix (Feat. UNEDUCATED KID & Paul Blanco)",
					"34. At My Worst",
					"35. Dolphin",
					"36. Off My Face",
					"37. 별빛 같은 나의 사랑아",
					"38. Anyone",
					"39. Blueming",
					"40. Life Goes On",
					"41. Heaven's Cloud",
					"42. 멜로디",
					"43. 내 입술 따뜻한 커피처럼",
					"44. HERO",
					"45. 비가 내리기 전에",
					"46. Coin",
					"47. LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지)",
					"48. 2002",
					"49. 라라라",
					"50. 모든 날, 모든 순간 (Every day, Every Moment)"
	};
	
	//메뉴
	static int showMenu() {
		String[] str = {"===== 메뉴 =====","1. 음악 목록","2. 음악 찾기","3. 종료","==============="};
		for(String s:str)
			System.out.println(s);
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 입력 : ");
		return sc.nextInt();
	}
	//음악목록
	static void showMusic() {
		for(String m : music)
			System.out.println(m);
	}
	//음악 찾기
	static void showMusicFind() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String fd=sc.next();
		boolean ck=false;
		for(String m:music)
			if(m.contains(fd)) {
				System.out.println(m);
				ck=true;
			}
		if(!ck)	System.out.println("검색된 내용이 없습니다.");
	}
	//종료
	
	public static void main(String[] args) {
		while(true) {
			int menu=showMenu();
			if(menu==3) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1) {
				System.out.println("===== 음악 목록 출력 =====");
				showMusic();
			}
			else if(menu==2) {
				System.out.println("===== 음악 찾기 =====");
				showMusicFind();
			}
		}
	}
}
