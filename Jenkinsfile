node {
  stage('SCM') {
    git 'https://github.com/ashwinmohanakrishnan/ashwin.git'
  }
  stage('Sonarqube') {
    environment {
        scannerHome = tool 'Sonar'
    }

    steps {
        withSonarQubeEnv('Sonar') {
            sh "${scannerHome}/bin/sonar-scanner"
        }

        timeout(time: 10, unit: 'MINUTES') {
            waitForQualityGate abortPipeline: true
        }
    }
}
}
