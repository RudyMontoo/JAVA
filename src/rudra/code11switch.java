package rudra;

import java.util.Scanner;

public class code11switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //program 1 describe fruits:
//        System.out.println("NOTE: First letter should be capital letter");
//        System.out.println("Enter your fruit name : ");
//        String fruits = sc.nextLine();
//        //old style switch
//        switch(fruits){
//            case "Apple":
//                System.out.println("Kashmir");
//                break;
//            case "Orange":
//                System.out.println("Madhya Pradesh");
//                break;
//            case "Litchi":
//                System.out.println("Bihar");
//                break;
//            default:
//                System.out.println("dont known");
//        }
//
//        //new style switch
//
//        switch (fruits) {
//            case "Apple" -> System.out.println("Kashmir");
//            case "Orange" -> System.out.println("Madhya Pradesh");
//            case "Litchi" -> System.out.println("Bihar");
//            default -> System.out.println("dont known");
//        }





//        //program 2 :day
//        System.out.println("Enter a number : ");
//        int num = sc.nextInt();
//        switch(num){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//                default:
//                    System.out.println("Enter a num btw 1 to 7");
//        }

//
//        //program 3 weekday or weekend
//        int num = sc.nextInt();
//        switch(num){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//                case 5:
//                    System.out.println("Weekday");
//                    break;
//                    case 6:
//                        case 7:
//                            System.out.println("Weekends");
//                            break;
//        }



        //Nested switch
        int empID=sc.nextInt();
        String department = sc.next();
        switch (empID) {
            case 1 -> {
                System.out.println("Rudra Sharma");
                switch (department) {
                    case "Computer" -> System.out.println("Computer");
                    case "Management" -> System.out.println("Finance");
                    case "Nagin" -> System.out.println("AI");
                    default -> System.out.println("Lower");
                }
            }
            case 2 -> {
                System.out.println("Atul kumar singh");
                switch (department) {
                    case "Computer" -> System.out.println("Computer");
                    case "Management" -> System.out.println("Finance");
                    case "Nagin" -> System.out.println("AI");
                    default -> System.out.println("Lower");
                }
            }
            case 3 -> {
                System.out.println("Paddulal");
                switch (department) {
                    case "Computer" -> System.out.println("Computer");
                    case "Management" -> System.out.println("Finance");
                    case "Nagin" -> System.out.println("AI");
                    default -> System.out.println("Lower");
                }
            }
            default -> System.out.println("invalid input");
        }
    }
}
