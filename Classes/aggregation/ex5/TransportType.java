package aggregation.ex5;

public enum TransportType {
	AVIATION("Plane"), BUS("Bus"), RAILWAY("Train"), MOTOR_SHIP("Ship"), COMBINED("Combo");	
	
	String transport;

	private TransportType(String transport) {
		this.transport = transport;
	}

	public String getTransport() {
		return transport;
	}
}
