function isUnique(str) {
  let result = true;
  const charsFound = {};

  str.split('').forEach((chr) => {
    if (charsFound[chr]) {
      result = false;
    }

    charsFound[chr] = true;
  });

  return result;
}

console.log(isUnique('abcdefgh'));
console.log(isUnique('abcdeafg'));
