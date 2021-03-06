package StudentFactory;

public class WebTechFactory extends Factory{

	@Override
	public void bulitCourse() {
		course = new Course("Web Tech - 502");
	}

	@Override
	public void addStudentsToCourse() {
		course.addStudent(new WebTechStudent(810, "Shahla Shaan Ahmed"));
		course.addStudent(new WebTechStudent(811, "Tulshi Chandra Dash"));
		course.addStudent(new WebTechStudent(812, "Jubayer"));
		course.addStudent(new WebTechStudent(813, "Shaikh Shihabuddin"));
		course.addStudent(new WebTechStudent(814, "Mohammad Ibrahim"));
		course.addStudent(new WebTechStudent(815, "Shuvradev Shaha"));
		
	}

	@Override
	public void addTeacherToCourse() {
		course.addTeacher(new WebTechTeacher("Nurul Ahamed Touhid"));
	}

}
