package main

import (
    "fmt"
    "net/http"
    "encoding/json"
)

func handler(w http.ResponseWriter, r *http.Request) {
    message := map[string]string{"message": "Hello, Docker!"}
    w.Header().Set("Content-Type", "application/json")
    json.NewEncoder(w).Encode(message)
}

func main() {
    http.HandleFunc("/", handler)
    fmt.Println("Starting server on :8080...")
    http.ListenAndServe(":8080", nil)
}

