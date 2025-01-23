package workshop8;

public class GradeCalculator {

	public static float gradesCalc(float NMC, float AI) {
		return NMC + AI;

	}

	public static void main(String[] args) {
		float grade = gradesCalc(12, 123);
		System.out.println(grade);

	}

}
