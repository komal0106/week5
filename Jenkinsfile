pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                bat 'javac factorial.java testfactorial.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java testfactorial'
            } 
        }

        stage('Run') {
            steps {
                bat 'java factorial'
            }
        }

        stage('Package JAR') {
            steps {
                bat 'jar cfm factorial.jar manifest.txt factorial.class'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'factorial.jar'
            }
        }
    }

    post {
        success {
            echo 'Build, test, run and JAR creation successful and artifact is ready!'
        }
        failure {
            echo 'Build or test failed!'
        }
    }
}
