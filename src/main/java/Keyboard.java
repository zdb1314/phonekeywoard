import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 键盘类
 */
public class Keyboard {

    //按键集
    private Map<Integer,String[]> keys = new HashMap<Integer, String[]>();;

    /**
     * 初始化方法
     */
    public void init(){
        addKey(0,new String[]{});
        addKey(1,new String[]{});
        addKey(2,new String[]{"a","b","c"});
        addKey(3,new String[]{"d","e","f"});
        addKey(4,new String[]{"g","h","i"});
        addKey(5,new String[]{"j","k","l"});
        addKey(6,new String[]{"m","n","o"});
        addKey(7,new String[]{"p","q","r","s"});
        addKey(8,new String[]{"t","u","v"});
        addKey(9,new String[]{"w","x","y","z"});
    }

    /**
     * 增加按键
     * @param key
     * @param arr
     */
    public void addKey(Integer key,String[] arr){
        keys.put(key,arr);
    }
    
    /**
     * 将数字转换为字母
     * @param arr
     * @return
     */
    public List<String> convert(Integer [] arr){
        List<String> combinationList = new ArrayList<String>();
        for (Integer num:arr) {
           String[] letterArr = keys.get(num);
           combinationList = combination(combinationList,arr2List(letterArr));
        }
        return combinationList;
    }

    /**
     * 数组转集合
     * @param arr
     * @return
     */
    private List<String> arr2List(String[] arr){
        List<String> list = new ArrayList<String>();
        for (String str:arr) {
            list.add(str);
        }
        return list;
    }

    /**
     * 组合字母
     * @param firstLetters
     * @param secondLetters
     * @return
     */
    private List<String> combination(List<String> firstLetters,List<String> secondLetters){
        List<String> nList = new ArrayList<String>();

        if (firstLetters.size()==0){
            for (String letter:secondLetters) {
                nList.add(letter);
            }
        }else {
            for (String letter:secondLetters) {
                for (String firstLetter:firstLetters) {
                    nList.add(firstLetter+letter);
                }
            }
        }
        return nList;
    }



}
