package tw.gymlife.forum.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course[] courses = { new Course("0001", "國際講師師資一對一", false, "課程", "私人課程", 3500),
				new Course("0002", "高階一對一", false, "課程", "私人課程", 1000) };
		Gson gson = new Gson();
		String json = gson.toJson(courses); // Convert the array to JSON string
		System.out.println(json);
		Map<String, Course> privateCourses = new HashMap<>();
		// Assuming 'courses' is a collection of Course objects fetched from the
		// database
		for (Course course : courses) {
			if (course.isPrivate()) { // Assuming isPrivate() checks whether a course is private
				privateCourses.put(course.getId(), course);
			}
		}
	}

}
