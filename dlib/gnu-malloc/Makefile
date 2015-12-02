CFLAGS=-g

list: trace.out leak
	-mtrace leak trace.out

leak: leak.c

trace.out: leak
	MALLOC_TRACE=trace.out ./leak

clean:
	rm -f trace.out leak
