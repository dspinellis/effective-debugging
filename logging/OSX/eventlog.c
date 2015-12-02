#include <asl.h>

int
main()
{
    asl_object_t client_handle = asl_open("com.example.myapp",
	    NULL, ASL_OPT_STDERR);
    asl_log(client_handle, NULL, ASL_LEVEL_DEBUG,
	    "Called main() in %s", __FILE__);
    asl_close(client_handle);
}
