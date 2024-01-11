package com.wxlwdu.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList(){
        //这里我们给 泛型 T 的 类型是 User
        Dao<User> dao = new Dao<>();

        dao.save("12",new User(1,23,"jack"));
        dao.save("23",new User(2,34,"tom"));
        dao.save("43",new User(3,45,"smith"));

        List<User> list = dao.list();
        System.out.println(list);

        dao.update("12",new User(3,18,"milan"));
        list = dao.list();
        System.out.println("====修改后====");
        System.out.println(list);

        dao.delete("43");
        list = dao.list();
        System.out.println("====删除后====");
        System.out.println(list);
    }
}
