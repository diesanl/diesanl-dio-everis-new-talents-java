public class Main {

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA= " + intA + "\nintB= " + intB);
        intA = 2;
        System.out.println("intA= " + intA + "\nintB= " + intB);

        MyObj objA = new MyObj(1);
        MyObj objB = objA;
        System.out.println("objA= " + objA + "\nobjB= " + objB);


        objA.setNum(5);

        System.out.println("objA= " + objA + "\nobjB= " + objB);
    }


}
