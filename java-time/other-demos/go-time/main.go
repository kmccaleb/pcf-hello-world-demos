package main

import (
	"fmt"
	"log"
	"net/http"
	"os"
	"time"
)

// IndexHandler returns a simple message
func IndexHandler(w http.ResponseWriter, r *http.Request) {
	t := time.Now().Format("15:04:05")
	fmt.Fprintf(w, "Welcome to Go World Clock! The local time is %v", t)
}

func main() {
	http.HandleFunc("/", IndexHandler)

	var port string
	if port = os.Getenv("PORT"); len(port) == 0 {
		port = "8080"
	}
	log.Fatal(http.ListenAndServe(":"+port, nil))
}