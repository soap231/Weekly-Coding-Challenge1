function longestNonRepeatingSubstring(input){
   // input is a string
   let charSet = new Set();
   let output = "";

   for(let char of input){
      if(charSet.has(char)){
         break;
      }else{
         output += char;
         charSet.add(char);
      }
   }
   console.log("longestNonRepeatingSubstring of " + input + ": " + output);

}

//Demo
longestNonRepeatingSubstring("abcabcbb");
longestNonRepeatingSubstring("aaaaaa");
longestNonRepeatingSubstring("abcde");
longestNonRepeatingSubstring("abcda");




