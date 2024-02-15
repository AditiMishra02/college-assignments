#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
#include<semaphore.h>
#include<sys/shm.h>
int main()
{
    int shmid = shmget(IPC_PRIVATE, sizeof(sem_t), 0666|IPC_CREAT);
    sem_t *sem = (sem_t *)shmat(shmid, (void *)0, 0);
    sem_init(sem, 1, 1);

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