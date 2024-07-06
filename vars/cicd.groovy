def gitdownload(repo)
{
 "https://github.com/intelliqittrainings/${repo}.git"
}

def buildartifacts()
{
 "sh mvn package"
}
