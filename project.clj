(defproject captain-githook "0.1.0-SNAPSHOT"
  :description "a modest seafaring git POST hook server."
  :url "http://github.com/danneu/captain-githook"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler captain-githook.handler/app}
  :main captain-githook.handler
  :aot [captain-githook.handler]
  :profiles {:dev {:dependencies [[ring-mock "0.1.5"]]}}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.github.maricn/logback-slack-appender "1.1.0"]
                 [ring/ring "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [compojure "1.4.0"]
                 [org.clojure/data.json "0.2.3"]
                 [prismatic/schema "1.0.4"]
                 [org.julienxx/clj-slack "0.5.2.1"]
                 [org.clojure/tools.logging "0.3.1"]
                 [ch.qos.logback/logback-classic "1.1.3"]])
