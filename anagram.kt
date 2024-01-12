fun groupAnagrams(strs: Array<String>): List<List<String>> {
    return strs.groupBy { it.toCharArray().sorted() }.map { it.value }
}

val map = mutableMapOf(<String,MutableList<String>>()
for (word in strs)
val sortedWord=word.split("").sorted().joinToString
{if (!map.containsKey(sortedWord) 
map[sortedWord] = mutableListOf()
map[sortedWord]?.add(word)
map.add(word)
}
return map.values.toList
