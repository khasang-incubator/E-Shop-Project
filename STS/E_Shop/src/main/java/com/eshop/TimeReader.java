package com.eshop;

import java.util.Scanner;

public class TimeReader {
	Integer minute;

	public int getMinute() {
		getDataFromUser();
		return minute;
	}

	public void getDataFromUser() {
		try {
			@SuppressWarnings("resource")
			Scanner inputInfoMinutesFromUser = new Scanner(System.in);
			// ���� ��������� ������� ����� �������������, jvm ��������� ��� ��
			// system.in � ��������� ������
			System.out.println(Strings.enterNumber);
			minute = Integer.parseInt(inputInfoMinutesFromUser.nextLine());
			while (minute > 59 || minute < 0) {
				System.out.println(Strings.reEnterNumber);
				minute = Integer.parseInt(inputInfoMinutesFromUser.nextLine());
			}
			System.out.println(Strings.checkLocalHost);
		} catch (NumberFormatException e) {
			System.err.println("Wrong format!");
		}
	}

}
