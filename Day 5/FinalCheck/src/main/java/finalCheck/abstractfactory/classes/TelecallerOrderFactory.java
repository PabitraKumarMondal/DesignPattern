package finalCheck.abstractfactory.classes;

import finalCheck.abstractfactory.abstractclasses.Order;
import finalCheck.abstractfactory.enums.Channel;
import finalCheck.abstractfactory.enums.ProductType;

public class TelecallerOrderFactory {
	public static Order placeOrder(ProductType productType) {
		Order order = null;
		switch(productType)
		{
			case ELECTRONIC :
						order = new ElectronicOrder(Channel.TELECALLER);
						break;
			case TOYS :
						order = new ToysOrder(Channel.TELECALLER);
						break;
			case FURNITURE :
						order = new FurnitureOrder(Channel.TELECALLER);
						break;
			default :
						break;
		}
		return order;
	}
}
