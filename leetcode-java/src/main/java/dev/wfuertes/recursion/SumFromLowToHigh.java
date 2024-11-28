package dev.wfuertes.recursion;

public class SumFromLowToHigh {

    public int sum(int low, int hight) {
        if (hight < low) {
            return 0;
        }
        return hight + sum(low, hight - 1);
    }

    public static void main(String[] args) {
        var service = new SumFromLowToHigh();

        System.out.println(service.sum(5, 6));
    }
}
