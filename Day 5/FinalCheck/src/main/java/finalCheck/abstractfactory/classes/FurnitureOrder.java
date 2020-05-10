package finalCheck.abstractfactory.classes;

import org.apache.log4j.Logger;

import finalCheck.abstractfactory.abstractclasses.Order;
import finalCheck.abstractfactory.enums.Channel;
import finalCheck.abstractfactory.enums.ProductType;

public class FurnitureOrder extends Order{
	private static Logger LOGGER = Logger.getLogger(FurnitureOrder.class);
	
	public FurnitureOrder(Channel channel) {
		super(channel, ProductType.FURNITURE);
		processOrder();
	}
	@Override
	public void processOrder() {
		LOGGER.info("Start of processOrder()");
		LOGGER.debug("Processing Furniture Order");
		LOGGER.info("End of processOrder()");
	}

}
