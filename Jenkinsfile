node{
  stage ('SCM Checkout'){
    git 'https://github.com/ashwinmohanakrishnan/ashwin'
  }
  
  stage('Compile-Package'){
  sh 'mvn package'
  }
}
