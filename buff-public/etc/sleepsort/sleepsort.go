// gccgo -g -o sleepsort sleepsort.go && ./sleepsort

package main

import . "fmt"
import . "time"

func sleep(c chan int, i int) {
	Sleep(Duration(i)*Second)
	c<-i
}

func main() {
    seq:=[]int{5,6,1,8,3,7}
    c:=make(chan int)
	for i:=range seq {
		go sleep(c,seq[i])
	}
	for i:=range seq {
		seq[i]=<-c
	}
    Printf("%d\n",seq)
}
