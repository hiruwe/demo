pipeline {
    agent {
        docker { image 'node:demo' }
    }
    stages {
        stage('Build') {
        	steps {
                sh 'javac --version'
            }
        }
    }
}