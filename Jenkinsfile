
pipeline {
 

  stages {
    stage("Sonarqube analysis") {
      steps {
        withSonarQubeEnv('SonarQube Scanner') {
          scannerHome = tool type: 'hudson.plugins.sonar.SonarRunnerInstallation'
          bat "${scannerHome}/bin/sonar-scanner"
        }
      }
    }
    
  }
}
