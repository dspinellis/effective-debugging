CFLAGS=-std=c11 -ggdb

PROGS=sum-mp sum-seq sum-mp-noshare

all: $(PROGS)

sum-mp: sum.c
	$(CC) $(CFLAGS) -fopenmp -o $@ $<

sum-mp-noshare: sum-mp-noshare.c
	$(CC) $(CFLAGS) -fopenmp -o $@ $<

sum-seq: sum.c
	$(CC) $(CFLAGS) -o $@ $<

clean:
	rm -f $(PROGS)
