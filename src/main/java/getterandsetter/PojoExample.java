package getterandsetter;

public class PojoExample {
    String name;
    String id;
    String subject;
    String dob;
    public PojoExample(String name , String id ,String subject ,String dob)
    {
        this.name=name;
        this.id=id;
        this.subject=subject;
        this.dob=dob;

    }
    @Override
    public String toString() {
        return "PojoExample{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", subject='" + subject + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }

}
