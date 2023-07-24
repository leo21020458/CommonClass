package hspedu.collection_;

import java.util.ArrayList;

public class Test02 {


    @SuppressWarnings("all")
    public static void main(String[] args) {

        int[] myArr = new int[6];
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArr[0] = 1;
        myArr[1] = 2;
        myArr[2] = 3;
        myArr[3] = 4;
        myArr[4] = 5;
        myArr[5] = 1;
        for (int i = 0; i < myArr.length; i++) {
            if(!myArrayList.contains(myArr[i])){
                myArrayList.add(myArr[i]);
            }
        }
        System.out.println(myArrayList.size());
    }


}
