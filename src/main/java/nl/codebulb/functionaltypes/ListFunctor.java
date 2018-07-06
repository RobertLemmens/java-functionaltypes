package nl.codebulb.functionaltypes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListFunctor<A> implements Functor<A, ListFunctor<?>> {

    private final List<A> value;

    public ListFunctor(List<A> value) {
        this.value = value;
    }

    @Override
    public <G> ListFunctor<?> map(Function<A, G> f) {
        List<G> result = new ArrayList<>(value.size());
        for(A a : value)
            result.add(f.apply(a));

        return new ListFunctor<>(result);
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("List(");
        for(A a : value) s.append(a.toString()).append(",");
        s.replace(s.length()-1,s.length(), "");
        s.append(")");

        return s.toString();
    }
}