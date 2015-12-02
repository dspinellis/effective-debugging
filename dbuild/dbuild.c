#include <stdio.h>
#include <stdlib.h>

int a;

int
main(int argc, char *arg[])
{
	printf("stack:\t%p\n", &argc);
	printf("heap:\t%p\n", malloc(1));
	printf("text:\t%p\n", main);
	printf("bss:\t%p\n", &a);
	return 0;
}
