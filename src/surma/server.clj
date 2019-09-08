(ns surma.server
  (:require [compojure.core :refer [defroutes GET]]
            [ring.adapter.jetty :as jetty]
            [environ.core :refer [env]]
            [surma.handler :refer [app]]))

(defn -main [& [port]]
  (let [port (Integer. (or port (env :port) 5000))]
    (jetty/run-jetty #'app {:port port :join? false})))
