class Course {
    private String courseNumber;
    private String courseTitle;

    void setCourseNumber(String inputCourseNumber) {
        courseNumber = inputCourseNumber;
    }
    void setCourseTitle(String inputCourseTitle) {
        courseTitle = inputCourseTitle;
    } //should we have made another one for courseTitle? If not, why do we only create one for courseNumber?

    String getCourseNumber() {
        return courseNumber;
    }
    String getCourseTitle() {
        return courseTitle;
    }

    void printCourseInfo() {
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Course Title: " + courseTitle);
    }

}


class OfferedCourse extends Course {
    private String instructorName;
    private String location;
    private String time;

    void setInstructorName(String inputInstructorName) {
        instructorName = inputInstructorName;
    }
    void setLocation(String inputLocation) {
        location = inputLocation;
    }
    void setTime(String inputTime) {
        time = inputTime;
    }

    String getInstructorName() {
        return instructorName;
    }
    String getLocation() {
        return location;
    }
    String getTime() {
        return time;
    }

    void printCourseInfo() {
       super.printCourseInfo();
       System.out.println("Course Number: " + courseNumber); //having troubles with not having this red line showing up after putting the "super." before printCourseInfo.
       System.out.println("Course Title: " + courseTitle);
       System.out.println("Instructor's Name" + instructorName);
       System.out.println("Location: " + location);
       System.out.println("Time: " + time);

    }
}
