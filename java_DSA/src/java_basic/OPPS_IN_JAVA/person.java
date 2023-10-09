package OPPS_IN_JAVA;

class person {
    private int adharNo;
    protected String name;
    public int age ;
}
class studente extends person{
    int numberOfClass;
    private int price;
    protected String parenceName;
    public int mark;
}
class orissaStudent extends studente{
    private int id;
    protected String block;
    String cityName;

}
class Aska_student extends orissaStudent{
    public static void main(String[] args) {
        Aska_student a1 = new Aska_student();
        person p1 = new person();
        p1.name = a1.name;
    }
}
class cali{
    Aska_student s1 = new Aska_student();
    public  void setS1(String name) {
        this.s1.name = name;
    }

    public static void main(String[] args) {
        cali c1  = new cali();
        c1.setS1("narayana");
    System.out.println(c1.s1.name);
    System.out.println(c1.s1.age);
    }
}

