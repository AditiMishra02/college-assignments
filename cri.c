#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
int main()
{
    char str[300];
    char *c;
    int i;
    for(i =0 ; i<3; i++){
        if(fork()){
            break;
        }
    }

    sprintf(str,"%d: My Pid : %d and Parent ID %d\n", i, getpid(), getppid());
    c =str;
    //entry
    while(*c != '\0'){
        fputc(*c, stderr);
        c++;
        sleep(0.5);
    }
    //exit
    wait(NULL);
    return(0);
}