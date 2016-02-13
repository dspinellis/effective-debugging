CFLAGS=-g -pthread
CXXFLAGS=-g -std=c++11 -pthread
PROGS=deadlock-pt deadlock

all: $(PROGS)

deadlock-pt: deadlock-pt.c

deadlock: deadlock.cpp

clean:
	rm -f $(PROGS) .gdb_history core
