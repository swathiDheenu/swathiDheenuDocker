pipeline {
    agent any

    stages {
         stage('SonarQube analysis') {
    // requires SonarQube Scanner 2.8+
     def scannerHome = tool name:'Sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation';
    withSonarQubeEnv('Sonar') {
      bat "${scannerHome}"
    }
} 
        stage('Build') {
            steps {
                bat 'start' 
               archiveArtifacts allowEmptyArchive: true, artifacts: '**', fingerprint: true, onlyIfSuccessful: true
            }
        }
    }
}
