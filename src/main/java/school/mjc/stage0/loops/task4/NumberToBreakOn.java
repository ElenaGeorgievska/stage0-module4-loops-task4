package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {

        int i = 1;
        if (numberToGoUntil > toBreakWith) {
            while (i > 0 && numberToGoUntil > toBreakWith && i <= toBreakWith) {
                System.out.println(i);
                i++;
            }
        } else {
            System.out.println("iterating till the end");
            while (i > 0 && numberToGoUntil < toBreakWith && i <= numberToGoUntil) {
                System.out.println(i);
                i++;
            }
        }

//        int i = 1;
//        if(numberToGoUntil>toBreakWith) {
//            do {
//                System.out.println(i);
//                i++;
//            } while (i > 0 && numberToGoUntil > toBreakWith && i <= toBreakWith);
//        }else {
//            System.out.println("iterating till the end");
//            do {
//                System.out.println(i);
//                i++;
//            } while (i > 0 && numberToGoUntil < toBreakWith && i <= numberToGoUntil);
//        }

    }

    public static void main(String[] args) {
        NumberToBreakOn n = new NumberToBreakOn();
        n.printNumbersUntilWithBreakOn(6, 5);
    }

    //Write a program that will consume 2 args: the first is number to break on, the second to iterate till,
    // if number to iterate till is less than to break with -> sout("iterating till the end") and print all the numbers till the end,
    // otherwise all numbers till toBreakWith.
}
