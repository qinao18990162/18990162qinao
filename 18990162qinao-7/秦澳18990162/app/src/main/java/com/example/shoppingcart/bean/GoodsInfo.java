package com.example.shoppingcart.bean;

import com.example.shoppingcart.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "p40", "p40pro", "R20", "vjvj", "金立F40", "华为荣耀","晓龙","小米","P30"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "12+256G全网通5g手机p40游戏智能安卓学生价便宜适用华为vivo耳机",
            "P40pro千元安卓游戏智能便宜学生手机送oppo华为荣耀小米vivo耳机",
            "R20全新上市8+256G正品新款手机智能超薄水滴屏4G全网通学生价安卓游戏全面屏送小米鼠oppo华为vivo耳机SAILF",
            "VJVJ V21(X21S)正品学生价水滴全面屏安卓游戏电信全网通智能手机.webp",
            "金立F40正品超薄全面穿孔屏官方旗舰4G全网通学生价安卓游戏千百元智能手机送华为小米oppo通用半价5g",
            "新上市5g全网通骁龙865游戏手机学生价送oppo华为荣耀小米vivo膜",
            "新上市千元学生价游戏5G网络全网通手机大屏智能865骁龙分期免息",
            "正品256G智能手机P40水滴便宜游戏学生价百元送小米vivo华为耳机",
            "正品P30骁龙865全网通5g手机游戏智能安卓学生价适用oppo华为耳机"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6888, 3999, 2999, 2899, 2698, 2098,5988,7988,7500};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.p40_s, R.drawable.p40pro_s, R.drawable.r20_s,
            R.drawable.vjvj_s, R.drawable.f40_s, R.drawable.huawei,
            R.drawable.xiaolong_s,R.drawable.xiaomi_s,R.drawable.p30_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.p40, R.drawable.p40pro, R.drawable.r20,
            R.drawable.vjvj, R.drawable.f40, R.drawable.huawei,
            R.drawable.xiaolong, R.drawable.xiaomi, R.drawable.p30
    };
    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
