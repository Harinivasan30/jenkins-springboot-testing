pipeline {
    agent any

    tools {
        maven 'Maven 3.9.10'   // Use the Maven name you set in Jenkins
        jdk 'Java 17'          // Use the JDK name you set in Jenkins
    }

    stages {
        stage('Clone Code') {
            steps {
                git 'https://github.com/Harinivasan30/jenkins-springboot-testing.git'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run App') {
            steps {
                bat 'start /b java -jar target\\*.jar'
            }
        }
    }
}
