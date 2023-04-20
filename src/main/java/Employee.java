public abstract class Employee extends Customer{
    //constant variable
    protected final double EMPLOYEE_DISCOUNT = .10;


    public Employee(String name, Product[] products, Size size) {
        super(name, products, size);
    }

    //ABSTRACT METHODS JUST HAVE SIGNATURES , NO BODY{} / IMPLEMENTATION
    abstract void printEmployeePriceAfterDiscount(Product product); //camelCase

    public double calculateDiscount(Product product) {
        return product.getPrice() * EMPLOYEE_DISCOUNT;
    }


}