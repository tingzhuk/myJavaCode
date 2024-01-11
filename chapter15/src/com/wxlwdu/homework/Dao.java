package com.wxlwdu.homework;

import java.util.*;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Dao <T>{ //泛型类
    private Map<String, T> map = new HashMap<>();

    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity){
        map.put(id,entity);
    }

    //遍历 map  将map 的所有的 value（entity）  封装到 ArrayList
    public List<T> list(){
        List<T> list = new ArrayList<>();

        //遍历 map  返回 list
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(map.get(key)); //也可以直接使用本类的 get  是一样的
        }
        return list;

    }

    public void delete(String id){
        map.remove(id);
    }

    public void save(String id, T entity){ //把 entity 保存到 map 中
        map.put(id,entity);
    }
}
