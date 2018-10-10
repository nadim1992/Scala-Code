// Scala code for linearly search x in arr[].
// if x is present then return its location,
// otherwise return -1
class LinearSearch {
    def search(arr: Array[Int], n: Int, x: Int): Int = {
        var i: Int = 0

        for (a <- 0 until n) {
            if (arr(a) == x) return a
        }
        
        -1
    }
}

// Driver program to test above method
object App {
    def main(args: Array[String]) {
        val arr = Array(1, 4, 5, 6, 77, 52, 33, 8)
        val n = arr.length
        val x = 6

        val linearSearch = new LinearSearch()
        val result = linearSearch.search(arr, n, x)
        
        if (result == -1) {
            println("Element is not present in the array.")
        } else {
            println("Index: " + result)
        }
    }
}