import nl.codebulb.functionaltypes.Functor;
import nl.codebulb.functionaltypes.ListFunctor;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class FunctorTests  {

    /*
        Simple operation that changes type and value to check map functionality
     */
    private static double addOneAndHalf(int x)  {
        return x + 1.5;
    }

    @Test
    public void ListFunctorTest() {
        ArrayList<Integer> ints =  new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ListFunctor<Integer> functor = new ListFunctor<>(ints);

        ListFunctor<?> functor1 = functor.map(FunctorTests::addOneAndHalf);

        assertEquals("List(2.5,3.5)", functor1.toString());
    }

}
