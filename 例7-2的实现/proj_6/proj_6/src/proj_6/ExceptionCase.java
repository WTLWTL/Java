package proj_6;
import doctor. *;
import patient. *;
import wrong. *;
public class ExceptionCase{
    public static void main(String[] args) {
        Patient p = new Patient("张三",0,10,"支气管肺炎");//生成一个Patient对象
        try{
            p.registration();
        }
        catch(Wrong w){
            System. out. println(w);
        }
        finally{
            System. out. println("（温馨提示：请遵守医院规定，先挂号，再看医生）");

        }
        Doctor d = new Doctor("支气管肺炎",60);//生成一个医生对象
        try{
            d.treatment(p);
        }
        catch(Wrong w1){
            System. out. println(w1);
        }
        finally{
            System. out. println("（温馨提示：只有正确地用药，才能保证病人的生命安全）");
        }
    }
}
