public class Business implements Discountable {

    private String address;
    private Product product;
    private final double DISCOUNT = .25;  //SNAKE CASE

    public Business(String address, Product product) {
        this.address = address;
        this.product = product;
    }


    @Override
    public double calculateDiscount(Product product) {
        return this.DISCOUNT * product.getPrice();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public String toString() {
        return "Business{" +
                "address='" + address + '\'' +
                ", product=" + product +
                ", DISCOUNT=" + DISCOUNT +
                '}';
    }
}


