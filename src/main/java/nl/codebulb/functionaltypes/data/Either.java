package nl.codebulb.functionaltypes.data;

import nl.codebulb.functionaltypes.Functor;

import java.util.function.Consumer;
import java.util.function.Function;

public abstract class Either<L,R> implements Functor<L,Either<?,?>> { //Gebruik Monad instead?

    private Either() {}

    abstract <T> T map(Function<? super L, ? extends T> lFunc, Function<? super R, ? extends T> rFunc);

    public void apply(Consumer<? super L> f1, Consumer<? super R> f2){
        map(consume(f1), consume(f2));
    }

    private <T> Function<T, Void> consume(Consumer<T> c) {
        return t -> {c.accept(t); return null;};
    }

}
