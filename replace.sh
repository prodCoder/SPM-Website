jar_name=cmp-0.0.1-SNAPSHOT.jar
#!����õ�jar����ŵ�ַ
file_path=~/.jenkins/workspace/cmp/target
#!�����е�jar���ݺ󣬽��µ�jar���滻
file="/deploy_cmp/cmp-0.0.1-SNAPSHOT.jar"
if [ -f "$file" ]
then
mv /deploy_cmp/cmp-0.0.1-SNAPSHOT.jar /deploy_cmp_backup/cmp-0.0.1-SNAPSHOT.jar.`date +%Y%m%d%H%M%S`
fi
cp ~/.jenkins/workspace/cmp/target/cmp-0.0.1-SNAPSHOT.jar /deploy_cmp