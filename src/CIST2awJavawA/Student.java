package CIST2awJavawA;

public class Student {

    private String number;
    private String name;

    public Student(String arg){
        if(arg == null) {
            throw new RuntimeException();
        }
        //StringのAPI:split使用
        String[] splited = arg.split(",");
        //「,」の左右を別に格納
        this.number = splited[0];
        this.name = splited[1];
    }

    public void print(){
        String message = "学籍：" + this.number + "氏名：" + this.name;
        System.out.println(message);
    }
}
