(ns example.routes)

(defn handler
  [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello, world"})