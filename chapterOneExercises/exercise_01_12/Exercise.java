/*
1.12
(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40  minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
 */
public class Exercise {
    public static void main(String[] args) {
        System.out.println("Average speed in kmph: " + ((24 * 1.6) / ((60 * 60) + (40 * 60 + 35))) * 60 * 60);
    }
}
