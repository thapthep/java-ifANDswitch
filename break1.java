public class break1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("พบเลข 5 แล้ว! หยุดการทำงานของลูป");
                break;
            }
            System.out.println("i = " + i);
        }
    }
}