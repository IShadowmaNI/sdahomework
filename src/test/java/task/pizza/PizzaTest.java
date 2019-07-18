package task.pizza;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PizzaTest {

    @Test
    public void pizzaFriendsProblemTestNormalBehaviourExample1() {
        assertEquals(3, Pizza.pizzaFriendsProblem(3, new double[] {0.5, 0.75, 0.75}));
    }

    @Test
    public void pizzaFriendsProblemTestNormalBehaviourExample2() {
        assertEquals(4, Pizza.pizzaFriendsProblem(5, new double[] {0.5, 0.75, 0.5, 0.25, 0.25}));
    }

    @Test
    public void pizzaFriendsProblemTestException() {
        assertEquals(4, Pizza.pizzaFriendsProblem(5, new double[] {0.5, 0.75, 0.5, 0.25, 0.3}));
    }
}
