public class Course {
   private String teacherName;
   private String studentName;
   private int ID;

   public Course(String teacherName, String studentName, int ID) {
      this.teacherName = teacherName;
      this.studentName = studentName;
      this.ID = ID;
   }

   public String getTeacherName() {
      return teacherName;
   }

   public void setTeacherName(String teacherName) {
      this.teacherName = teacherName;
   }

   public String getStudentName() {
      return studentName;
   }

   public void setStudentName(String studentName) {
      this.studentName = studentName;
   }

   public int getID() {
      return ID;
   }

   public void setID(int ID) {
      this.ID = ID;
   }

   @Override
   public String toString() {
      return "Course{" +
              "teacherName='" + teacherName + '\'' +
              ", studentName='" + studentName + '\'' +
              '}';
   }
}
