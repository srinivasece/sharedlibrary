def gitdownload(repo)
{
 git "https://github.com/intelliqittrainings/${repo}.git"
}

def buildartifacts()
{
 sh "mvn package"
}
