package org.example.Simple;

/**
 * @author :刘贺君
 * @description:计算列车到站时间
 * @date :2023/09/08 13:41
 */
public class FindDelayedArrivalTime {


    public static void main(String[] args) {
        System.out.println(findDelayedArrivalTime(15,2));
    }

    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

        return (arrivalTime+delayedTime) % 24;
    }
}
