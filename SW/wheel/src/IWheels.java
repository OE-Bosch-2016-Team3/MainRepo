package wheel;

public interface IWheels {
	double Direction();		//0-360 degree
	double Speed();
	void calcOnTick(double driverWheel,double gasPedal, double brakePedal);
}
