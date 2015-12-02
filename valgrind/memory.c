#include <stdlib.h>

int
main()
{
	char *c = malloc(42);

	c[42] = 1;
	return c[0];
}
