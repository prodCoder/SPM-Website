#!��Ӧ��ֹͣ
#!stop.sh
#!/bin/bash
cd /deploy_cmp_script
echo "Stopping SpringBoot Application for CMP"
ls
pid=`ps -ef | grep cmp-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}'`
if [ -n "$pid" ]
then
#!kill -9 ǿ����ֹ
   echo "kill -9 ��pid:" $pid
   kill -9 $pid
fi