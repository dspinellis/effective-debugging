CFLAGS=-g -pthread
CXXFLAGS=-g -std=c++11 -pthread
PROGS=deadlock-pt deadlock Deadlock.class

all: $(PROGS)

deadlock-pt: deadlock-pt.c

deadlock: deadlock.cpp

Deadlock.class: Deadlock.java
	javac Deadlock.java

clean:
	rm -f $(PROGS) .gdb_history core
