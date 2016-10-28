package design.pattern.command;

public class OpenTVCommand implements Command {
	
	private TVOpen tv;
	
	public OpenTVCommand(TVOpen tv){
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		tv.openTV();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.shutdownTV();
	}

}
