package proj_6;
public class Wrong extends Exception{   //自定义异常类Wrong，从Exception类继承
    public Wrong(String str){
        super(str);
    }
}