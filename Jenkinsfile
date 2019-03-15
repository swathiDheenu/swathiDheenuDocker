/*node {
    checkout scm 
    /* .. snip .. */
/*}*/

pipeline {
    agent any

    stages {
        
        stage('checkout scm'){
        }
        stage('Build') {
            steps {
                sh 'make' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
    }
}
