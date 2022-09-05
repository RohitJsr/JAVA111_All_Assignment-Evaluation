public class Main {


    static  void printMonths(String month) {

        switch (month) {


            case "JAN":
                System.out.println("This is the 1st Month of the Year January");
                break;

            case "FEB":
                System.out.println("This is 2nd Month of the Year february");
                break;

            case "MAR":
                System.out.println("This is 3rd Month of the Year march");
                break;

            case "APR":
                System.out.println("This is 4th Month of the year april");
                break;

            case "MAY":
                System.out.println("This is 5th Month of the Year may");
                break;

            case "JUN":
                System.out.println("This is 6th Month of the Year june");
                break;

            case "JUL":
                System.out.println("This is 7th Month of the Year july");
                break;

            case "AUG":
                System.out.println("This is 8th Month of the Year august");
                break;
            case "SEP":
                System.out.println("This is 9th Month of Year september");
                break;
            case "OCT":
                System.out.println("This is 10th Month of Year october");
                break;
            case "NOV":
                System.out.println("This is 11th Month of Year november");
                break;

            case "DEC":
                System.out.println("This is 12th Month of Year december");
                break;

        }
    }
    public static void main(String[] args) {
       printMonths("AUG");
    }
}