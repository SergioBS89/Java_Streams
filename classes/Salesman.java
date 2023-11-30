package api_stream.classes;

public class Salesman extends Person{
    private String department;
    private int age;
    private String address;
    private boolean isActive;
    private int salesCount;

    public Salesman(int id, String name, String lastName, String email, String phoneNumber, double salary, String department, int age, String address, boolean isActive, int salesCount) {
        super(id, name, lastName, email, phoneNumber, salary);
        this.department = department;
        this.age = age;
        this.address = address;
        this.isActive = isActive;
        this.salesCount = salesCount;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }

    @Override
    public String toString() {
        return "Salesman{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", salary=" + getSalary() +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", isActive=" + isActive +
                ", salesCount=" + salesCount +
                '}';
    }
}
