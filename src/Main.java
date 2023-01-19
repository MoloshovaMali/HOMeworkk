public class Main {
    public static void main(String[] args) {

        EnglishCourse englishCourse = new EnglishCourse("Aidana", "Malika",1456);
        System.out.println("English Teacher->" + englishCourse.getTeacherName() + ",Student " + englishCourse.getStudentName()+
                " ,id "+englishCourse.getID());

        ITCourse itCourse = new ITCourse("Meder", "Malika",23455);
        System.out.println("IT Teacher-> " + itCourse.getTeacherName() + ",Student " + itCourse.getStudentName()+
                " ,id "+englishCourse);

    }
}