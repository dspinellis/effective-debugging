#include <windows.h>

int
main()
{
    LPTSTR  lpszStrings[] = {
	"Called main() in file ",
	__FILE__
    };
    HANDLE hEventSource = RegisterEventSource(NULL, "myservice");

    if (hEventSource == NULL)
        return (1);

    ReportEvent(hEventSource,     // handle of event source
        EVENTLOG_INFORMATION_TYPE,  // event type
        0,                    // event category
        0,                    // event ID
        NULL,                 // current user's SID
        2,                    // strings in lpszStrings
        0,                    // no bytes of raw data
        lpszStrings,          // array of error strings
        NULL);                // no raw data

    DeregisterEventSource(hEventSource);
    return (0);
}
