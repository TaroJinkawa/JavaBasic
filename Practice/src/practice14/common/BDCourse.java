package practice14.common;

public class BDCourse implements Course{

	public String getCourseName() {
		return PREFIX+"DB基礎";
	}

	public String[] getCourseUnit() {
		String[] CourseUnit = {"DB基礎","SQL基礎","正規化","SQL応用"};


		return CourseUnit;
	}
}
