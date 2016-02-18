#include <stdio.h>
#include <stdlib.h>

int z;
int i = 1;
const int c = 1;

int
main(int argc, char *arg[])
{
	printf("stack:\t%p\n", (void *)&argc);
	printf("heap:\t%p\n", malloc(1));
	printf("code:\t%p\n", (void *)main);
	printf("data:\t%p (initialized)\n", (void *)&i);
	printf("data:\t%p (constants)\n", (void *)&c);
	printf("data:\t%p (zero)\n", (void *)&z);
	return 0;
}
