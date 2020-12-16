    package com.example.finalwork.bean;

import com.example.finalwork.R;

import java.util.ArrayList;

public class PhoneInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc2; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public String desc;
    public PhoneInfo(int pic_id, String title, String desc) {
        rowid = 0L;
        sn = 0;
        name = "";
        desc2 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "p40", "p40pro", "R20", "vjvj", "金立F40", "华为荣耀","晓龙","小米","P30","vivo X50 Pro+"
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
            "正品P30骁龙865全网通5g手机游戏智能安卓学生价适用oppo华为耳机",
            "vivo X50 Pro+ 5G手机 8+256GB 引力 超清一亿模式 高通骁龙865 60倍超级变焦 双模5G全网通手机"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {3699,3899,5299,3599,11899,6999,8888,9988,2999,5498};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.meizu_s, R.drawable.lenovo_s, R.drawable.xiaomi_s,
            R.drawable.hongmo_s, R.drawable.apple_s, R.drawable.huawei_s,
            R.drawable.huaweip_s, R.drawable.rongyu_s, R.drawable.oppo_s,
            R.drawable.vivo_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.meizu, R.drawable.lenovo, R.drawable.xiaomi,
            R.drawable.hongmo, R.drawable.apple, R.drawable.huawei,
            R.drawable.huaweip, R.drawable.rongyu, R.drawable.oppo,
            R.drawable.vivo
    };

    public PhoneInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc2 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 获取默认的手机信息列表
    public static ArrayList<PhoneInfo> getDefaultList() {
        ArrayList<PhoneInfo> goodsList = new ArrayList<PhoneInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            PhoneInfo info = new PhoneInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<PhoneInfo> getDefaultGrid() {
        ArrayList<PhoneInfo> gridArray = new ArrayList<PhoneInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new PhoneInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12, R.drawable.skirt13, R.drawable.skirt14, R.drawable.skirt15
            , R.drawable.skirt16, R.drawable.skirt17, R.drawable.skirt18, R.drawable.skirt19
            , R.drawable.skirt20, R.drawable.skirt21, R.drawable.skirt22, R.drawable.skirt23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<PhoneInfo> getDefaultStag() {

        ArrayList<PhoneInfo> stagArray = new ArrayList<PhoneInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new PhoneInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }

}
