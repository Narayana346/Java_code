package design_patten.creational.builder;

public class User {
    private String name;
    private String email;
    private String address;
    private int age;

    public static class Builder{
        private String name;
        private String email;
        private String address;
        private int age;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public Builder setAddress(String address){
            this.address = address;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        public User build(){
            User user = new User();
            user.name = this.name;
            user.email = this.email;
            user.address = this.address;
            user.age = this.age;
            return user;
        }

    }
    public static Builder Builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", address=" + address + ", age=" + age +"]";
    }
}
