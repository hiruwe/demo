pipeline {
    agent {
        docker { image 'maven:demo' }
    }
    stages {
        stage('Build') {
        	steps {
                sh 'javac --version'
            }
        }
    }
}