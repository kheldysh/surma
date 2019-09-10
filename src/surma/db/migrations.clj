(ns surma.db.migrations
  (:require [clojure.tools.logging :refer [info]]
            [migratus.core :as migratus]
            [surma.db.generic :as db]))

(def config {:store                :database
             :migration-dir        "migrations/"
             :init-script          "init.sql" ;script should be located in the :migration-dir path
             ;defaults to true, some databases do not support
             ;schema initialization in a transaction
             :init-in-transaction? false
             :migration-table-name "schema_migrations"
             :db db/spec})

;initialize the database using the 'init.sql' script

(defn init-db []
  (info "initializing DB")
  (migratus/init config))
