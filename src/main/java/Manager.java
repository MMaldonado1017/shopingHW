public  class Manager extends Employee {

    private final double MANAGER_DISCOUNT = .05;

    public Manager(String name, Product[] products, Size size) {
        super(name, products, size);
    }

    @Override //subtract the discount amount from the price of the product
    void printEmployeePriceAfterDiscount(Product product) {
        System.out.println(product.getPrice() - calculateDiscount(product));
    }

    @Override
    public double calculateDiscount(Product product) {
        return (EMPLOYEE_DISCOUNT + MANAGER_DISCOUNT) * product.getPrice();
    }
}