package Hesap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HourlyEmployee h = new HourlyEmployee("Ahmet", "Mehmet", "25465821154", 300.0, 200.0);
		
		System.out.println(h.getAdi() + " " + h.getSoyadi() + " " + h.getTC());

		System.out.println("Aylik Kazanc:" + h.AylikKazanc());

	}

}
