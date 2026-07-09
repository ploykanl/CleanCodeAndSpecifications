package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {

    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้
    /**
     * ค้นหาkey ใน arr
     * @param arr ข้อมูลที่รับเข้ามาไม่เป็น null
     * @param key ข้อมูลที่ต้องการหา
     * @return -1
     * @throws IllegalArgumentException ถ้า arr เป็น null
    */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     * หาพื้นที่วงกลม โดยมีรัศมีมากกว่าเท่ากับ 0
     * @param radius รัศมี (ต้องมีค่า >=0)
     * @return พื้นที่วงกลม
     * @throws IllegalArgumentException ถ้า radius < 0
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)

    /**
     * แปลงข้อความ โดยตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก
     * @param s ข้อความที่ไม่เป็น null
     * @return ข้อความที่ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
