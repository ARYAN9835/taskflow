pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                // Pulls the code into the Jenkins workspace
                checkout scm
            }
        }

        stage('Run Unit Tests') {
            steps {
                // Runs your Mockito unit tests to ensure business logic is correct
                sh 'mvn clean test -Dtest=TaskServiceTest'
            }
        }

        stage('Build Docker Image') {
            steps {
                // Uses your multi-stage Dockerfile to build the production image
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