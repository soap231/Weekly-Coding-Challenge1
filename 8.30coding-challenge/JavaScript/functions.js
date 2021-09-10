function calculateAdditivePersistence(number){
   // input is integer
   let count = 0;
   let sum = number;
   while(sum >= 10){
      var s = sum.toString();
      sum = 0;
      for(let char of s){
         sum +=  parseInt(char);
      }
      //console.log(sum)
      count += 1;
   }
   console.log("AdditivePersistence(" + number + ") --> " + count);

}

function calculateMultiplicativePersistence(number){
   // input is integer
   let count = 0;
   let product = number;
   while(product >= 10){
      var s = product.toString();
      product = 1;
      for(let char of s){
         product = product * parseInt(char);
      }
      //console.log(product)
      count += 1;
   }
   console.log("MultiplicativePersistence(" + number + ") --> " + count);

}

//Demo
calculateAdditivePersistence(1679583)
calculateAdditivePersistence(123456)
calculateAdditivePersistence(6)

calculateMultiplicativePersistence(77)
calculateMultiplicativePersistence(123456)
calculateMultiplicativePersistence(4)



