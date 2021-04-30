
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"java + react",0){};
		Course course2 = new Course(1,"c# + angular",0){};
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println("Kurs : " + course.lessonName);
		}

		Instructor instructor1 = new Instructor(1, "Mehmet Emin");
		Instructor instructor2 = new Instructor(2, "Ahmet baki");
		
		Instructor[] instructors = {instructor1, instructor2};
		
		for (Instructor instructor : instructors) {
			System.out.println("Ogretmen : " + instructor.name);
		}
		
		
		CourseService courseService = new CourseService();
			courseService.Add(course1);
			courseService.Add(course2);
			
			courseService.Remove(course1);
			courseService.Remove(course2);
	}

}
