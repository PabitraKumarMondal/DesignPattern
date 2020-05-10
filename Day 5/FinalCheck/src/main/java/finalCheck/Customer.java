package finalCheck;

import org.apache.log4j.Logger;

import finalCheck.abstractfactory.classes.OrderFactory;
import finalCheck.abstractfactory.enums.Channel;
import finalCheck.abstractfactory.enums.ProductType;

public class Customer {
	private static Logger LOGGER = Logger.getLogger(Customer.class);
	public static void main(String[] args) {
		LOGGER.info("Start of main()");
		LOGGER.debug(OrderFactory.placeOrder(Channel.ECOMMERCE, ProductType.ELECTRONIC).toString());
		LOGGER.debug(OrderFactory.placeOrder(Channel.TELECALLER, ProductType.TOYS).toString());
		LOGGER.debug(OrderFactory.placeOrder(Channel.ECOMMERCE, ProductType.FURNITURE).toString());
		LOGGER.info("End of main()");
	}
}
