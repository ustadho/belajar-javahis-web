/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


angular.module('belajar')
.controller('produkController', ['$scope', function($scope){
       $scope.produk = [{kode: "P01", nama: "Produk 1"}];
   }]);