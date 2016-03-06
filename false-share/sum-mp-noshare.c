#include <omp.h>

#define N 100000000
#define NTHREADS 8
int values[N];

int
main(int argc, char *argv[])
{
    int tid;
    static int sum[NTHREADS];

    omp_set_num_threads(NTHREADS);
#pragma omp parallel private(tid)
    {
	int local_sum = 0;
	tid = omp_get_thread_num();
	for (int i = 0; i < N; i++)
	    local_sum += values[i] >> tid;
	sum[tid] = local_sum;
    }
}
