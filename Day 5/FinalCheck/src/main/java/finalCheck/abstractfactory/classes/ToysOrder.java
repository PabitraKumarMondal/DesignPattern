package finalCheck.abstractfactory.classes;

import org.apache.log4j.Logger;

import finalCheck.abstractfactory.abstractclasses.Order;
import finalCheck.abstractfactory.enums.Channel;
import finalCheck.abstractfactory.enums.ProductType;

public class ToysOrder extends Order{
	private static Logger LOGGER = Logger.getLogger(ToysOrder.class);
	
	public ToysOrder(Channel channel) {
		super(channel, ProductType.TOYS);
		processOrder();
	}
	
	@Override
	public void processOrder() {
		LOGGER.info("Start of processOrder()");
		LOGGER.debug("Processing Toys Order");
		LOGGER.info("End of processOrder()");
	}

}
