// Define in order to get file and line number information
#define _CRTDBG_MAP_ALLOC

#include <stdlib.h>
#include <crtdbg.h>

int
main()
{
    // Send output to stderr, rather than the VS debug window
    _CrtSetReportMode(_CRT_WARN, _CRTDBG_MODE_FILE);
    _CrtSetReportFile(_CRT_WARN, _CRTDBG_FILE_STDERR);

    // Detect memory leaks on exit
    _CrtSetDbgFlag(_CRTDBG_ALLOC_MEM_DF | _CRTDBG_LEAK_CHECK_DF);
    {
        char *c = malloc(42);
        c[42] = 'a';
    }
    // Check all blocks for memory buffer overflows
    _CrtCheckMemory( );

    return 0;
}
