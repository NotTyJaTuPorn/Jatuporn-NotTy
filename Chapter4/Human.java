package Chapter4;

public class Human {
    // กำหนดตัวแปรให้เป็น private
    private int legs;
    private int arms;
    private int eyes;
    private int nose;
    private int mouth;
    private String name;
    private String sex;
    private String phone;
    private String hobby;

    // Constructor เริ่มต้น
    public Human() {
        this("ไม่ทราบชื่อ");
    }

    // Constructor ที่รับแค่ชื่อ
    public Human(String name) {
        this(name, "ไม่ระบุ", "ไม่มี", "ไม่มี");
    }

    // Constructor ที่รับชื่อและเบอร์โทรศัพท์
    public Human(String name, String phone) {
        this(name, "ไม่ระบุ", phone, "ไม่มี");
    }

    // Constructor ที่รับชื่อ เพศ และเบอร์โทรศัพท์
    public Human(String name, String sex, String phone) {
        this(name, sex, phone, "ไม่มี");
    }

    // Constructor ที่รับทุกข้อมูล
    public Human(String name, String sex, String phone, String hobby) {
        this.legs = 2;
        this.arms = 2;
        this.eyes = 2;
        this.nose = 1;
        this.mouth = 1;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.hobby = hobby;
    }

    // Method สำหรับคืนค่า name
    public String tellName() {
        return name;
    }

    // Getter และ Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    // Getter สำหรับ phone
    public String getPhone() {
        return phone;
    }

    // Getter สำหรับ hobby
    public String getHobby() {
        return hobby;
    }

    // Override toString เพื่อแสดงข้อมูลของออบเจกต์
    @Override
    public String toString() {
        return String.format(
            "legs = %d, arms = %d, eyes = %d, nose = %d, mouth = %d, name = %s, sex = %s, phone = %s, hobby = %s",
            legs, arms, eyes, nose, mouth, name, sex, phone, hobby
        );
    }
}
