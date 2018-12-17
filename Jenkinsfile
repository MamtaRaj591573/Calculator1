pipeline
{
agent any
stages
{
  stage('Build')
  {
    git 'https://github.com/MamtaRaj591573/MyCalculator'
  }
  stage('Test')
  {
   sh 'mvn package'
   }
}
}
