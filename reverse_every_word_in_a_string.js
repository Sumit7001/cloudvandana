function reverseWords(input) {
    const words = input.split(' '); 
    const reversedWords = words.map(reverseWord);
    const result = reversedWords.join(' ');
    return result;
}
function reverseWord(word) {
    const wordArray = word.split('');
    let left = 0;
    let right = wordArray.length - 1;
    while (left < right) {
        const temp = wordArray[left];
        wordArray[left] = wordArray[right];
        wordArray[right] = temp;

        left++;
        right--;
    }

    return wordArray.join('');
}
const input = "the sky is blue";
const reversedString = reverseWords(input);
console.log(reversedString);
