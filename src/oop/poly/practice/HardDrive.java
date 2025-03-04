package oop.poly.practice;

public class HardDrive extends ComputerPart {

    HardDrive(String partName, int partPrice){
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("Hard Drive: " + this.partName + ", Price: " + this.partPrice);
    }
}
