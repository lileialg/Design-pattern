package state;

public class Context {
	
	private State state;
	
	
	
	public void setState(State state) {
		this.state = state;
	}



	public void request(){
		
		state.handler();
		
		state.handler();
		
		state.handler();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context ctx = new Context();
		
		ctx.setState(new StateA(ctx));
		
		ctx.request();
	}

}
