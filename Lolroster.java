import java.awt.*;
import java.util.*;
import java.io.*;
public class Lolroster {
	private static String[] roster1;
	private static String[] roster2;
	private static String[] adcList;
	private static String[] midList;
	private static String[] supList;
	private static String[] jungList;
	private static String[] topList;
	public static void main(String[] args){
		String[] supportList;
		String[] toppList;
		String[] jungleList;
		String[] middleList;
		String[] addcList;

		String[] rosterAll;
		String[] rosterLanes;
		String path;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the path of the list of students.");
		path = s.nextLine();
		rosterAll = loadAll(path, roster1);
		rosterLanes = loadLanes(path, roster2);
		
		
		
		
		//int firstName = r.nextInt(students.length);
		
		
			System.out.println("Would you like to seperate the comp by lane? (1 = yes, 2 = no)");
			int groupNum = s.nextInt();
			if (groupNum == 1) {
				addcList = adc(rosterLanes[0], path, adcList);
				shuffle(addcList);
				System.out.println("ADC = " + addcList[0]);
				supportList = support(rosterLanes[1], path, supList);
				shuffle(supportList);
				System.out.println("Support = " + supportList[0]);
				middleList = mid(rosterLanes[2], path, midList);
				shuffle(middleList);
				System.out.println("Mid = " + middleList[0]);
				toppList = top(rosterLanes[3], path, topList);
				shuffle(toppList);
				System.out.println("Top = " + toppList[0]);
				jungleList = jungle(rosterLanes[4], path, jungList);
				shuffle(jungleList);
				System.out.println("Jungle = " + jungleList[0]);
			} else if (groupNum == 2) {
				shuffle(rosterAll);
				for (int i = 0; i<5; i++) {
					System.out.println(rosterAll[i]);
				}
			}
			
			
			
			
			
		
	}
	public static void shuffle(String[] roster) {
		Random r = new Random();
		for (int i = roster.length-1; i>0; i--) {
			String a = roster[i];
			int temp = r.nextInt(i);
			roster[i] = roster[temp];
			roster[temp] = a;
		}
		
	}
	public static String[] loadAll(String path, String[] student) {

		
		File a = new File(path);
		Scanner scan;
		
		try {
			scan = new Scanner(a);
			student = scan.nextLine().split(",");
			
		} catch(FileNotFoundException e) {
			System.out.println("Could not load file at path: " + path);
			System.exit(1);
		}
		return student;
		
	}
	public static String[] loadLanes(String path, String[] lanes) {
		File a = new File(path);
		Scanner scan;
		try {
			scan = new Scanner(a);
			lanes = scan.nextLine().split("1");
		} catch (FileNotFoundException e) {
			System.out.println("Could not load file at path: " + path);
			System.exit(1);
		}
		return lanes;
	}
	public static String[] adc(String allLanes, String path, String[] adcList) {
		File a = new File(path);
		Scanner scan;

		try {
			scan = new Scanner(a);
			for (int i = 0; i<17; i++) {
				adcList = allLanes.split(",");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not load file at path: " + path);
			System.exit(1);
		
	
		}
		return adcList;
	}
	public static String[] mid(String allLanes, String path, String[] midList) {
		File a = new File(path);
		Scanner scan;

		try {
			scan = new Scanner(a);
			for (int i = 0; i<31; i++) {
				midList = allLanes.split(",");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not load file at path: " + path);
			System.exit(1);
		
	
		}
		return midList;
	}
	public static String[] top(String allLanes, String path, String[] topList) {
		File a = new File(path);
		Scanner scan;

		try {
			scan = new Scanner(a);
			for (int i = 0; i<33; i++) {
				topList = allLanes.split(",");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not load file at path: " + path);
			System.exit(1);
		
	
		}
		return topList;
	}
	public static String[] support(String allLanes, String path, String[] supList) {
		File a = new File(path);
		Scanner scan;

		try {
			scan = new Scanner(a);
			for (int i = 0; i<13; i++) {
				supList = allLanes.split(",");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not load file at path: " + path);
			System.exit(1);
		
	
		}
		return supList;
	}
	public static String[] jungle(String allLanes, String path, String[] jungList) {
		File a = new File(path);
		Scanner scan;

		try {
			scan = new Scanner(a);
			for (int i = 0; i<21; i++) {
				jungList = allLanes.split(",");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not load file at path: " + path);
			System.exit(1);
		
	
		}
		return jungList;
	}
}