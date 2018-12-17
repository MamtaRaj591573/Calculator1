pipeline
{
agent any
stages
{
  stage('Build')
  {
    steps
    {
       git 'https://github.com/MamtaRaj591573/MyCalculator'
    }
  }
  stage('Test')
  {
    steps
    {
      sh 'mvn package'
    }
   }
}
}
