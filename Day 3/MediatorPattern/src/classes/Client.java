package classes;

import interfaces.IChatMediator;
import interfaces.IUser;

public class Client {
	public static void main(String[] args) {
		IChatMediator chatMediator = new ChatMediator();
		IUser user1 = new BasicUser(chatMediator, "Mr. X");
		IUser user2 = new BasicUser(chatMediator, "Mr. Y");
		chatMediator.AddUser(user1);
		chatMediator.AddUser(user2);
		
		IUser user3 = new PremiumUser(chatMediator, "Mr. A");
		user3.SendMessage("Hi");
	}
}
