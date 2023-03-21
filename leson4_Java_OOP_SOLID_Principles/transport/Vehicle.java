package transport;

public class Vehicle
{
	
	protected String licensePlate;
	
	public void setLicensePlate(String LicensePlate)
	{
		this.licensePlate=LicensePlate;
	}
	
	/*public Vehicle(String LicensePlate)
	{
		this.licensePlate=LicensePlate;
	}*/
	
	@Override
	public String toString()
	{
		return String.format("Vehicle{licensePlate=%s}",licensePlate);
	}
	
}
