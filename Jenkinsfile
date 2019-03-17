pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                git url: 'https://github.com/ashwinmohanakrishnan/ashwin.git'
            }
        }
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('Sonar') {
                    def scannerHome = tool name: 'Sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                    bat "${scannerHome}\bin\sonar-scanner"
                }
            }
        }
        stage("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
                    // true = set pipeline to UNSTABLE, false = don't
                    // Requires SonarQube Scanner for Jenkins 2.7+
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}








