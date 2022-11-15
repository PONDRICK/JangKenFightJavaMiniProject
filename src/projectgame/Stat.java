package projectgame;

abstract class Stat{
    public int Lifepoint;
    public String name;
    void setName(String name){ // general methods to all sub-classes
        this.name = name;
    };
    public abstract String getName();//method ที่บังคับให้ sub-class override เพื่อทำการเรียกใช้ชื่อ
    public abstract int getLifepoint();//method ที่บังคับให้ sub-class override เพื่อทำการเรียกค่า Lifepoint
    public abstract void setLifepoint(int newpoint);//method ที่บังคับให้ sub-class override เพื่อทำการตั้งค่า Lifepoint
}
