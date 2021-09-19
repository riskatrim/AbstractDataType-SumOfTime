package ADT;

public class SumOfTime {
    public static void main(String[] args) {
        time add = new time(23, 30, 45);
        time add2 = new time(4, 50, 30);

        add.print();
        add2.print();
        time result = time.sum(add, add2);
        result.print();
    }
}
class time{
    private int h;
    private int m;
    private int s;

    public time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public static time sum(time waktu1, time waktu2){
        int jam = waktu1.h + waktu2.h;
        int menit = waktu1.m + waktu2.m;
        int detik = waktu1.s + waktu2.s;
        if(detik>=60) {
            detik -= 60;
            menit++;
        }
        if(menit>=60) {
            menit -= 60;
            jam++;
        }
        time count = new time(jam, menit, detik);
        return count;
    }

    public void print(){
        System.out.println(this.h + " : " + this.m + " : " + this.s);
    }
}
