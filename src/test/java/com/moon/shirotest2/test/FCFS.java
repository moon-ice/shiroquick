/*
package com.moon.shirotest2.test;
import java.util.*;
public class FCFS {
    Vector<Process> process;
    //先来先服务
    void FCFS(Vector<Process> process)
    {
        if (process.size() == 0)
            return;
        EnterTimeSort(process);  //按照进入时间排序
        process[0]._LineTime = process[0]._EnterTime;   //将最早进入内存的是进程时间设置为时间线的起点
        RunProcess(process);  //依次执行所有进程
        OutPut(process);  //打印进程信息
    }

    //依次执行进程
    void RunProcess(Vector<Process> process)
    {
        if (process.size() == 0)
            return;
        for (int i = 0; i < process.size(); i++)
        {
            //如果进程进入时间小于等于时间线的时间
            if (process[i]._LineTime <= process[i]._EnterTime)
            {
                //则该开始时间就应为该进程的进入时间
                process[i]._BeginTime = process[i]._EnterTime;
                process[i]._LineTime = process[i]._EnterTime;  //将时间线的时间调整至进程进入时间
                process[i]._LineTime += process[i]._ServiceTime;  //将时间线增加一个该进程的服务时间
                process[i]._FinishTime = process[i]._LineTime;  //将进程结束时间修改为当前时间线时间
            }
            else  //进程进入时间大于时间线时间，则证明该进程一直在等待状态
            {
                process[i]._BeginTime = process[i]._LineTime;  //将进程开始时间赋值为当前时间线时间
                process[i]._LineTime += process[i]._ServiceTime;  //将时间线增加一个该进程时间
                process[i]._FinishTime = process[i]._LineTime;  //将进程结束时间修改为当前时间线时间
            }
            process[i]._rTime = process[i]._FinishTime - process[i]._EnterTime;   //计算该进程的周转时间
            process[i]._PowerTime = process[i]._rTime / process[i]._ServiceTime;  //计算该进程的带权周转时间
        }
    }


    //按照进入时间进行排序
    void EnterTimeSort(Vector<Process> process)
    {
        if (process.size() == 0)
            return;
        for (int i = 0; i < process.size() - 1; i++)
        {
            for (int j = 0; j < process.size() - i - 1; j++)
            {
                if (process[j]._EnterTime > process[j + 1]._EnterTime)
                    Swap(process[j], process[j + 1]);
            }
        }
    }
}


*/
