package com.devt.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import static com.devt.randomizer.RandomizerUtils.random;

@State(Scope.Benchmark)
public class MyBenchmark {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void randomString() {
        random(String.class);
    }

}
