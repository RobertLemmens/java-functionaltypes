package nl.codebulb.functionaltypes;

import java.util.function.Function;

public interface Functor<F, G extends Functor<?,?>> {

    <H> G map(Function<F,H> f);

    String toString();

}
