function findTop3LongestWords(input){
   // input is a string
   let wordArray = input.split(" ");
   first = second = third = "";
   for(let i=0; i < wordArray.length; i++){
      let word  = wordArray[i].toLowerCase();
      if(word[word.length-1] == ","){
         word = word.substring(0,word.length-1);
      }
      if(word.length > first.length){
         third = second;
         second = first;
         first = word;
      }
      else if (word.length > second.length) {
         third = second;
         second = word;
      }
      else if (word.length > third.length){
         third = word;
      }
   }
   let result = [];
   if(first.length >= 1){
      tag = "#" + first
      result.push(tag);
   }
   if(second.length >= 1){
      tag = "#" + second
      result.push(tag);
   }
   if(third.length >= 1){
      tag = "#" + third
      result.push(tag);
   }

   console.log("getHashTags(" + input + ")");
   console.log("--> " + result);
   
}

//Demo
findTop3LongestWords("How the Avocado Became the Fruit of the Global Trade");
findTop3LongestWords("Why You Will Probably Pay More for Your Christmas Tree This Year");
findTop3LongestWords("Hey Parents, Surprise, Fruit Juice Is Not Fruit");
findTop3LongestWords("Visualizing Science");




