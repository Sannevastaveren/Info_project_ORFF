package ORFF;

public class ORF {
    private int id;
    private int total;
    private int length;
    private int start;

    public ORF(int start, int length) {
    }

    public void feed(char n){
        System.out.println("Feeding the not finished ORFs");
    }
    public int getId() {
        return id;
    }

    public int getTotal() {
        return total;
    }

    public int getLength() {
        return length;
    }

    public int getStart() {
        return start;
    }
}
