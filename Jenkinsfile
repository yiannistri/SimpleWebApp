node {
   stage('Preparation') {
      git 'https://github.com/yiannistri/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}