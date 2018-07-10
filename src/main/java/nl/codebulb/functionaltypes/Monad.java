package nl.codebulb.functionaltypes;

import java.util.function.Function;

public interface Monad<F, M extends Monad<?,?>> extends Functor<F,M> {

    M of();

    M flatMap(Function<F,M> f);

    String toString();

}
