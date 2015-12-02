#include <stdio.h>

static int i, counter;
#pragma omp threadprivate(i)

int main()
{
#pragma omp parallel
	for (i = 0; i < 100000; i++)
#pragma omp atomic
		counter++;
	printf("counter=%d\n", counter);
	return 0;
}
