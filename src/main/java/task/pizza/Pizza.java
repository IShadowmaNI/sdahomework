package task.pizza;

import java.util.Arrays;

public class Pizza {

    public static int pizzaFriendsProblem(int nrFriends, double[] fractionOfPizza) {

        if (fractionOfPizza.length != nrFriends) {
            throw new IllegalArgumentException("Please give the correct amount of pizza fraction for each friend!");
        } else {
            for (double fraction : fractionOfPizza) {
                if (fraction != 0.5 && fraction != 0.75 && fraction != 0.25) {
                    throw new IllegalArgumentException("Please put the proper pizza fraction: 0.5 or 0.75 or 0.25");
                }
            }
        }

        return (int)((Math.ceil(Arrays.stream(fractionOfPizza).sum())) + 1);
    }
}
