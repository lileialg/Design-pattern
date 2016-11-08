package proxy;

public class Proxy implements Subject{
	
	private Subject proxyObj;
	
	public Proxy(){
		this.proxyObj = new RealObject();
	}
	
	private void prepare(){
		System.out.println("prepare......");
	}

	@Override
	public void hander() {
		// TODO Auto-generated method stub
		prepare();
		
		proxyObj.hander();
		
		finish();
		
	}
	
	private void finish(){
		System.out.println("clear......");
	}

}
