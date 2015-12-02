#include <stdlib.h>
#include <mcheck.h>

int
main()
{
#ifndef NDEBUG
	mtrace();
#endif
	char *c = malloc(42);
	return 0;
}
