public class Teacher {
    public void giveAnswer() {
        System.out.println("the teacher is answering a question");
    }
    public void teach(Student student) {
        student.learn();
    }
}
