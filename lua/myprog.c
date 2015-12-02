#include <math.h>
#include "lua5.2/lua.h"
#include "lua5.2/lauxlib.h"

// Functions exposed to Lua
static int l_sin(lua_State *L)
{
    // Verify that the argument is a number
    double d = luaL_checknumber(L, 1);
    // Call the function, and return the result
    lua_pushnumber(L, sin(d));
    return 1;  // Single result
}

static int l_cos(lua_State *L) {
    double d = luaL_checknumber(L, 1);
    lua_pushnumber(L, cos(d));
    return 1;
}

static int l_tan(lua_State *L) {
    double d = luaL_checknumber(L, 1);
    lua_pushnumber(L, tan(d));
    return 1;
}

int main() {
    // Setup Lua
    lua_State *L = luaL_newstate();
    luaL_openlibs(L);

    // Expose the functions to Lua
    lua_pushcfunction(L, l_sin);
    lua_setglobal(L, "lsin");
    lua_pushcfunction(L, l_cos);
    lua_setglobal(L, "lcos");
    lua_pushcfunction(L, l_tan);
    lua_setglobal(L, "ltan");

    // Load and run the debug file
    luaL_dofile(L, "debug.lua");
    printf("Done\n");
    return 0;
}
