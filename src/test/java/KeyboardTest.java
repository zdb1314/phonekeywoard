import java.util.List;

/**
 * 第一道题的测试用例
 */
public class KeyboardTest {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2,3};

        Keyboard keyboard = new Keyboard();
        keyboard.init();
        List<String> letterList = keyboard.convert(arr);

        System.out.println("输出：");
        for (String letter:letterList) {
            System.out.print(letter+" ");
        }
        System.out.println();

    }

}
