package models;

public class Course {
    private String name;
    private String code;
    private byte units;
    private User teacher;

    public Course(String name, String code, byte units, User teacher) {
        this.name = name;
        this.code = code;
        this.units = units;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public byte getUnits() {
        return units;
    }

    public User getTeacher() {
        return teacher;
    }
}
