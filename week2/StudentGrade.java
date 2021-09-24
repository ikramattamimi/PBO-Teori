package week2;

// import scanner
import java.util.Scanner;

public class StudentGrade {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// variable declaration
		double tugas, uts, uas; 
		double akhir;
		
		// create a new scanner
		Scanner sc = new Scanner(System.in);
		
		// input student's score
		System.out.print("Masukkan nilai tugas: ");
		tugas = sc.nextInt();
		System.out.print("Masukkan nilai UTS: ");
		uts = sc.nextInt();
		System.out.print("Masukkan nilai UAS: ");
		uas = sc.nextInt();
		
		// calculate final score
		akhir = ((0.2 * tugas) + (0.35 * uts) + (0.45 * uas));
		
		// grading
		if (akhir >= 85) {
			System.out.println("Grade: A");
		}
		else if (akhir >= 75 && akhir < 85) {
			System.out.println("Grade: B");
		}
		else if (akhir >= 65 && akhir < 75) {
			System.out.println("Grade: C");
		}
		else if (akhir >= 50 && akhir < 65) {
			System.out.println("Grade: D");
		}
		else if (akhir < 50) {
			System.out.println("Grade: E");
		}

	}

}
