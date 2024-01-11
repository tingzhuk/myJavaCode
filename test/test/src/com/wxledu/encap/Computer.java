package com.wxledu.encap;

public class Computer {
    private String cpu;
    private int memory;
    private int hardDisk;

    public Computer() {
    }

    public Computer(String cpu, int memory, int hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public String getCpu() {
        return cpu;
    }

    //返回Computer的详细信息
    public String getDetail(){
        return "cpu型号" + this.cpu + ",内存大小" + this.memory + ",硬盘大小" + this.hardDisk;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }
}
