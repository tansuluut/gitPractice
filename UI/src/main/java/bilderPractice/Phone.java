package bilderPractice;

public class Phone {
    private String model;
    private  int price;
    private  String owner;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                '}';
    }
}
