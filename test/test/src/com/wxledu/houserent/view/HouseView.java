package com.wxledu.houserent.view;

import com.wxledu.houserent.domain.House;
import com.wxledu.houserent.service.HouseService;
import com.wxledu.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接受用户输入
 * 3.调用HouseService 完成房屋信息的各种操作
 */
public class HouseView {
    private boolean loop = true; //控制菜单显示
    private char key = ' ';//接受用户输入
    private HouseService houseService = new HouseService(2);//我们设置数组的大小为10

    //通过id，修改房源信息
    public void updateHouse(){
        System.out.println("=======删除房屋信息=======");
        System.out.println("========请输入待删除房屋的编号(-1退出)=======");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("======放弃修改房屋信息======");
            return;
        }

        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if (houseService.update(updateId)){
                System.out.println("------修改完成--------");
            }else{
                System.out.println("------修改失败--------");
            }
        }else{
            System.out.println("=====你放弃了修改房屋信息======");
        }

    }
    //完成通过id，查找房源
    public void seekHouse(){
        System.out.println("======通过id查找房屋信息=======");
        System.out.println("请输入要查找的id");
        int seekId = Utility.readInt();
        if (houseService.seek(seekId)){
            System.out.println("=====查找成功======");
        }else {
            System.out.println("====查找失败====");
        }
    }

    //完成退出确认
    public void exit(){
        //使用Utility提供的方法
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }
    //编写delHouse 界面，接受用户输入id,调用Service的删除方法
    public void delHouse(){
        System.out.println("=======删除房屋信息=======");
        System.out.println("========请输入待删除房屋的编号(-1退出)=======");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("======放弃删除房屋信息======");
            return;
        }
        char choice = Utility.readConfirmSelection();//注意该方法本身后循环判断的逻辑
        if (choice == 'Y'){
            if (houseService.del(delId)){
                System.out.println("=======删除房屋信息成功=======");
            }else {
                System.out.println("=======当前房屋编号不存在=======");
            }
        }else {
            System.out.println("你放弃了删除房屋信息~~~~~~");
        }
    }

    //编写addHouse() 接受输入，创建House对象， 调用add方法
    public void addHouse(){
        System.out.println("=======添加房屋=======");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("\n电话：");
        String phone = Utility.readString(12);
        System.out.print("\n地址：");
        String address = Utility.readString(16);
        System.out.print("\n月租：");
        int rent = Utility.readInt();
        System.out.print("\n状态：");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意 id 是系统规定的。
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house)){
            System.out.println("=======添加房屋成功=======");
        }else {
            System.out.println("=======添加房屋失败=======");
        }
    }
    //编写listHouses显示房屋列表
    public void listHouses(){
        System.out.println("=======房屋列表=======");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){//如果为空了就不输出了
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=======房屋列表显示完成=======");
    }
    //显示主菜单
    public void mainMenu(){
        do {
            System.out.println("=======房屋出租系统菜单=======");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 源");
            System.out.println("\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退       出");
            System.out.print("请输入你的选择(1~6)：");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    seekHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while(loop);
    }
}
