pipeline {
    agent any

    stages {
         
        stage('Build') {
          
            
            steps {
                
                def scannerHome = tool name:'Sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation';
    withSonarQubeEnv('Sonar') {
      bat "${scannerHome}"
    }
                bat 'start' 
               archiveArtifacts allowEmptyArchive: true, artifacts: '**', fingerprint: true, onlyIfSuccessful: true
            }
        }
    }
}

