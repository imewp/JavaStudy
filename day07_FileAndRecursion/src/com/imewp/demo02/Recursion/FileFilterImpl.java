package com.imewp.demo02.Recursion;

import java.io.File;
import java.io.FileFilter;

//创建过滤器类FileFilter实现类，重写过滤方法accept，定义过滤规则
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory())
            return true;
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
