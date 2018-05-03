node{
    stage('SCM Checkout'){
	git 'https://github.com/thiagoalanjs/automacaoJunitSubmarino.git'
    }
    stage('Compile-Package'){
	def mvnHome = tool name: 'MavenPipeline', type: 'maven'	
	sh "${mvnHome}/bin/mvn clean -Dtest="tests.validaCarrinhoDeCompras" test"	
	}	
}
