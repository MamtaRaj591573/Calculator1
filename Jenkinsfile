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
      
        try {
            withMaven(maven: 'Maven 1') {
                dir('bobcat') {
                    bat 'mvn clean test -Dwebdriver.type=remote -Dwebdriver.url=http://localhost:4444/wd/hub -Dwebdriver.cap.browserName=chrome -Dmaven.test.failure.ignore=true'
                }
            }
        } 
      finally {
            junit testResults: 'bobcat/target/*.xml', allowEmptyResults: true
            archiveArtifacts 'bobcat/target/**'
        }

       
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
  
}
}
