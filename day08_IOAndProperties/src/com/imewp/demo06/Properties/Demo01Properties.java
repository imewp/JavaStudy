package com.imewp.demo06.Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合 extends Hashtable<k,v> implements  Map<k,v>
    Properties 类表示了一个持久的属性集。Properties可以保存在流中或从流中加载。
    Properties集合是一个唯一和IO流结合的集合
        可以是用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读写到集合中使用
    属性列表中每个键及其对应值都是一个字符串
        Properties集合是一个双列集合，key和value默认都是字符串
*/
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show03();
    }

    /*
         可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读写到集合中使用
            void load(InputStream inStream)
            void load(Reader reader)
            参数：
                InputStream inStream；字节输入流，不能读取含有中文的键值对
                Reader reader：字符输入流，能读取含有中文的键值对
            使用步骤：
                1. 创建Properties集合对象
                2. 使用使用Properties集合中的方法load读取保存键值对的文件
                3. 遍历Properties集合
            注意：
                1. 存储键值对的文件中，键与值默认的连接符号可以使用 = ， 空格（其他符号）
                2. 存储键值对的文件中，可以使用#进行注释，被注释的键值对不会再被读取
                3. 存储键值对的文件中，键与值默认都是字符串，不用再加引号
    */
    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("day08_IOAndProperties/src/com/imewp/demo06/Properties/prop.txt"));

        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            System.out.println(key + " = " + prop.getProperty(key));
        }
    }

    /*
         可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
            void store(OutputStream out, String comments)
            void store(Writer writer, String comments)
                参数：
                    OutputStream out：字节输出流，不能写入中文
                    Writer writer：字符输出流，可以写中文
                    String comments：注释，用来解释说明保存的文件是做什么的
                                    不能使用中文，会出现乱码，默认是Unicode编码
                                    一般使用“”空字符串
        使用步骤:
            1. 创建Properties集合对象，添加数据
            2. 创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
            3. 使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
            4. 释放资源
    */
    private static void show02() {
        Properties prop = new Properties();

        prop.setProperty("张三", "3214");
        prop.setProperty("李四", "3534");
        prop.setProperty("王五", "536");
        prop.setProperty("赵六", "37547");

        FileWriter fw = null;
        try {
            fw = new FileWriter("day08_IOAndProperties/src/com/imewp/demo06/Properties/prop.txt");
            prop.store(fw, "sava data");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
        使用Properties集合存储数据，遍历取出Properties集合中的数据
        Properties集合是一个双列集合，key和value默认都是字符串
        Properties集合有一些操作字符串的特有方法
            Object setProperty(String key, String value) 致电 Hashtable方法 put 。
            String getProperty(String key) 使用此属性列表中指定的键搜索属性。
            Set<String> stringPropertyNames() 返回此属性列表中的一组键，其中键及其对应的值为字符串，包括默认属性列表中的不同键，如果尚未从主属性列表中找到相同名称的键。
    */
    private static void show01() {
        Properties prop = new Properties();

        prop.setProperty("张三", "3214");
        prop.setProperty("李四", "3534");
        prop.setProperty("王五", "536");
        prop.setProperty("赵六", "37547");

        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            System.out.println(key + " = " + prop.getProperty(key));
        }
    }
}
