package oop.poly.practice;

public class Memory extends ComputerPart {

    Memory(String partName, int partPrice){
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("Memory: " + this.partName + ", Price: " + this.partPrice);
    }
}
