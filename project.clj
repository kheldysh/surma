(defproject surma "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/java.jdbc "0.7.10"]
                 [org.postgresql/postgresql "42.2.6"]
                 [metosin/compojure-api "2.0.0-alpha30"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [environ "1.1.0"]
                 [migratus "1.2.4"]]
  :ring {:handler surma.handler/app}
  :uberjar-name "server.jar"
  :min-lein-version "2.8.1"
  :plugins [[lein-environ "1.1.0"]
            [migratus-lein "0.7.2"]]
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]]
                       :plugins      [[lein-ring "0.12.5"]]}}
  :migratus {:store         :database
             :migration-dir "migrations"
             :db            {:classname   "org.postgresql.Driver"
                             :subprotocol "postgresql"
                             :subname     "//localhost/migratus"
                             :user        "root"
                             :password    ""}})
