public class JavaTeacher {
    private static JavaTeacher teacherInstance = null;
    private JavaTeacher(){
        System.out.println("Constructor invoked");
    }
    public static JavaTeacher getTeacherInstance(){
        if(teacherInstance == null){
            teacherInstance=new JavaTeacher();
        }
        return teacherInstance;
    }
}
class JavaStudent{
    public static void main(String[] args) {
        JavaTeacher.getTeacherInstance();
    }
}