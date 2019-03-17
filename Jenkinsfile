
pipeline {
  environment {
    scannerHome = tool type: 'hudson.plugins.sonar.SonarRunnerInstallation'
  }
  agent {
    node {
      label "master"
    }
  }

  options {
    buildDiscarder logRotator(daysToKeepStr: '7')
  }

  stages {
    stage("Sonarqube analysis") {
      steps {
        withSonarQubeEnv('SonarQube Scanner') {
          bat "${scannerHome}/bin/sonar-scanner"
        }
      }
    }
    
  }
}
