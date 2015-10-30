angular.module("app",['ui.grid']);

angular.module("app").config(['$routerProvider',
		function($routerProvider){
			$routerProvider.when('/Produto/Novo',{
				templateUrl: 'NovoProduto.html',
				controller: 'NovoProdutoController'
			}).
			when('/Produto',{
				templateUrl: 'ListaProduto.html',
				controller:   'ListaProdutoController' 
			})
			otherwise({redirectTo:'index.html'});
		}]);