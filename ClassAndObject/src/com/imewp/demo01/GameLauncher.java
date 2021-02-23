package com.imewp.demo01;

/*
    创建对象时，它会被存放在称为堆的内存区域中，不管对象如何创建都会放在此区域中。
    可回收垃圾的堆
    Java会主动帮你管理内存！当某个对象被Java虚拟机察觉不再会被使用到，该对象就会被标记成可回收的。
    如果内存开始不足，垃圾收集器就会启动来清理垃圾、回收空间，让空间能够再次被利用。
*/

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
