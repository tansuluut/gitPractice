package bilderPractice;

public abstract class PhoneBuilder {
    Phone phone;
    void createPhone(){
        phone = new Phone();
    }
    abstract  void setModel();
    abstract  void setPrise();
    abstract  void setOwner();
    Phone getPhone (){
        return phone;
    }


}
