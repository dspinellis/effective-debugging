CC=cl
CFLAGS=/Zi /Od /MD /openmp

all: race.exe fixed.exe

race.exe: race.c
	$(CC) $(CFLAGS) /Fe$@ $?

fixed.exe: fixed.c
	$(CC) $(CFLAGS) /Fe$@ $?

clean:
	rm -f fixed.exe fixed.ilk fixed.obj fixed.pdb race.exe race.ilk \
		race.obj race.pdb vc100.pdb vc120.pdb
