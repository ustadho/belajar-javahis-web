/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var phonecatApp = angular.module('phonecatApp', []);

phonecatApp.controller('ProdukCtrl', function ($scope, $http) {
  $http.get('../api/produk/list').success(function(data){
      $scope.produk=data;
  });
  
  $scope.simpan = function(){
      alert('Tombol Simpan ditekan!');
  }
  
});

