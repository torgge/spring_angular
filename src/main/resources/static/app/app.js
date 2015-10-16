angular.module("app",[]);
angular.module("app").controller("MainController", function($scope, $http){
	$scope.nome = "George A. A. Bonespírito";
	
	/*$scope.produtos = [
	                   {id:1,descricao:"produto1"},
	                   {id:2,descricao:"produto2"},
					   {id:3,descricao:"produto3"}	
					  ];*/
	
	$http.get("api/produtos")
	.success(function(data){
		$scope.produtos = data;
	});
})