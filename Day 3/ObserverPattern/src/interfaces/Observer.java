package interfaces;

import concreteclasses.Message;

public interface Observer {
	public void update(Message m);
}
