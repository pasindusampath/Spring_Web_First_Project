package lk.ijse.gdse.test;

import java.util.LinkedHashMap;

public class DataBase {
    LinkedHashMap<String,String> map ;

    DataBase(){
        map = new LinkedHashMap<>();
        map.put("ka","Kaluthara");
        map.put("pa","Panadura");
        map.put("ga","Galle");
        map.put("ja","Jaffna");
        map.put("ma","Mathara");
    }

}
