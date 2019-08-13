public class lab_02_01_01 {
    public static void main(String[] args) {
        Student st = new Student();
        Student[] stud = new Student[5];
        Student stud1 = new Student(1,"First", "Pierwszy", "SecondName","2,12,2000", "City", "+375333333333", "FIC", 3, "321as");
        Student stud2 = new Student(2,"Second", "Drugi", "SecondName","29,04,2000", "City", "+375333333333", "CAD", 5, "53-qw12");
        Student stud3 = new Student(3,"Third", "Trzeci", "SecondName","7,02,1999", "City", "+375333333333", "IT", 1, "2q");
        Student stud4 = new Student(4,"Fourth", "Czwarty", "SecondName","21,06,1998", "City", "+375333333333", "CAD", 3, "2q");
        Student stud5 = new Student(5,"Fifth", "Pięty", "SecondName","16,10,2001", "City", "+375333333333", "IT", 1, "2q");

        stud[0] = stud1;
        stud[1] = stud2;
        stud[2] = stud3;
        stud[3] = stud4;
        stud[4] = stud5;

        for(Student s : stud){
            s.show();
        }
        System.out.println("Факультет IT:");
        for(Student s : stud){
            s.faculty();
        }
        System.out.println("Список факультетов и курсов: ");
        System.out.println("Факультет CAD");
        System.out.println("1 КУРС:");
        for(Student s : stud){
            s.listFaculty("CAD", 1);
        }

        System.out.println("Студенты с 2000 г. рождения:");
        for(Student s : stud){
            s.age(2000);
        }
    }


}
class Student{
    private int id;
    private String lastName;
    private String firstName;
    private String secondName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int year;
    private String group;

    public Student(){

    }

    public Student(int id, String lastName, String firstName, String secondName, String birthday, String address, String phoneNumber,
                   String faculty, int year, String group){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.year = year;
        this.group = group;
    }

    // get'тэры
    public int getId(){
        return id;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public String getBirthday(){
        return birthday;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getFaculty(){
        return faculty;
    }
    public int getYear(){
        return year;
    }
    public String getGroup(){
        return group;
    }


    public void setId(int id){
        this.id = id;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public void setName(String firstName){
        this.firstName = firstName;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public void setAdress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setGroup(String group){
        this.group = group;
    }

    public void show(){
        System.out.println(getId() + " " + getLastName() + " " + getName() + " " + getSecondName() + " " + getBirthday() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                + " " + getYear() + " " + getGroup());
    }

    public void faculty(){
        if(this.getFaculty().equals("CAD")){
            System.out.println(getId() + " " + getLastName() + " " + getName() + " " + getSecondName() + " " + getBirthday() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getYear() + " " + getGroup());
        }
    }
    public void listFaculty(String faculty, int year){

        if(getFaculty().equals(faculty) && getYear() == year){

            System.out.println(getId() + " " + getLastName() + " " + getName() + " " + getSecondName() + " " + getBirthday() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getYear() + " " + getGroup());
        }
    }

    public void age(int years){
        String[] strBirthday = getBirthday().split(",");
        //System.out.print(strBirthday[0] + " " + strBirthday[1] + " " + strBirthday[2]);
        int year = (int)Integer.valueOf(strBirthday[2]);
        if(year >= years){
            System.out.println(getId() + " " + getLastName() + " " + getName() + " " + getSecondName() + " " + getBirthday() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getYear() + " " + getGroup());
        }
    }

}