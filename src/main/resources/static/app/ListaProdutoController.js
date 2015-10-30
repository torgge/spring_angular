angular.module("app",['ui.grid']);

angular.module("app").controller("ListaProdutoController", function($scope, $http){
		
	$http.get("/produto")
	.success(function(data){
		$scope.produtos = data;
	});
	
   $scope.gridOptions = {
		   enableSorting: true,
		   columnDefs:[{}]
   } 

});