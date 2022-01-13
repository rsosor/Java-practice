package com.rsosor.javase.lambda;

import org.springframework.cglib.core.Block;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Blocks {

    private Deque<Block> entries = new ArrayDeque<>();

    public Blocks() {
    }

    public Deque<Block> getEntries() {
        return entries;
    }

    public void setEntries(Deque<Block> entries) {
        this.entries = new ArrayDeque<>(entries);
    }

    // public Predicate<Block> push = entries::offerLast;
    public Predicate<Block> push = e -> entries.offerLast(e);

    public Supplier<Optional<Block>> peek = () -> Optional.ofNullable(entries.peekLast());

    public BooleanSupplier isEmpty = entries::isEmpty;
    // public BooleanSupplier isEmpty = () -> entries.isEmpty();

    // public Supplier<String> lastHash = () -> peek.get().map(Block::hash).orElse("0");

    public LongSupplier size = entries::size;
    // public LongSupplier size = () -> entries.size();
}
