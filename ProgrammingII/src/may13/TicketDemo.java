package may13;

//VIckie WU
//5/13/19
import java.io.IOException;

import apr8.JunkyardReport;

public class TicketDemo {

	public TicketDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)

	{
		Walkup wp1 = new Walkup();
		System.out.println(wp1);
		Walkup wp2 = new Walkup();
		System.out.println(wp2);

		Advance ad10 = new Advance(10);
		System.out.println(ad10);
		Advance ad1 = new Advance(1);
		System.out.println(ad1);

		// -----edited----
		ad1.setAdvancePrice(20, 25);
		System.out.println(ad1);

		// --------------------

		StudentAdvance st10B = new StudentAdvance(10);
		System.out.println(st10B);
		StudentAdvance st1B = new StudentAdvance(1);
		System.out.println(st1B);
	}

}
