package state;

public class StateB implements State {
	private Context ctx;
	
	public StateB(Context ctx){
		this.ctx = ctx;
	}
	@Override
	public void handler() {
		// TODO Auto-generated method stub
		System.out.println("B is over");
		
		ctx.setState(new StateC(ctx));
	}

}
