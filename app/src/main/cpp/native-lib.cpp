#include <jni.h>
#include <string>
#include <dlfcn.h>
#include <unistd.h>
#include <iostream>
using namespace std;
extern "C" JNIEXPORT jstring JNICALL
Java_com_example_myapplication_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    char * buffer= static_cast<char *>(malloc(0x100));
    return  env->NewStringUTF(getcwd(buffer,0x100));

    void* p = dlopen("libs/arm64-v8a/libhiddenapi-bypass.so",RTLD_NOW);
    if(p==NULL){
        return env->NewStringUTF("load hiddenapi-bypass fail");
    }
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

