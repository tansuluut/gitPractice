package bilderPractice;

public class Director {
    PhoneBuilder builder;

   public  void  setBuilder(PhoneBuilder builder){
        this.builder = builder;
    }
    public  Phone build(){
        builder.createPhone();
        builder.setModel();
        builder.setPrise();
        builder.setOwner();
        Phone phone = builder.getPhone();
        return  phone;
    }
}
