pipeline {
    agent any

    tools {
        // This tells Jenkins to inject Maven into the pipeline path
        maven 'Maven 3.9'
    }

    stages {
        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'mvn clean test -Dtest=TaskServiceTest'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t taskflow-backend:jenkins-latest .'
            }
        }
    }

    post {
        success {
            echo '🎉 Success! Jenkins built the app and passed all unit tests.'
        }
        failure {
            echo '❌ Failure! A unit test or Docker build failed.'
        }
    }
}