(defproject agirtis-site "0.1.0-SNAPSHOT"
  :description "Site for AGI - RT ⑊ IS"
  :url "http://github.com/oubiwann/agirtis-site"
  :license {:name "Apache V2 License"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [http-kit "2.1.16"]
                 [ring "1.2.1"]
                 [compojure "1.1.6"]
                 [org.clojure/clojurescript "0.0-2138"]
                 [tailrecursion/boot.core "1.2.3"]]
  :source-paths ["src/clj"]
  :jvm-opts ^:replace ["-Xmx512m" "-server"]
  :aot [io.cogitat.devserver]
  :main io.cogitat.devserver/run)
