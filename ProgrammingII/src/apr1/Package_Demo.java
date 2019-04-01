package apr1;

//Vickie Wu
//April 1

import java.util.ArrayList;

public class Package_Demo {

	public static void main(String[] args) {
		Package pkg = new Package(10.5, 1.0); // 10.5 ounces, $1.0 cost per ounce
		pkg.set_sender_info("Michael K", "111 One Street", "New York", "NY", "10111");
		pkg.set_recipient_info("Suzan S", "222 Two Street", "New York", "NY", "10222");
		System.out.println(pkg);

		TwoDayPackage pkg_2d = new TwoDayPackage(5.0, 10.5, 1.0); // $5.0 surcharge, 10.5 ounces, $1.0 per ounce
		pkg_2d.set_sender_info("Michael K", "111 One Street", "New York", "NY", "10111");
		pkg_2d.set_recipient_info("Suzan S", "222 Two Street", "New York", "NY", "10222");
		System.out.println(pkg_2d);

		OverNightPackage pkg_overNight = new OverNightPackage(1.0, 10.5, 1.0);
		pkg_overNight.set_sender_info("Suzan S", "222 Two Street", "New York", "NY", "10222");
		pkg_overNight.set_recipient_info("TESTT K", "111 One Street", "New York", "NY", "10111");
		System.out.println(pkg_overNight);

	}

}