
public class GradeAnalyzer {
	// class fields
	private final static int A_PLUS = 98;
	private final int A = 92;
	private final int A_MINUS = 90;
	private final int B_PLUS = 88;
	private final int B = 85;
	private final int B_MINUS = 80;
	private final int C_PLUS = 76;
	private final int C = 70;
	private final int D = 60;
	private final int F = 50;
	private final int maximum = 110;
	private final int minimum = 0;
	// Instance fields
	private int aPlus = 0;
	private int a = 0;
	private int aMinus = 0;
	private int bPlus = 0;
	private int b = 0;
	private int bMinus = 0;
	private int cPlus = 0;
	private int c = 0;
	private int d = 0;
	private int f = 0;
	// parameters are necessary to calculate
	private int total_num;
	private double sumOfGrade;
	private double sumOfSquareGrade;
	private double averageOfGrade;
	private double standardDeviation;

	public boolean isValidGrade(double aGrade) {
		boolean a = false;
		if (minimum <= aGrade && aGrade <= maximum) {
			a = true;
		}
		return a;
		// return minimum <= aGrade && aGrade <= maximum
	}

	public void addGrade(double aGrade) {

		if (this.isValidGrade(aGrade)) {
			if (aGrade >= A_PLUS) {
				aPlus = aPlus + 1;
			} else if (aGrade >= A) {
				a = a + 1;
			} else if (aGrade >= A_MINUS) {
				aMinus = aMinus + 1;
			} else if (aGrade >= B_PLUS) {
				bPlus = bPlus + 1;
			} else if (aGrade >= B) {
				b = b + 1;
			} else if (aGrade >= B_MINUS) {
				bMinus = bMinus + 1;
			} else if (aGrade >= C_PLUS) {
				cPlus = cPlus + 1;
			} else if (aGrade >= C) {
				c = c + 1;
			} else if (aGrade >= D) {
				d = d + 1;
			} else {
				f = f + 1;
			}
			total_num += 1;
			sumOfGrade += aGrade;
			sumOfSquareGrade += Math.pow(aGrade, 2);
		} else {
			System.out.println("The score you type is out of bound!");
		}
	}

	public void analyzeGrade() {
		averageOfGrade = sumOfGrade / total_num;
		standardDeviation = Math.sqrt(sumOfSquareGrade/total_num - (Math.pow(averageOfGrade, 2)));
	}

	public String toString() {
		String s1 = "You entered " + total_num + " valid grades from 0 to 110. Invalid grades are ignored!";
		String s2 = "\n\nThe average = " + averageOfGrade + " with a standard deviation = " + standardDeviation;
		String s3 = "\n\nThe grade distribution is:\n\nA+ = " + aPlus + "\nA = " + a + "\nA- = " + aMinus + "\nB+ = "
				+ bPlus + "\nB = " + b + "\nB- = " + bMinus + "\nC+ = " + cPlus + "\nC = " + c + "\nD = " + d + "\nF = "
				+ f;
		return s1 + s2 + s3;
	}
}
