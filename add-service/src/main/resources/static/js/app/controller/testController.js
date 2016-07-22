'use strict';

myApp.controller('TestController',
    ['$scope', function($scope) {
            $scope.user = $scope.initial;
            $scope.users = [];
            $scope.addUser = function(){
                $scope.users.push(JSON.parse(JSON.stringify($scope.user)));
            }
        
        }]);