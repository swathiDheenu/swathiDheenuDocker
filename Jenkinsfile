pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat "mvn install build"
            }
        }
        stage('Test') {
            steps {
                bat "mvn install check"
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
            junit 'build/reports/**/*.xml'
        }
    }
}

