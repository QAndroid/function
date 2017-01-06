package com.qandroid.function.log;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.orhanobut.logger.Logger;
import com.qandroid.function.R;
import com.qandroid.function.login.model.LoginParamQ;
import com.thoughtworks.xstream.XStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        //普通的log输出
        Log.v("qandroid-log", "log Verbose");
        Log.d("qandroid-log", "log Debug");
        Log.i("qandroid-log", "log Info");
        Log.w("qandroid-log", "log Warning");
        Log.e("qandroid-log", "log Error");

        //logger日志输出
        //初始化，设置logger的tag
        Logger.init("qandroid-logger").methodCount(4).hideThreadInfo();
        //输出debug，Error，Warning等级别信息
        Logger.d("logger Debug");
        Logger.e("logger Error");
        Logger.w("logger Warning");
        Logger.v("logger Verbose");
        Logger.wtf("logger wtf");
        //输出JSON格式信息
        LoginParamQ loginParamQ = new LoginParamQ("123", "456");
        Logger.json(JSON.toJSONString(loginParamQ));
        //输出XML格式信息
        XStream xStream = new XStream();
        Logger.xml(xStream.toXML(loginParamQ));
        //其它方法日志输出调用
        Logger.t("qandroid-logger1").d("logger t()");
        Logger.log(Logger.DEBUG, "qandroid-logger2", "logger log()", null);
        //输出格式化日志信息
        Logger.d("logger Debug %s %d", "hello", 7);
        //输出List格式信息
        List<String> arrayList = new ArrayList();
        arrayList.add("Debug");
        arrayList.add("Error");
        arrayList.add("Warning");
        Logger.d(arrayList);
        //输出Map格式信息
        Map<String, String> hashMap = new HashMap();
        hashMap.put("d", "Debug");
        hashMap.put("e", "Error");
        hashMap.put("w", "Warning");
        Logger.d(hashMap);
        //输出Set格式信信息
        Set<String> hashSet = new HashSet();
        hashSet.add("Debug");
        hashSet.add("Error");
        hashSet.add("Warning");
        Logger.d(hashSet);
        //输出数组格式信息
        String[] strings = new String[]{"Debug", "Error", "Warning"};
        Logger.d(strings);
    }
}
