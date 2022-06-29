public class SwitchSample {
    public static void main(String[] args) {
        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 3 || x == 'b')//nếu a = 3 hoặc x = 'b' thì không in ra mà
                    // quay lại chạy vòng for cho tới khi a = 4 thì in ra rồi kết thúc chương trình
                    continue FIRST_CHAR_LOOP;
                System.out.println(" " + a + x);
            }
        }


        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);
        System.out.println(x + ", " + y + ", " + z);


    }
}
