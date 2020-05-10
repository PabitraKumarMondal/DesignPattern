package classes;

import interfaces.IChatMediator;
import interfaces.IUser;

public class BasicUser implements IUser {
	private IChatMediator chatMediator;
	private String name;
	
	public BasicUser() {
		
	}

	public BasicUser(IChatMediator chatMediator, String name) {
		//super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

	@Override
	public void ReceiveMessage(String message) {
		System.out.println(message);
	}

	@Override
	public void SendMessage(String message) {
		chatMediator.SendMessage(name + ": " + message);
	}

}
