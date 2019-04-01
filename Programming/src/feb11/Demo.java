package feb11;

public class Demo
{
    public static void main(String []args)
    {
        /* Test Student class */
        Student s1 = new Student("Tim Broun", "1 Happy Ave");
        System.out.println(s1);
        
        s1.addCourseGrade("IM101", 97);
        s1.addCourseGrade("IM102", 68);
        s1.addCourseGrade("IM103", 87);
        s1.addCourseGrade("IM104", 78);
        s1.addCourseGrade("IM105", 98);
        s1.addCourseGrade("IM106", 68);
        System.out.println("\nCourses list:");
        s1.printGrades();
        System.out.println("Average is " + s1.getAverageGrade());

        /* Test Teacher class */
        Teacher t1 = new Teacher("Paul Smith", "8 sunset way");
        System.out.println(t1);
        
        String course_list[] = {"IM101", "IM102", "IM101", "IM103",
                                "IM104", "IM105", "IM106"};
        for (int i=0; i<course_list.length; i++) {
            if (t1.addCourse(course_list[i])) {
                System.out.println(course_list[i]+ " added.");
            } else {
                System.out.println(course_list[i]+ " cannot be added.");
            }
        }
        System.out.println("\nCourses list:");
        t1.printCourses();

        System.out.println("\nRemoving XYZ10, IM101"); 
        t1.removeCourse("XYZ10");
        t1.removeCourse("IM101");
        
        System.out.println("\nCourses list:");
        t1.printCourses();

    }
}
