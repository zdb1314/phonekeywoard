import java.util.HashMap;

/**
 * 键盘类2.0
 */
public class KeyboardPlus extends Keyboard {


    /**
     * 初始化方法
     */
    @Override
    public void init(){
        super.init();
        this.addKey(10,new String[]{"A","B","C"});
        this.addKey(11,new String[]{"D","E","F"});
        this.addKey(12,new String[]{"G","H","I"});
        this.addKey(13,new String[]{"J","K","L"});
        //省略......
        this.addKey(99,new String[]{"X","Y","Z"});
    }



}
