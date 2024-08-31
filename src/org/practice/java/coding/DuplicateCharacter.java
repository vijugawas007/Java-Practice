package org.practice.java.coding;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {

    public static void main(String[] args) {
        var str = "javaagentjavaagent";

        Map<String, Long> map1 = new HashMap<String,Long>();
        String[] strarray= str.split("");

//        for (int i=0;i<strarray.length;i++){
//            if(map1.containsKey(strarray[i])){
//                map1.put(strarray[i],map1.get(strarray[i])+1);
//            }else {
//                map1.put(strarray[i],1);
//            }
//        }

        map1 =  Arrays.stream(strarray).toList().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map1);

    }
}
