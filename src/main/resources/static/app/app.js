angular.module("app",['ui.grid']);
angular.module("app").controller("MainController", function($scope, $http){
	$scope.nome = "George A. A. Bonespírito";
	
	$http.get("/produto")
	.success(function(data){
		$scope.produtos = data;
	});
	
   $scope.gridOptions = {
		   enableSorting: true,
		   columnDefs:[{}]
   } 

});