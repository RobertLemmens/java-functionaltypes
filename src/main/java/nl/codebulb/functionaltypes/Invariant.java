package nl.codebulb.functionaltypes;

import java.util.function.Function;

public interface Invariant<F> {

    <A, B> __<F, B> invmap(Function<A, B> fn, Function<B,A> nf, __<F, A> nestedA);
}
