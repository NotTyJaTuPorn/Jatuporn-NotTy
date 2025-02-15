package TestChap6;

public class Customer extends Person {
    private String ctmType;
    private double payment;

    public Customer(String n, int a, String s, String t, double p) {
        super(n, a, s);
        this.ctmType = t;
        this.payment = p;
    }

    public Customer(String ctmType, double payment, String n, int a, String s) {
        super(n, a, s);
        this.ctmType = ctmType;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nประเภทลูกค้า : " + ctmType + "\nเงินค้างชำระ : " + payment + " บาท";
    }

}
