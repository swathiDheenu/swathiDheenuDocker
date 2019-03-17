pipeline {
 
 agent {
    node {
      label "master"
    }
  }
 

  stages {
    stage("Sonarqube analysis") {
      steps {
        withSonarQubeEnv('Sonar') {
          var scannerHome = tool name: 'Sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
          bat "${scannerHome}/bin/sonar-scanner"
        }
      }
    }
    
  }
}
