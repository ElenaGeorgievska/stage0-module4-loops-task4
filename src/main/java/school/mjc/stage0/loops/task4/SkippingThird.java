package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {

        for (int i = 1; i <= lastPrinted; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SkippingThird st = new SkippingThird();
        st.printUntilButThird(-10);
    }

    //Write a program that will print all numbers from one up to given(inclusive), skipping each 3rd.
}
