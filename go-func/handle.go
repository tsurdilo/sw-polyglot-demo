package main

import (
  "encoding/json"
  "net/http"
)

type response1 struct {
    GoFunc   string
}

func main() {
  http.HandleFunc("/", foo)
  http.ListenAndServe(":8081", nil)
}

func foo(w http.ResponseWriter, r *http.Request) {
	reply := response1{"Invoked Go Function"}

  js, err := json.Marshal(reply)
  if err != nil {
    http.Error(w, err.Error(), http.StatusInternalServerError)
    return
  }

  w.Header().Set("Content-Type", "application/json")
  w.Write(js)
}