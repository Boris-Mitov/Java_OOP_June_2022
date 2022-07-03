package WorkingWithAbstraction.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsByName;

    public StudentSystem() {
        this.studentsByName = new HashMap<>();
    }

    public Map<String, Student> getStudentsByName() {
        return this.studentsByName;
    }

    public void ParseCommand(String[] commandLine) {

        String command = commandLine[0];
        String name = commandLine[1];
        if (command.equals("Create")) {
            int age = Integer.parseInt(commandLine[2]);
            double grade = Double.parseDouble(commandLine[3]);

            if (!studentsByName.containsKey(name)) {
                Student student = new Student(name, age, grade);
                studentsByName.put(name, student);
            }

        } else if (command.equals("Show")) {

            Student student = studentsByName.get(name);

            if (student != null) {
                System.out.println(student.getInfo());
            }

        } else {
            throw new IllegalArgumentException("Unknown command " + command);
        }
    }
}
