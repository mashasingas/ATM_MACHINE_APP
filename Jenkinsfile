  pipeline{
  agent any
  stages{
    stage('Build'){
      steps{
        echo 'Welcom to jenkins'
      }
  }
  stage('Deploy'){
  steps{
  echo 'Deploy Project to docker'
  }
}
    tools {
maven “Maven 3.3.9”
jdk “Oracle JDK 8u40”
}
}
  }
