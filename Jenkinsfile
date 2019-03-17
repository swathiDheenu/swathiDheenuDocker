
pipeline {
 
 agent {
    node {
      label "master"
    }
  }
 

  stages {
   
   stage('Build & Package') {
    withSonarQubeEnv('SonarQube Scanner') {
        bat "mvn clean package sonar:sonar"
    }
}
    stage("Sonarqube analysis") {
      steps {
        withSonarQubeEnv('SonarQube Scanner') {
          var scannerHome = tool name: 'Sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
          bat "${scannerHome}/bin/sonar-scanner"
        }
      }
    }
    
  }
}
