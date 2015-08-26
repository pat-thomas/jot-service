(ns jot-service.core
  (:require [org.httpkit.server :as http]
            [cheshire.core      :as json]))

(defn app
  [req]
  (def req req)
  {:status  200
   :headers {"Content-Type" "application/json"}
   :body    (json/generate-string {:message "Pong!"})})

(defn main
  []
  (http/run-server #'app {:port 8080}))

(comment
  (main)
  )
