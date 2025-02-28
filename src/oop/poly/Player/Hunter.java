package oop.poly.Player;

public class Hunter extends Player {

    String pet;

    public Hunter(String nickName, String pet){
        super(nickName);
        this.pet = pet;
    }

    public void magicArrow(Player t){

        System.out.printf("%s님이 %s님에게 매직 애로우를 시전하셨습니다." , this.nickName, t.nickName);
        int damege; String job;
        if(t == this)return;
        if(t instanceof Mage){
            damege = 20;
            job = "마법사";
            t.hp -= damege;
        } else if (t instanceof Warrior) {
            damege = 10;
            job = "전사";
            t.hp -= damege;
        }else{
            damege = 15;
            job = "사냥꾼";
            t.hp -= damege;
        }
        System.out.printf("%s님(%s)이 %d의 피해를 입었습니다.\n" , t.nickName,job, damege);
        System.out.printf("%s님의 남은 체력 :  %d\n", t.nickName, t.hp);


    }
}
