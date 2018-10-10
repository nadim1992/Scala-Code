// Scala implementation of recursive Binary Search 
class BinarySearch {
    // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    def search(arr: Array[Int], l: Int, r: Int, x: Int):
               Int = {
        if (r >= l) {
            var mid: Int = l + ( r - l) / 2
  
            // If the element is present at the  
            // middle itself 
            if (arr(mid) == x) 
                return mid

            // If element is smaller than mid, then  
            // it can only be present in left subarray 
            if (arr(mid) > x) 
               return search(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return search(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        -1; 
    }
  
} 

// Driver method to test above
object App {
    def main(args: Array[String]) {
        val arr: Array[Int] = Array(2, 3, 4, 10, 40)
        val n: Int = arr.length
        val x: Int = 10

        val binarySearch = new BinarySearch()
        val result: Int = binarySearch.search(arr, 0, 
                                            n - 1, x)
        if (result == -1) {
            println("Element not present")
        } else {
            println("Element found at index " + result)
        }
    }
}
