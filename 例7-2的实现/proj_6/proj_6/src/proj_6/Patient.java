package proj_6;
import wrong. *;//导入wrong包
public class Patient{
    private String name;
    public static int id;//静态变量id，起标志性作用：0为没挂号，非0为已挂号
    private int age;
    private String illness;
    public Patient(String name, int id, int age, String illness){
        this.name=name;
        this.id=id;
        this.age=age;
        this.illness=illness;

    }
    public String getName(){
    return name;
    }
    public int getAge(){
        return age;
    }
    public String getIllness(){
        return illness;
    }
    public void registration () throws Wrong{
        /*挂号方法，此方法用throws Wrong抛出一个异常，因此方法内部不作异常处理，而是交给此方法的调用者去异常处理*/
        if(id==0)
        {
            throw new wrong("您还没有挂号，请先去挂号！");
        }
        System. out. println("您已挂号，请到医生处就诊！");
    }
}

