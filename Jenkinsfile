node{
    stage('SCM Checkout'){
	git 'https://github.com/thiagoalanjs/automacaoJunitSubmarino.git'
    }
    stage('Compile-Package'){
	def mvnHome = tool name: 'MavenPipeline', type: 'maven'	
	sh '${mvnhome} mvn package'	
	}	
}
