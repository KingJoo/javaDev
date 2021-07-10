package movie;

interface theater{
	public void menuPrint();
	public void detail();
	public void find();
	//이미 구현 클래스에 영향을 미치지 않게 하기 위해 디폴트 메서드를 쓴다. 필요한 곳에서만 가져다 쓸 수 있다.
	public default void event() {}
}

class CGV implements theater{
	@Override
	public void menuPrint() {
		// TODO Auto-generated method stub
		
	}@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}
}

class MegaBox implements theater{
	@Override
	public void menuPrint() {
		// TODO Auto-generated method stub
		
	}@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}
}

class Lotte implements theater{
	@Override
	public void menuPrint() {
		// TODO Auto-generated method stub
		
	}@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}
}

public class Main {

}
