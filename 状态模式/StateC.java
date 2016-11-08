package state;

public class StateC implements State {
	private Context ctx;
	
	public StateC(Context ctx){
		this.ctx = ctx;
	}
	@Override
	public void handler() {
		// TODO Auto-generated method stub
		System.out.println("C is over");
		
	}

}
