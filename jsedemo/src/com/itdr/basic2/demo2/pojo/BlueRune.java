package com.itdr.basic2.demo2.pojo;

public class BlueRune extends Epigraph {
    private String adHurt;//物理攻击
    private String apHurt;//法术攻击
    private String addefense;//物理防御
    private String apdefense;//法术防御
    private String maxlife;//最大生命
    private String five;//每5秒回血
    private String adblood;//物理吸血
    private String apblood;//法术吸血
    private String adSpeed;//攻速
    private String movespeed;//移速
    private  String crit;//暴击率
    //有参构造方法
    public BlueRune(String bname,String color,String category,String level,String maxlife,String adHurt,String adblood,String five,String movespeed,String crit){
        this.ename = bname;
        this.color = color;
        this.category = category;
        this.level = level;
        this.maxlife = maxlife;
        this.adHurt = adHurt;
        this.adblood = adblood;
        this.five = five;
        this.movespeed = movespeed;
        this.crit = crit;
    }
    //成员方法
    public String getMaxlife(){
        return this.maxlife;
    }
    public String getAdHurt(){
        return this.adHurt;
    }
    public String getAdblood(){
        return this.adblood;
    }
    public String getFive(){
        return this.five;
    }
    public String getMovespeed(){
        return this.movespeed;
    }
    public String getCrit(){
        return this.crit;
    }
}
