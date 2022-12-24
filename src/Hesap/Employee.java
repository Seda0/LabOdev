package Hesap;

public class Employee {
	protected String adi,soyadi,TC;

	protected Employee(String adi, String soyadi, String tC) {
		
		this.adi = adi;
		this.soyadi = soyadi;
		TC = tC;
	}

	protected String getAdi() {
		return adi;
	}

	protected void setAdi(String adi) {
		this.adi = adi;
	}

	protected String getSoyadi() {
		return soyadi;
	}

	protected void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	protected String getTC() {
		return TC;
	}

	protected void setTC(String tC) {
		TC = tC;
	}
	protected void write() {
		System.out.println(getAdi()+" "+getSoyadi()+" "+getTC());
		
	}
	

}
