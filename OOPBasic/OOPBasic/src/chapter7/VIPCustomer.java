package chapter7;

public class VIPCustomer extends Customer{	
	private double salesRatio;
	private int agentId;
		
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	public VIPCustomer(int customerId, String customerName, int agentId) {
		this(customerId, customerName);
		this.agentId = agentId;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentId + "�Դϴ�.";
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	
	
	
	
}
