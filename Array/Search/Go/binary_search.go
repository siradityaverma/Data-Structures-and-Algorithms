package main

import "fmt"

// Returns index of the array where the number is found
func binarySearch(arr []int, left int, right int, number int) int {
	if right >= left {
		mid := left + (right-left)/2
		if arr[mid] == number {
			return mid
		}
		if arr[mid] > number {
			return binarySearch(arr, left, mid-1, number)
		}

		if arr[mid] < number {
			return binarySearch(arr, mid+1, right, number)
		}
	}
	return -1
}

func main() {
	arr := []int{2, 3, 4, 10, 40}
	fmt.Println(binarySearch(arr, 0, len(arr), 10))
}
