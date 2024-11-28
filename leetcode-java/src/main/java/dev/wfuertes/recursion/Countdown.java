package dev.wfuertes.recursion;

public class Countdown {

    public void execute(int number) {
        // Base case, responsible for stopping recursion
        if (number < 0) {
            return;
        }

        // Here the logic that must be executed
        System.out.println(number);
  
        // Call recursion to do with the rest
        execute(number - 1);
    }

    public static void main(String[] args) {
        var countdown = new Countdown();
        countdown.execute(10);
    }
}
