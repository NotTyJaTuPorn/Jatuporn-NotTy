package TestChap6;

public class Expost {
    public static void main(String[] args) {
        Personnel personnel1 = new Personnel("สมชาย", 35, "ชาย", "ผู้จัดการฝ่ายขาย");        
        Personnel personnel2 = new Personnel("สมหญิง", 20, "หญิง", "พนักงานขาย");
        System.out.println("-----------------------------------------------");
        System.out.println("[พนักงาน]");
        System.out.print("-----------------------------------------------");
        System.out.println(personnel1);
        System.out.print("-----------------------------------------------");
        System.out.println(personnel2);
        System.out.println("-----------------------------------------------");

        Customer customer1 = new Customer("สมพร", 40, "หญิง", "เป็นสมาชิก", 2500.0);
        Customer customer2 = new Customer("สมศรี", 27, "หญิง", "ไม่เป็นสมาชิก", 1700.0);
        System.out.println("\n-----------------------------------------------");
        System.out.println("[ลูกค้า]");
        System.out.print("-----------------------------------------------");
        System.out.println(customer1);
        System.out.print("-----------------------------------------------");
        System.out.println(customer2);
        System.out.println("-----------------------------------------------");
    }

}

//ทดสอบว่าได้รึเปล่า
