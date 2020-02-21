import java.util.List;

/**
 * 第二道题的测试用例
 */
public class KeyboardPlusTest {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2,11,12,99};

        KeyboardPlus keyboardPlus = new KeyboardPlus();
        keyboardPlus.init();
        List<String> letterList = keyboardPlus.convert(arr);

        System.out.println("输出：");
        for (String letter:letterList) {
            System.out.print(letter+" ");
        }
        System.out.println();

    }

}
