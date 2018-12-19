pipeline
{
agent any
stages
{
  stage('Build')
  {
    steps
    {
       bat 'echo %PATH%'
       echo env.PATH
    }
  }
  stage('Test')
  {
    steps
    {
      echo 'mvn package'
    }
   }
}
}
