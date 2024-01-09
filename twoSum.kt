class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in 0..nums.size-1) {
            for (j in i+1..nums.size-1) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val diffMap = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, int -> 
            diffMap[int]?.let { return intArrayOf(it, index) }
            diffMap[target - int] = index   
        }
        return intArrayOf()
    }
}

