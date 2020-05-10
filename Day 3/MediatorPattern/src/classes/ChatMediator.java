package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.IChatMediator;
import interfaces.IUser;

public class ChatMediator implements IChatMediator {
	List<IUser> users = new ArrayList<>();
	
	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}

	@Override
	public void SendMessage(String message) {
		for (IUser user : users) {
			user.ReceiveMessage(message);
		}
	}

}
