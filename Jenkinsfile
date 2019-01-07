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
        bat 'mvn test'
      echo 'basic test done'
       bat 'mvn integration-test'
      echo 'integration test done'
      bat 'mvn smoke-test'
      echo 'smoke testing is done'

       }
   }
  stage('Verify')
  {
      steps
    {
      bat 'mvn verify'
      echo 'verfication done'
    }
  }
  stage('Generate HTML report')
  {
    steps
    {
      cucumber buildStatus: 'UNSTABLE',
                fileIncludePattern: '**/*.json'
                      
    }
  }
}
}
