package BitManipulation;

public class GetSetClearBit {

    // get the ith Bit
    public static int getBit(int num, int i){
        int Bitmask=1<<i;
        if((num&Bitmask)==0)
            return 0;
        else 
            return 1;
    }
    //set the ith Bit
    public static int setBit(int num,int i){
        int Bitmask=1<<i;
        return (num|Bitmask);
    }

    // clear the Ith Bit 
    public static int clearIthBit(int num,int i){
        int Bitmask=~(1<<i);
        return num & Bitmask;
    }
    // clear the last I bits
    public static int clearLast(int num, int i){
        int Bitmask=(~0)<<i;
        return num&Bitmask;
    }
    
    public static void main(String[] args) {
    }
}
