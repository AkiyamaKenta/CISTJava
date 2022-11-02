package CIST2awJavaw8;

public class Club {
    private String clubName;
    private Member[] members;
    private Member komon;

    public Club(String clubName, String shimei, String komonName) {
        this.clubName = clubName;
        members = new Member[70];
        komon = new Member(shimei, komonName);
    }

    public void join(Member member){
        for(int i = 0; i < members.length; i++){
            if(members[i] == null){
                members[i] = member;
                break;
            }
        }
    }

    public void remove(String bangou){
        for(int i = 0; i < members.length; i++){
            if(members[i].getGakuseki().equals(bangou)){
                members[i] = null;
                break;
            }
        }
    }

    public void print(){
        System.out.println(clubName);
        for(Member men: members){
            if(men != null){
                men.print();
            }
        }
    }
}

