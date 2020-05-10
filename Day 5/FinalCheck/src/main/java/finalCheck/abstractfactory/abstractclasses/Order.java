package finalCheck.abstractfactory.abstractclasses;

import finalCheck.abstractfactory.enums.Channel;
import finalCheck.abstractfactory.enums.ProductType;

public abstract class Order {
	private Channel channel = null;
	private ProductType productType = null;
		
	public Order() {

	}

	public Order(Channel channel, ProductType productType) {
		this.channel = channel;
		this.productType = productType;
	}


	public Channel getChannel() {
		return channel;
	}


	public void setChannel(Channel channel) {
		this.channel = channel;
	}


	public ProductType getProductType() {
		return productType;
	}


	public void setProductType(ProductType productType) {
		this.productType = productType;
	}


	public abstract void processOrder();


	@Override
	public String toString() {
		return productType+" ordered via " + channel + ".";
	}
	
}
