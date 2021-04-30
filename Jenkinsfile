pipeline {
	agent any
	stages {
		stage("Compile"){
			steps {
				sh "mvn compile"
			}
		}
		stage("Unit test") {
			steps {
				sh "mvn test"
			}
		}
	}
	post {
		always {
			step([$class: 'JacocoPublisher',
				execPattern: 'target/*.exec',
				classPattern: 'target/classes',
				sourcePattern: 'src/main/java',
				exclusionPattern: 'src/test*'
			])
            step([$class: 'deploy',
                    tomcat8: [
                        url: 'http://10.155.73.37:8080',
                        credentialsId: 'ObbyKing-mke'
                    ],
                    war: "**/*.war",
                    contextPath: "devops"
            ])
		}
	}	
}