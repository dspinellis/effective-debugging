ndbuild: dbuild.c
	$(CC) -o $@ $?

# Deterministic OS X
osx: dbuild.c
	$(CC) -Wl,-no_pie -o dbuild $?
	./dbuild

# Deterministic Linux
linux: ndbuild
	setarch `uname -m` -R ./$?

# Deterministic Visual C
vc:
	cl dbuild.c /link /DYNAMICBASE:NO
	./dbuild
