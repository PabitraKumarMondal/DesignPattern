package finalCheck.abstractfactory.classes;

import finalCheck.abstractfactory.abstractclasses.Order;
import finalCheck.abstractfactory.enums.Channel;
import finalCheck.abstractfactory.enums.ProductType;

public class OrderFactory {
	public static Order placeOrder(Channel channel, ProductType productType) {
		Order order = null;
		switch(channel)
		{
			case ECOMMERCE : 
					order = ECommerceOrderFactory.placeOrder(productType);
					break;
			case TELECALLER :
					order = TelecallerOrderFactory.placeOrder(productType);	
					break;
			default:
					break;
		}
		return order;
	}
}
