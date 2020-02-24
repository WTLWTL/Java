package proj_6;
import patient. *;
import wrong. *;
public class Doctor{
    String treatName;
    int dosage;//药物用量
    public Doctor(String treatName,int dosage){
        this.treatName = treatName;
        this.dosage = dosage;
    }
    public void treatName(Patient p) throws Wrong{//开药方法，抛出一个异常
        if(p.id!=0){
            System. out. println("患者："+p.getName()+";"+"年龄:"+p.getAge()+";"+"  病情："+p.getIllness());
            if(p.getIllness().equals("支气管肺炎")){
                if(this.dosage<40||thsi.dosage>50){//判断用药量是否正确
                System. out. println("治疗方法："+treatName+";"+"用量"+dosage+"万单位每日");
                throw new Wrong("用药量不对，请重新开药！注意安全！！"+"\n支气管肺炎的用量应该在40万-50万单位每日");
                //抛出一个自定义异常
            }
        }
            if(p.getIllness().equals("肺炎链球菌肺炎")){
                if(this.dosage<60||this.dosage>100){
                    System. out. println("治疗方法"+treatName+";"+"用量："+dosage+"万单位每日");
                    throw new Wrong("用药量不对！请重新开药！注意安全！！"+"\n肺炎链球菌肺炎地用量应在60万-80万单位每日");
                }
            }

            if(this.getIllness().equals("金黄色葡萄球菌肺炎")){
                if(this.dosage<120||this.dosage>160){
                    System. out. println("治疗方法"+treatName+";"+"用量："+ dosage+"万单位每日");
                    throw new wrong("用药量不对！请重新开药！注意安全！！"+"\n金黄色葡萄球菌肺炎地用量应在120万-160万单位每日")
                }
            }

            }
            System. out. println("治疗方法"+treatName+";"+"用量："+ dosage+"万单位每日");
            System. out. println("用药在安全范围内，可确保您的安全，祝早日康复！");
        }
    }
}