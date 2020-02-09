package proj_6;
import java.lang.invoke.WrongMethodTypeException;

import patient. *;
import wrong. *;
public class Doctor{
    String treatName;
    int dosage;//药物用量
    public Doctor(String treatName,int dosage){
        this. treatName = treatName;
        this. dosage = dosage;
    }
    public void treatName(Patient p) throws Wrong{//开药方法，抛出一个异常
        if(p. id!=0){
            System. out. println("程序执行");
        }
    }
}