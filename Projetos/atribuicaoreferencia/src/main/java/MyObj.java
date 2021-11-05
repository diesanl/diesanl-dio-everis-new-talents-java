public class MyObj {

    private Integer num;

    public MyObj(Integer i) {
        this.num = i;
    }

    public int getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
