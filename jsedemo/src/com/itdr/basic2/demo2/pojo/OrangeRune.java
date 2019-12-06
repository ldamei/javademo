package com.itdr.basic2.demo2.pojo;

public class OrangeRune extends Epigraph{
    private String adHurt;//物理攻击
    private String apHurt;//法术攻击
    private String adpass;//物理穿透
    private String appass;//法术穿透
    private String addefense;//物理防御
    private String maxlife;//最大生命
    private String adSpeed;//攻速
    private String adblood;//物理吸血
    private String crit;//暴击率
    private String criteffect;//暴击效果

   //有参构造方法
    public OrangeRune(String oname,String color,String category,String level,String adHurt,String adSpeed,String crit,String maxlife,String adpass){
        this.ename = oname;
        this.color = color;
        this.category = category;
        this.level = level;
        this.adHurt = adHurt;
        this.adSpeed = adSpeed;
        this.crit = crit;
        this.maxlife = maxlife;
        this.adpass = adpass;
    }

    //成员方法（把属性的值取出来）
    public String getAdHurt(){
        return this.adHurt;
    }
    public String getAdSpeed(){
        return this.adSpeed;
    }
    public String getCrit(){
        return this.crit;
    }
    public String getMaxlife(){
        return this.maxlife;
    }
    public String getAdpass(){
        return this.adpass;
    }
}
