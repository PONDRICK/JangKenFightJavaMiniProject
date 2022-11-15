package projectgame;

public class Player extends Stat{
    Player(){
        Lifepoint = 5;  // ตั้ง lifepoint เริ่มต้น 
    }

    @Override
    public int getLifepoint(){  //method ทำการเรียก Lifepoint
        return Lifepoint;   //ส่งค่า Lifepoint
    }
    @Override
   public void setLifepoint(int newpoint){  //method ทำการ set Lifepoint
       this.Lifepoint = newpoint;   //set lifepoint เท่ากับ lifepoint ใหม่
   }
    @Override
   public void setName(String name){    //method ทำการ set ชื่อ
       this.name = name;     //set ชื่อ เท่ากับ ชื่อใหม่
   }

    @Override
    public String getName() { //method ทำการเรียกชื่อ
        return name;    //ส่งค่าชื่อ
    }
}
