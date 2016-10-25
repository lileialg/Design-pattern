package design.pattern.command;

public class Invoker {

	
	private Command cmd;
	
	public Invoker(Command cmd){
		this.cmd = cmd;
	}
	
	public void call(){
		cmd.execute();
	}
	
	public void rollback(){
		cmd.undo();
	}
}
