package nl.codebulb.functionaltypes.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static nl.codebulb.functionaltypes.Error.error;

public abstract class Option<A> implements Iterable<A> {

    private Option() {

    }

    public final Iterator<A> iterator() {
        return toCollection().iterator();
    }

    public final Collection<A> toCollection() {
        return toList();
    }

    public final List<A> toList() { // replace met custom list
        return isSome() ? new ArrayList<A>(){{add(some());}} : new ArrayList<>();
    }

    public abstract A some();

    public final boolean isSome() {
        return this instanceof Some;
    }

    public final boolean isNone() {
        return this instanceof None;
    }


    private static final class None<A> extends Option<A> {
        public A some() {
            throw error("Not empty");
        }
    }

    private static final class Some<A> extends Option<A> {
        private final A a;

        Some(final A a) {
            this.a = a;
        }

        public A some() {
            return a;
        }
    }

}
