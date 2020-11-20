package gradebook;

public class GradeController {
	private GradeService gradeService;

	public GradeController() {
		gradeService = new GradeServiceImpl();
	}

	public void addGrade(GradeDTO grade) {
		gradeService.addGrade(grade);
	}

	public void updateGrade(GradeDTO grade) {
		gradeService.updateGrade(grade);
	}

	public void deleteGrade(GradeDTO grade) {
		gradeService.deleteGrade(grade);
	}

	public int getSum(GradeDTO grade) {
		return gradeService.sum(grade);
	}

	public float getAvg(int sum) {
		return gradeService.avg(sum);

	}

	public GradeDTO[] getGradeSort() {
		return gradeService.gradeSort();
	}
}
