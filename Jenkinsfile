node{
  stage ('SCM Checkout'){
    git 'https://github.com/ashwinmohanakrishnan/ashwin'
  }
  
  stage('Compile-Package'){
   def mvnHome =  tool name: 'Maven', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
}
