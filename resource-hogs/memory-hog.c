#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

int
main(int argc, char *argv[])
{
	size_t nbytes = atoi(argv[1]) * 1024l * 1024;
	int *a = malloc(nbytes);
	int i;

	if (a == NULL)
		exit(1);
	printf("Allocated %zu bytes at %p\n", nbytes, a);
	for (;;) {
		for (i = 0; i < nbytes / sizeof(int); i++)
			a[i] = i;
		printf("Looped\n");
	}
}
