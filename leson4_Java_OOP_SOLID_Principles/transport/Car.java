package transport;

public class Car extends Vehicle
{
	
	private String licensePlate;
	private int seats;
	
	public void setLicensePlate(String LicensePlate)
	{
		this.licensePlate=LicensePlate;
	}
	
	public void setSeats(int Seats)
	{
		this.seats=Seats;
	}
	
	public Car(String LicensePlate,int Seats)
	{
		//super(LicensePlate);
		this.licensePlate=LicensePlate;
		this.seats=Seats;
	}
	
	@Override
	public String toString()
	{
		return String.format("Car{licensePlate=%s,numberOfSeats=%d}",licensePlate,seats);
	}
	
}
