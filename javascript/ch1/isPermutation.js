function getCharCounts(str) {
  const result = {};

  str.split('').forEach((chr) => {
    const count = result[chr] || 0;
    result[chr] = count + 1;
  });

  return result;
}

function checkCounts(counts1, counts2) {
  for (chr in counts1) {
    if (counts1[chr] !== counts2[chr]) {
      return false;
    } 
  }

  return true;
}

function isPermutation(s1, s2) {
  if (s1.length !== s2.length) {
    return false;
  }

  const s1CharCounts = getCharCounts(s1);
  const s2CharCounts = getCharCounts(s2);

  return checkCounts(s1CharCounts, s2CharCounts) && checkCounts(s2CharCounts, s1CharCounts);

}

console.log(isPermutation('foo', 'oof'));
console.log(isPermutation('car', 'arc'));
console.log(isPermutation('foo', 'bar'));
