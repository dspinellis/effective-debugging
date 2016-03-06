#include <omp.h>

#define N 100000000
#define NTHREADS 8
int values[N];

int
main(int argc, char *argv[])
{
    int tid;
    static int sum[NTHREADS];

#ifdef _OPENMP
    omp_set_num_threads(NTHREADS);
#pragma omp parallel private(tid)
    {
	tid = omp_get_thread_num();
#else
    for (tid = 0; tid < NTHREADS; tid++) {
#endif
	for (int i = 0; i < N; i++)
	    sum[tid] += values[i] >> tid;
    }
}
