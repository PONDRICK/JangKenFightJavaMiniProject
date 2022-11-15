package projectgame;

import java.util.Random;

/*
 * Class ควบคุมการทำงานระบบการเล่นเกมส์
 */
public class Gamesystem {
    //ประกาศ Attribute//
    Player player = new Player(); //ทำการสร้าง object ของ Player
    Boss boss = new Boss();//ทำการสร้าง object ของ Boss
    public int Bossch ; //ประกาศตัวแปรตัวเลือกของ Boss
    public int critical ;//ประกาศตัวแปร Critical Damage
    public int lpp = player.getLifepoint(); //ประกาศตัวแปร Lifepoint ของ Player
    public int lpb = boss.getLifepoint();//ประกาศตัวแปร Lifepoint ของ Boss
    public int result ; //ประกาศตัวแปรผล ชนะ/แพ้ ของ Player ในแต่ละรอบ
    
    //--method ที่สำหรับรับจาก Player ที่เลือกมา--//
    public void Choose(int choice){
         Random rand = new Random();//ประกาศ Random
         critical = rand.nextInt(100); //ให้Critical สุ่มพลังการโจมตี
         Bossch = boss.Bosschoose();//ตัวเลือกของ Boss เท่ากับ method Bosschoose ที่ทำการสุ่มเลือก
         
         //--ถ้า Player เลือก 1(Rock)--//
         if(choice == 1){ 
             if(Bossch == 1){ //ถ้า Boss เลือก 1(Rock)
                 result = 0; //ผลลัพธ์ออกมาเสมอ (0)
             }
             if(Bossch == 2){//ถ้า Player เลือก 2(Paper)  
                  lpp--; //Lifepoint ของ Player ลดลง 1
                  player.setLifepoint(lpp);//ทำการ Set Lifepoint ใหม่
                  result = 2; //ผลลัพธ์ออกมาแพ้ Boss (2)
             }
             if (Bossch == 3) {//ถ้า Player เลือก3(Scissors)
                    result = 1;   //ผลลัพธ์ออกมาชนะ Boss (1)
                    if(critical<=35){ //ถ้า Critical มากกว่า 35 สามาารถโจมตี Boss เป็น 2เท่า
                        lpb--;  //Lifepoint ของ Boss ลดลง 1
                        boss.setLifepoint(lpb);//ทำการ Set Lifepoint ใหม่
                    }
                    lpb--;  //Lifepoint ของ Boss ลดลง 1
                    boss.setLifepoint(lpb);//ทำการ Set Lifepoint ใหม่
                }
             
         }
         
          //--ถ้า Player เลือก 2(Paper)--//
         else if(choice == 2){
             if(Bossch == 1){//ถ้า Boss เลือก 1(Rock)
                    result = 1; //ผลลัพธ์ออกมาชนะ Boss (1)
                    if(critical<=35){//ถ้า Critical มากกว่า 35 สามาารถโจมตี Boss เป็น 2เท่า
                        lpb--;//Lifepoint ของ Boss ลดลง 1
                        boss.setLifepoint(lpb);//ทำการ Set Lifepoint ใหม่
                    }
                    lpb--;//Lifepoint ของ Boss ลดลง 1
                    boss.setLifepoint(lpb);//ทำการ Set Lifepoint ใหม่
                 
             }
             if(Bossch == 2){//ถ้า Boss เลือก 2(Paper)  
                  result = 0; //ผลลัพธ์ออกมาเสมอ (0)
             }
             if (Bossch == 3) {//ถ้า Boss เลือก3(Scissors)
                  lpp--;//Lifepoint ของ Player ลดลง 1
                  player.setLifepoint(lpp);//ทำการ Set Lifepoint ใหม่
                  result = 2; //ผลลัพธ์ออกมาแพ้ Boss (2)
                }
         }
         
         //--ถ้า Boss เลือก3(Scissors)--//
         else if(choice == 3){
             if(Bossch == 1){//ถ้า Boss เลือก1(Rock)
                  lpp--;//Lifepoint ของ Player ลดลง 1
                  player.setLifepoint(lpp);//ทำการ Set Lifepoint ใหม
                  result = 2;//ผลลัพธ์ออกมาแพ้ Boss (2)
             }
             if(Bossch == 2){//ถ้า Boss เลือก 2(Paper)  
                  result = 1;//ผลลัพธ์ออกมาชนะ Boss (1)
                    if(critical<=35){//ถ้า Critical มากกว่า 35 สามาารถโจมตี Boss เป็น 2 เท่า
                        lpb--;//Lifepoint ของ Boss ลดลง 1
                        boss.setLifepoint(lpb);//ทำการ Set Lifepoint ใหม่
                    }
                    lpb--;//Lifepoint ของ Boss ลดลง 1
                    boss.setLifepoint(lpb);//ทำการ Set Lifepoint ใหม่
             }
             if (Bossch == 3) {//ถ้า Boss เลือก3(Scissors)
                    result = 0;//ผลลัพธ์ออกมาเสมอ (0)
                }
         }
    }
    
}
    