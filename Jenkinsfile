pipeline {
  agent any
  stages {
    stage('dev') {
      steps {
        echo 'Into Dev'
        sh '''mvn clean
mvn install
'''
      }
    }

  }
}