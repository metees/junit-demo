pipeline {
  agent none
  stages {
    stage('get source code') {
      steps {
        git(url: 'https://github.com/metees/junit-demo.git', branch: 'master', poll: true)
      }
    }
  }
}