'use strict';

myApp.controller('TestController',
    ['$scope', function($scope) {

        var userSelectedIndex = -1;

        $scope.user = $scope.initial;
        $scope.users = [];
        $scope.users.push({name: 'name1', surname: 'surname1', email: 'email1'});
        $scope.users.push({name: 'name2', surname: 'surname2', email: 'email2'});
        $scope.users.push({name: 'name3', surname: 'surname3', email: 'email3'});

        $scope.editUserSubmit = function(){
            $scope.users[userSelectedIndex] = JSON.parse(JSON.stringify($scope.user));
        };
        $scope.editUser = function(userArg){
            userSelectedIndex = $scope.users.indexOf(userArg);
            $scope.user =  JSON.parse(JSON.stringify(userArg));
        };
        $scope.deleteUser = function(userArg){
            var index = $scope.users.indexOf(userArg);
            $scope.users.splice(index, 1);
        };
    }]);