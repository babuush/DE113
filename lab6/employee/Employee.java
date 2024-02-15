package employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    /**
     * Constructs an Employee object with the specified ID, first name, last name, and salary.
     *
     * @param id        the ID of the employee
     * @param firstName the first name of the employee
     * @param lastName  the last name of the employee
     * @param salary    the salary of the employee
     */
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    /**
     * Returns the ID of the employee.
     *
     * @return the ID of the employee
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the first name of the employee.
     *
     * @return the first name of the employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the last name of the employee.
     *
     * @return the last name of the employee
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the full name of the employee.
     *
     * @return the full name of the employee
     */
    public String getName() {
        return firstName + " " + lastName;
    }

    /**
     * Returns the salary of the employee.
     *
     * @return the salary of the employee
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee to the specified value.
     *
     * @param salary the new salary value
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Returns the annual salary of the employee.
     *
     * @return the annual salary of the employee
     */
    public int getAnnualSalary() {
        return salary * 12;
    }

    /**
     * Raises the salary of the employee by the specified percentage.
     *
     * @param percent the percentage by which to raise the salary
     * @return the new salary after the raise
     */
    public int raiseSalary(int percent) {
        this.salary += (this.salary * percent / 100);
        return this.salary;
    }

    /**
     * Returns a string representation of the Employee object.
     *
     * @return a string representation of the employee, including their ID, name, and salary
     */
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + "]";
    }
}
