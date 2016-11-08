package state;

public class StateA implements State {
	
	private Context ctx;
	
	public StateA(Context ctx){
		this.ctx = ctx;
	}

	@Override
	public void handler() {
		// TODO Auto-generated method stub

		System.out.println("A is over");
		
		ctx.setState(new StateB(ctx));
	}

}
