package CIST2awJavaw5;

public class Multichecker {

    int arg;

    String check(int n){
        if(n%arg == 0){
            return arg + "の倍数である";
        }
        else{
            return arg + "の倍数でない";
        }
    }
}
