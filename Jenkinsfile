pipeline {
    agent none 
    stages {
        stage('Pull') {
        	agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
                sh 'mvn --version'
            }
        } stage('build') {
        	agent {
                docker { image 'maven:3-alpine' }
            }
        	steps {
                sh 'mvn --version'
            }
        }stage('Deploy') {
        	agent {
                docker { image 'maven:3-alpine' }
            }
        	steps {
                sh 'mvn --version'
            }
        }
    }
}