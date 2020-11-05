public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudents(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    // 深拷贝对象的函数
    public Course clone() {
        Course courseClone = new Course(this.courseName);
        String[] studentsNew = new String[100];
        for (int i = 0; i < this.numberOfStudents; i++) // 深拷贝students数组
            studentsNew[i] = this.students[i];
        courseClone.students = studentsNew;
        courseClone.numberOfStudents = this.numberOfStudents;
        return courseClone;
    }

    // 测试函数
    public static void main(String[] args) {
        Course course1 = new Course("Java_Programming");    // 新建Course对象
        Course course2 = course1.clone();   // 克隆对象
        boolean sameCourse = course1 == course2;    // 表示克隆对象与原对象地址是否相同的变量
        boolean sameStudents = course1.students == course2.students;    // 表示克隆对象与原对象中的students地址是否相同的变量
        System.out.println("clone对象与原对象地址相同：" + sameCourse + "\n" + 
        "clone对象与原对象内students地址相同：" + sameStudents + "\n" + 
        "clone是深拷贝：" + (!sameCourse && !sameStudents));    // 打印测试结果
    }
}