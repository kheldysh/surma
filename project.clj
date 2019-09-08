(defproject surma "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [metosin/compojure-api "2.0.0-alpha30"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [environ "1.1.0"]]
  :ring {:handler surma.handler/app}
  :uberjar-name "server.jar"
  :min-lein-version "2.8.1"
  :plugins [[lein-environ "1.1.0"]]
  :hooks [environ.leiningen.hooks]
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]]
                       :plugins      [[lein-ring "0.12.5"]]}})
