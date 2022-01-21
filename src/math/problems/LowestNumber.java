package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {

		int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

		int min = array[0];
		//int max = array [0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.print("the lowest number is " + min);
		int[] array1 = new int[1];
		array1[0] = min;


		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array1, "tbl_lowestNumber", "ID");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for (String st : lowestValue) {
			System.out.println(st);
		}
	}
}

/*
 * Write java solution to find the lowest number from this array.
 * Use one of the databases from mysql or mongodb to store and to retrieve.
 */
//find lowest number from the array
