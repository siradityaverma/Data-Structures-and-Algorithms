package main

import "fmt"

// Returns index of the array where the number is found
func linearSearch(arr []int, number int) int {
	for _, i := range arr {
		if arr[i] == number {
			return i
		}
	}
	return -1
}

func main() {
	arr := []int{2, 3, 4, 10, 40}
	fmt.Println(linearSearch(arr, 10))
}
