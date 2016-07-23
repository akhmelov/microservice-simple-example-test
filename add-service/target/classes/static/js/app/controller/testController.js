'use strict';

myApp.controller('TestController',
    ['$scope', '$http', function($scope, $http) {
            $scope.user = $scope.initial;
            $scope.users = [];
            $scope.addUser = function(){
                $scope.users.push(JSON.parse(JSON.stringify($scope.user)));
                $http.put('message', $scope.user).then(
                  function(respone){
                    console.debug(respone);
                  }, function (respone) {
                    console.debug(respone);
                });
            }
        
        }]);