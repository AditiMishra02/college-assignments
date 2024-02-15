#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
#include<semaphore.h>
#include<fcntl.h>
int main()
{
    sem_t *sem = sem_open("xyz", O_CREAT, 0666, 1);
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
    sem_wait(sem);
    while(*c != '\0'){
        fputc(*c, stderr);
        c++;
        sleep(0.5);
    }
    //exit
    sem_post(sem);
    wait(NULL);
    return(0);
}