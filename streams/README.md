Demonstrate the concurrent name resolution of IP addresses

Note that utilizing a large thread pool on a stream with .parallel(),
as is done in `ResolveStream.java` isn't the way to go, because too few
threads are used.
Instead, `ResolveFuture.java` utilizes the thread pool of 100 threads.
See the [discussion](http://stackoverflow.com/questions/35581819/how-can-i-process-a-java-stream-with-more-than-the-default-number-of-threads)
on StackOverflow.
