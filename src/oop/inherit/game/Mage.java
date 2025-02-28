package oop.inherit.game;

public class Mage extends Player {
    int mana;

    public Mage(String nickName){
        super();
        this.mana = 100;
    }


    @Override
    public void  showStatus(){
        super.showStatus();
        System.out.println("# mana = " + mana);
    }
}
