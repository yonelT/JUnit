package fr.diginamic.coursDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date date = new Date(119, 03, 30);

		System.out.println(date);

		Calendar calendar = Calendar.getInstance();
		// calendar.set(2019, 3, 30);
		calendar.set(Calendar.YEAR, 2019);
		calendar.set(Calendar.MONTH, 3);
		calendar.set(Calendar.DAY_OF_MONTH, 30);
		calendar.set(Calendar.HOUR_OF_DAY, 14); // Pour les anglais 00 AM à 11PM
												// c'est HOUR
		calendar.set(Calendar.MINUTE, 45);
		calendar.set(Calendar.SECOND, 18);
		System.out.println(calendar);

		Date maDate = calendar.getTime();

		SimpleDateFormat formatteur = new SimpleDateFormat("'Le' EEEEE dd MMMMM yyyy' à 'HH:mm:ss' ms:'sss");
		String maDateFormatee = formatteur.format(maDate);
		System.out.println(maDateFormatee);

	}

}
