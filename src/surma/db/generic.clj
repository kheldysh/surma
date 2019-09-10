(ns surma.db.generic
  (:require [clojure.java.jdbc :as sql]
            [environ.core :refer [env]]))

(def spec (or (env :DATABASE_URL)
              (System/getenv "DATABASE_URL")
              "postgresql://localhost:5432/"))
