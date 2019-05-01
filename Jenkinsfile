pipeline {
    agent any
    stages {
        stage ('Checkout') {
            steps {
                git branch:'master', url: 'https://github.com/uparix/react-springboot-archetype'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B clean deploy'
            }
        }
    }
}