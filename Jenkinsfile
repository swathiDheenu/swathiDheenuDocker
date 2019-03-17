stage('Build') {
  postGitHub commitId, 'pending', 'build', 'Build is running'

  try {
    sh  "${mvnHome}/bin/mvn clean package"
    postGitHub commitId, 'success', 'build', 'Build succeeded'
  } catch (error) {
    postGitHub commitId, 'failure', 'build', 'Build failed'
    throw error
  }
}
