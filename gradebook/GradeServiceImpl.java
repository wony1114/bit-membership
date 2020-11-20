package gradebook;

public class GradeServiceImpl implements GradeService {
	private GradeDTO[] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new GradeDTO[3];
		count = 0;
	}
	@Override
	public void addGrade(GradeDTO grade) {
		grades[count] = grade;
		count++;
		
	}
	@Override
	public void updateGrade(GradeDTO grade) {
		for() {
			if() {
				
			}
			}
		}
		
		
	}
	@Override
	public void deleteGrade(GradeDTO grade) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int sum(GradeDTO grade) {
		
		return ;
	}
	@Override
	public float avg(int sum) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public GradeDTO[] gradeSort() {
		// TODO Auto-generated method stub
		return null;
	}
	


