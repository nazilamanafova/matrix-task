package annotations;

public class Customer {

        @NotNull
        private String name;

        @Min(18)
        @Max(65)
        private int age;

        @Email
        private String email;

        @NotNull
        private String fin;

        public Customer(String name, int age, String email, String fin){
                this.name = name;
                this.age = age;
                this.email = email;
                this.fin = fin;
        }

}
