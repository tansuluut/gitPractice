package bilderPractice;

public class SamsungBuilder extends PhoneBuilder{
    @Override
    void setModel() {
        phone.setModel("samsung A");
    }

    @Override
    void setPrise() {
        phone.setPrice(80000);

    }

    @Override
    void setOwner() {
        phone.setOwner("tanos");
    }
}
