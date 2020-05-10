package finalCheck.abstractfactory.classes;

import org.apache.log4j.Logger;

import finalCheck.abstractfactory.abstractclasses.Order;
import finalCheck.abstractfactory.enums.Channel;
import finalCheck.abstractfactory.enums.ProductType;

public class ElectronicOrder extends Order{
	private static Logger LOGGER = Logger.getLogger(ElectronicOrder.class);
	
	public ElectronicOrder(Channel channel) {
		super(channel, ProductType.ELECTRONIC);
		processOrder();
	}
	@Override
	public void processOrder() {
		LOGGER.info("Start of processOrder()");
		LOGGER.debug("Processing Electronic Products Order");
		LOGGER.info("End of processOrder()");
	}

}
