package main

import (
	"fmt"
)

func main() {
	var a, i int
	fmt.Scan(&a)
	for i = 2; i <= a; i = i + 2 {
		fmt.Printf("%d^2 = %d\n", i, i*i)
	}
}
