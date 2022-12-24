package Hesap;

public class HourlyEmployee extends Employee {

	protected Double hour,wage;

	protected HourlyEmployee(String adi, String soyadi, String tC, Double hour, Double wage) {
		super(adi, soyadi, tC);
		this.hour = hour;
		this.wage = wage;
	}

	protected Double getHour() {
		return hour;
	}

	protected void setHour(Double hour) {
		this.hour = hour;
	}

	protected Double getWage() {
		return wage;
	}

	protected void setWage(Double wage) {
		this.wage = wage;
	}
	
	protected double AylikKazanc() {
		double k;
		k= hour*wage;
		return  k ;
		
	}
	protected void write() {
		super.write();
	}

}
