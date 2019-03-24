node {
  stage('SCM') {
    git 'https://github.com/ashwinmohanakrishnan/ashwin.git'
  }
  stage('Sonar') {
    withSonarQubeEnv('Sonar') {
      // requires SonarQube Scanner for Maven 3.2+
      bat "mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar"
    }
  }
}
