package test2;

interface A{
	public void aaa();
}

interface B extends A{
	public void bbb();
}

interface D{
	public void ddd();
}

interface E{
	public void eee();
}

class K implements D,E{
	 @Override
	public void ddd() {
		// TODO Auto-generated method stub
		
	}@Override
	public void eee() {
		// TODO Auto-generated method stub
		
	}
}

interface Q{
	
}
interface W{
	
}
interface Y extends Q,W{
	
}
class J implements Y{
	
}
class O implements Q,W,Y{
	
}
public class test2 {

}
