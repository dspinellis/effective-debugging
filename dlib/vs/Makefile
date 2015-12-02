CC=cl
CFLAGS=/Zi /MDd

demo: memerror
	./memerror

memerror: memerror.c
	$(CC) $(CFLAGS) $?

clean:
	rm -f memerror.exe memerror.ilk memerror.obj memerror.pdb \
		vc100.pdb vc120.pdb
