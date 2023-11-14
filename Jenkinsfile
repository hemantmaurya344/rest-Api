pipeline {
  agent any
  stages {
    stage('dev') {
      steps {
        echo 'Into Dev'
        sh 'clean'
        sh 'mvn install'
      }
    }

  }
}