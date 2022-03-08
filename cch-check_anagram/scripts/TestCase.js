const words = ["silent", "listen"];
console.log(findAnagram(words));

function findAnagram(words) {
    let sameCharOccur = 0;
    if (words[0].length === words[1].length) {
        for (let i = 0; i < words[0].length; i++) {
            for (let j = 0; j < words[1].length; j++) {
                if (words[0].charAt(i) === words[1].charAt(j)) {
                    sameCharOccur++;
                }
            }
        }
    }
    if (sameCharOccur === (words[0].length + words[1].length) / 2) {
        return "Entered Words are anagram";
    } else {
        return "Entered Words Not are anagram";
    }
}
