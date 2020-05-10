package finalCheck.abstractfactory.classes;

import finalCheck.abstractfactory.abstractclasses.Order;
import finalCheck.abstractfactory.enums.Channel;
import finalCheck.abstractfactory.enums.ProductType;

public class ECommerceOrderFactory {
	public static Order placeOrder(ProductType productType) {
		Order order = null;
		switch(productType)
		{
			case ELECTRONIC :
						order = new ElectronicOrder(Channel.ECOMMERCE);
						break;
			case TOYS :
						order = new ToysOrder(Channel.ECOMMERCE);
						break;
			case FURNITURE :
						order = new FurnitureOrder(Channel.ECOMMERCE);
						break;
			default :
						break;
		}
		return order;
	}
}
