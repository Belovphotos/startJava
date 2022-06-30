import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        String mark = " ";
        switch (randomValue) {
            case 2:
                mark = "Неудовлетворительно";
                break;
            case 3:
                mark = "Удовлетворительно";
                break;
            case 4:
                mark = "Хорошо";
                break;
            case 5:
                mark = "Отлично";
                break;

        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName()
                + " по предмету " + subject + " на оценку " + mark);
    }
}
