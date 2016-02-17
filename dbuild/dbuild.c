#include <stdio.h>
#include <stdlib.h>

int a;

int
main(int argc, char *arg[])
{
	printf("stack:\t%p\n", (void *)&argc);
	printf("heap:\t%p\n", malloc(1));
	printf("code:\t%p\n", (void *)main);
	printf("data:\t%p\n", (void *)&a);
	return 0;
}
