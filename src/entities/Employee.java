package entities;


public class Employee extends Person {
    private static int LAST_ID = 0;
    private Level level;
    private Position position;
    private double salary;

    public Employee(String fullName, String dateOfBirth, Gender gender, String idCard, String phoneNumber, String email, Level level, Position position, double salary) {
        super(fullName, dateOfBirth, gender, idCard, phoneNumber, email);
        setId(Employee.LAST_ID++);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
        setId(LAST_ID++);
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return employee.getId() == this.getId();
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", level=" + level +
                ", position=" + position +
                ", salary=" + salary +
                '}' + '\n';
    }
}
