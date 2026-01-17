package ObjectOrientedProgramming.Inheritance;

/*
 * This class represents a basic Course
 * with common course details.
 */
class Course {

    // Name of the course
    String courseName;

    // Duration of the course (in weeks/months)
    int duration;

    // Constructor to initialize course details
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

/*
 * This class represents an Online Course
 * and extends the Course class.
 */
class OnlineCourse extends Course {

    // Platform where the course is hosted
    String platform;

    // Indicates whether the course is recorded
    boolean isRecorded;

    // Constructor to initialize online course details
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

/*
 * This class represents a Paid Online Course
 * and demonstrates multilevel inheritance.
 */
class PaidOnlineCourse extends OnlineCourse {

    // Course fee
    double fee;

    // Discount on the course fee
    double discount;

    // Constructor to initialize paid online course details
    PaidOnlineCourse(
            String courseName,
            int duration,
            String platform,
            boolean isRecorded,
            double fee,
            double discount) {

        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
}
