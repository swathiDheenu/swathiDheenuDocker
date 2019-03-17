node {
    stage('SonarQube analysis') {
    // requires SonarQube Scanner 2.8+
     def scannerHome = tool name:'Sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation';
    withSonarQubeEnv('Sonar') {
      bat "${scannerHome}"
    }
  } 
}

