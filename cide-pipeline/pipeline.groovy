pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
              git 'https://github.com/Hiteshmankar123/devops-cicd-demo.git'  
            }
        }
        stage('Build') { 
            steps {  
                echo "Build successful"            
            }
        }
        stage('Test') { 
            steps {
                echo "Test successful"                
            }
        }
        stage('Deploy') { 
            steps {  
               echo "deploy successful"       
            }
        }
    }
}