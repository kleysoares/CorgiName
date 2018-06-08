/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corginame;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kleys
 */
public class CorgiName {

    public static String zodiac(String input) {
        String title = null;
        
        switch(input.toLowerCase()) {
            case "aries": title = "Sir";
            break;
            case "taurus": title = "Lord";
            break;
            case "gemini": title = "Miss";
            break;
            case "cancer": title = "Duchess";
            break;
            case "leo": title = "Captain";
            break;
            case "virgo": title = "Duke";
            break;
            case "libra": title = "Prince";
            break;
            case "scorpio": title = "Doctor";
            break;
            case "sagittarius": title = "Mister";
            break;
            case "capricorn": title = "Princess";
            break;
            case "aquarius": title = "Lady";
            break;
            case "pisces": title = "Queen";
            break;
            default: title = "Unrecognisable";
        }
        return title;
    }
    
    public static String colour(String input) {
        String silly = null;
        
        switch(input.toLowerCase()) {
            case "red": silly = "Waffles";
            break;
            case "orange": silly = "Macaroni";
            break;
            case "yellow": silly = "Bubba";
            break;
            case "green": silly = "Pickles";
            break;
            case "blue": silly = "Squiggy";
            break;
            case "purple": silly = "Peanut";
            break;
            case "black": silly = "Ein";
            break;
            case "white": silly = "Butters";
            break;
            case "pink": silly = "Stumpy";
            break;
            default: silly = "Unrecognisable";
        }
        return silly;
    }
    
    public static String digit(int option) {
        String name = null;
        
        switch(option) {
            case 0: name = "McPantaloons";
            break;
            case 1: name = "Bunnybottom";
            break;
            case 2: name = "McNolegs";
            break;
            case 3: name = "Frapenstein";
            break;
            case 4: name = "McDummines";
            break;
            case 5: name = "Derpernshire";
            break;
            case 6: name = "McNubbin";
            break;
            case 7: name = "Fluffybutt";
            break;
            case 8: name = "McGillicutty";
            break;
            case 9: name = "Fritofeets";
            break;
            default: name = "Unrecognisable";
        }
        return name;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sign;
        String color;
        int num = 10;
        
        System.out.println("What's your zodiac sign?");
        sign = input.nextLine();
        System.out.println("What's your favourite colour?");
        color = input.nextLine();
        System.out.println("And your favourite digit?");
        try {
            num = input.nextInt();
            input.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("It's not a number. Try again!");
            }
        input.close();
        
        System.out.println("Your Corgi Name is:\n\t" + zodiac(sign) + " " + colour(color) + " " + digit(num));
    }
}
