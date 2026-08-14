package task;

public class Employee extends Person {
    String position;
    String email;

    String getFirstName() {
        fullName = fullName.trim();
        int spaceIndex = fullName.indexOf(" ");
        return fullName.substring(0, spaceIndex);
    }

    String getLastName() {
        fullName = fullName.trim();
        int spaceIndex = fullName.indexOf(" ");
        return fullName.substring(spaceIndex + 1);
    }

    boolean isCompanyEmail() {
        return email.endsWith("@company.com");
    }

    @Override
    public String toString() {
        return super.printInfo() +
                "\n Enter First name: " + getFirstName() +
                "\n Enter Last name: "  + getLastName() +
                "\n Enter age: " + age +
                "\n Enter Position: " + "position" +
                "\n Enter Annotations.Email: " + email +
                "\n is company email: " + isCompanyEmail();
    }
}
/* mainde
task.Employee employee1 = new task.Employee();

employee1.fullName = "Ali Valiyev";
employee1.age = 25;
employee1.position = "Developer";
employee1.email = "ali@company.com";

task.Employee employee2 = new task.Employee();
employee2.fullName = "Elnara Baghirova";
employee2.age = 25;
employee2.position = "Designer";
employee2.email = "elnara@gmail.com";

task.Employee employee3 = new task.Employee();
employee3.fullName = "Fidan Ahmedova";
employee3.age = 22;
employee3.position = "Manager";
employee3.email = "fidan@company.com";

//        task.Employee[] employees = {employee1, employee2, employee3};
//
//        for (task.Employee employee: employees) {
//            System.out.println();
//            employee.printInfo();
//
//            System.out.println("First Name: "+ employee.getFirstName());
//            System.out.println("Last Name: "+ employee.getLastName());
//            System.out.println("Position: "+ employee.position);
//            System.out.println("Annotations.Email: "+ employee.email);
//            System.out.println("Is company Annotations.Email: " + employee.isCompanyEmail());
//        }
        System.out.println(employee1.toString());*/