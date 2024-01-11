package com.wxledu.houserent.service;

import com.wxledu.houserent.domain.House;
import com.wxledu.houserent.utils.Utility;

/**
 * HouseService.java <=> 类 [业务层]
 * 定义 House[] , 保存 House 对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作 crud (增删改查)
 */
public class HouseService {
    private House[] houses;
    private int houseNumber = 1;//记录当前有多少房屋信息
    private int idCounter = 1;//记录当前id增长到按个值了

    public HouseService(int size){
        //new House
        houses = new House[size];//当创建HouseService的时候指定数组的大小
        //为了配合测试列表信息 初始化一个house对象
        houses[0] = new House(1,"jack","111","北京市海淀区",2000,"未出租");
    }

    //update 方法  通过id 修改 房源信息  返回一个 boolean 类型
    public boolean update(int updateId){
        //应先找到id对应的房屋下标信息
        int updateIndex = -1;
        for (int i = 0; i < houses.length; i++) {
            if (updateId == houses[i].getId()){
                updateIndex = i;
            }
        }

        if (updateId == -1){
            //说明查找失败
            System.out.println("不存在这个id对应的房屋信息！");
            return false;
        }
        System.out.print("姓名(" + houses[updateId].getName() + "):");
        houses[updateId].setName(Utility.readString(6));
        System.out.print("电话(" + houses[updateId].getPhone() + "):");
        houses[updateId].setPhone(Utility.readString(12));
        System.out.print("地址(" + houses[updateId].getAddress() + "):");
        houses[updateId].setAddress(Utility.readString(16));
        System.out.print("租金(" + houses[updateId].getRent() + "):");
        houses[updateId].setRent(Utility.readInt(10));
        System.out.print("状态(" + houses[updateId].getState() + "):");
        houses[updateId].setState(Utility.readString(3));

        return true;
    }

    //seek方法， 通过id查找房源信息 ， 返回一个boolean类型
    public boolean seek(int seekId){
        //应先找到id对应的房屋信息的下标
        int seekIndex = -2;
        for (int i = 0; i < houses.length; i++) {
            if (seekId == houses[i].getId()){
                seekIndex = i;
            }
        }
        if (seekIndex == -2){
            //说明查找失败
            return false;
        }

        System.out.println(houses[seekIndex]);
        return true;
    }
    //del方法，删除一个房屋信息，返回boolean 接受一个id好
    public boolean del(int delId){
        //应当找到房屋信息对应的下标
        //一定要搞清楚，下标和房屋的编号不是一回事
        int index = -1;
        for (int i = 0; i < houses.length; i++){
            if (delId == houses[i].getId()) {
                //要删除的房屋（id），是数组下标为i的元素
                index = i;//使用index记录这个i
            }
        }

        if (index == -1){//说明del的元素在数组中不存在
            return false;
        }

        //如果找到，这里有点男
        //思路分析：
        for (int i = index; i < houseNumber - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNumber] = null;//把当前存在的房屋信息最后一个智控
        return true;

    }
    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse){
        //判断是否还可以继续添加（占时不考虑数组扩容）
        if (houseNumber == houses.length){
            System.out.println("数组已满不能添加");
            return false;
        }
        //把newHouse对象加到，新增加一个房屋信息
        houses[houseNumber++] = newHouse;
        //程序员需要设计一个id自增长的机制
        newHouse.setId(++idCounter);
        return true;
    }

    //list方法返回houses数组
    public House[] list(){
        return houses;
    }
}
