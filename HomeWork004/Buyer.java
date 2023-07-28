package HomeWork004;

public enum Buyer {

    NINA ("Nina Smith", 31, "1234"),
    PETR ("Petr Snow", 32, "1235");
//    VOVA ("Vova Ivanov", 33, "1236");
    private String fullName;
    private int age;
    private String phone;

    Buyer(String fullName, int age, String phone) {
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
