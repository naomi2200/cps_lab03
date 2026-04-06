package pe.edu.tecsup.lab03.entities;

public class StudentEntity {
    private String name;
    private int age;
    private String career;

    public StudentEntity(String name, int age, String career) {
        this.name = name;
        this.age = age;
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCareer() {
        return career;
    }
}