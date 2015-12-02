#include <assert.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int i, counter;
#pragma omp parallel
	for (i = 0; i < 100000; i++)
		counter++;
	printf("counter=%d\n", counter);
	return 0;
}
