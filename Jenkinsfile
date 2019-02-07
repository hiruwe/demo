pipeline {
    agent { docker { image 'demo' } }
    stages {
        stage('build1') {
            steps {
                sh 'javac --version'
            }
        }
    }
    agent { docker { image 'demo' } }
    stages {
        stage('build2') {
            steps {
                sh 'pwd'
            }
        }
    }
}