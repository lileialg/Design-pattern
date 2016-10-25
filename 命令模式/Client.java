package design.pattern.command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TVOpen tv = new TVOpen();
		
		Command cmd = new OpenTVCommand(tv);
		
		Invoker invoker = new Invoker(cmd);
		
		invoker.call();
		
		invoker.rollback();
	}

}
