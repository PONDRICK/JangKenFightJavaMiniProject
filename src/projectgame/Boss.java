package projectgame;

import java.util.Random;

public class Boss extends Stat{
    Random rnd = new Random();  //ทำการสร้าง Random
    public Boss(){ 
        Lifepoint = 5;  // ตั้ง lifepoint เริ่มต้น 
        name = "PUKHUD";    // ตั้งชื่อ Boss
    }
     //--method(override) ทำการเรียก Lifepoint--//
    @Override
    public int getLifepoint() {
        return Lifepoint;   //ส่งค่า Lifepoint
    }
    
    //--method(override) ทำการ set Lifepoint--//
    @Override
    public void setLifepoint(int newpoint) {
       this.Lifepoint = newpoint;   //set lifepoint เท่ากับ lifepoint ใหม่
    }
    
     //--method(override) ทำการเลือกของ boss จากการสุ่มเลือก--//
    public int Bosschoose(){
        int choice;  //ตั้งตัวแปร choice
        choice = rnd.nextInt(3)+1;  // choice เท่ากับ สุ่มเลขของ choice ของ boss
        return choice;   //ส่งค่า ตัวเลือกของ Boss
    }
    
    //--method(override) ทำการเรียก ชื่อ--//
    @Override
    public String getName() {
        return name; //ส่งค่า ชื่อ
    }
    
}
