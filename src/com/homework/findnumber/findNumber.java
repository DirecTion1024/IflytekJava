package com.homework.findnumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findNumber {

	@SuppressWarnings("unchecked")
	public static void test(int[] source){
        @SuppressWarnings("rawtypes")
		HashMap map=new HashMap();
        for(int i=0;i<source.length;i++){
            map.put(source[i], source[i]);
        }
        for(int i=1;i<=100;i++){
            if(!map.containsKey(i)){
                System.out.println(i+"不在数组中");
            }
        }
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
        List list=new ArrayList();
        for(int i=1;i<=100;i++){
            list.add(i);//
        }

        int[] source=new int[98];
        for(int i=0;i<source.length;i++){
            int position=(int)(Math.random()*list.size());
            source[i]=(Integer)list.get(position);
            list.remove(position);
        }

        test(source);
    }


}
