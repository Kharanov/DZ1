package DZ5;

public class Employer {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    public int age;

    public Employer(String _name, String _position, String _email, String _phone, int _salary, int _age) {
        name = _name;
        position = _position;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    public void printEmployer() {
        System.out.println("FIO - " + name);
        System.out.println("Dolzhnost' - " + position);
        System.out.println("e-mail - " + email);
        System.out.println("phone - " + phone);
        System.out.println("zarplata - " + salary);
        System.out.println("vozrast - " + age);
        System.out.println("-------------------------------");
    }
}
