pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'   // Use the Maven name from Jenkins tool config
        jdk 'Java 17'         // Use the JDK name from Jenkins tool config
    }

    stages {
        stage('Clone Code') {
            steps {
                git 'https://github.com/Harinivasan30/jenkins-springboot-testing.git' // Change to your GitHub repo
            }
        }

        stage('Build Project') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run App') {
            steps {
                sh 'nohup java -jar target/*.jar &'
            }
        }
    }
}
