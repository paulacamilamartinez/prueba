//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package usta.fis;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        p_show_info_program();
        float v_time = p_time_calculator();
        System.out.println("The time used to travel cycling between the cities was: " + v_time + " hours");
    }

    public static void p_show_info_program() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║----------------SOFTCYCLETIME VERSION 1.0-----------------║");
        System.out.println("║----------MAKER: Paula Camila Martinez----------║");
        System.out.println("║------DESCR: Calculates time travel between 2 cities------║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }

    public static int p_user_distance() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the distance (Km) between the 2 cities");

        int v_distance;
        for(v_distance = keyboard.nextInt(); v_distance < 0; v_distance = keyboard.nextInt()) {
            System.err.println("ERR:Invalid number typed, please type a number greater than 0");
            System.out.println("Please type the distance (Km) between the 2 cities again");
        }

        return v_distance;
    }

    public static int p_user_speed() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the travel speed (Km/h)");

        int v_speed;
        for(v_speed = keyboard.nextInt(); v_speed <= 0; v_speed = keyboard.nextInt()) {
            System.err.println("ERR:Invalid number typed, please type a number greater than 0");
            System.out.println("Please type the travel speed (Km/h) again");
        }

        return v_speed;
    }

    public static float p_time_calculator() {
        int v_distance = p_user_distance();
        int v_speed = p_user_speed();
        float v_time = (float)(v_distance / v_speed);
        return v_time;
    }
}