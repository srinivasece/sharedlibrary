def gitdownload(repo)
{
 git "https://github.com/intelliqittrainings/${repo}.git"
}

def buildartifacts()
{
 sh "mvn package"
}
def deploy(jobname,ipaddress,contextpath)
{
 sh "/var/lib/jenkins/workspace/${jobname}/webapp/target ubuntu@${ipaddress}:/var/lib/tomcat9/webapps/${contextpath}.war"
}
