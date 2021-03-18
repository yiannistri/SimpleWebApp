node {
   stage('Preparation') {
      git 'https://github.com/yiannistri/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
   stage('Deploy') {
      sh "git push https://git.heroku.com/agile-depths-02824.git master"
   }
}