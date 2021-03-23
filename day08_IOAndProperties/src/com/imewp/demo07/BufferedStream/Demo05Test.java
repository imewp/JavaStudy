package com.imewp.demo07.BufferedStream;

import java.io.*;
import java.util.HashMap;

/*
    练习：对文本的内容进行排序
*/
public class Demo05Test {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<String, String>();
        BufferedReader br = new BufferedReader(new FileReader("day08_IOAndProperties/src/com/imewp/demo07/BufferedStream/in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day08_IOAndProperties/src/com/imewp/demo07/BufferedStream/out.txt"));

        String str = "";
        while ((str = br.readLine()) != null) {
            String[] arr = str.split("\\.");
            map.put(arr[0], arr[1]);
        }

        for (String key : map.keySet()) {
            bw.write(key + "." + map.get(key));
            bw.newLine();
        }


        bw.close();
        br.close();


    }
}
