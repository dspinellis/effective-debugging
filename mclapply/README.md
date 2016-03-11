Demonstrate speedup of R's mclapply function

The speedup can be measured through the following two invocations.
```
> system.time(mclapply(flw, word.permutations, mc.cores=8))
   user  system elapsed
 42.976   0.268   4.623
> system.time(lapply(flw, word.permutations))
   user  system elapsed
 20.896   0.000  20.896
```
