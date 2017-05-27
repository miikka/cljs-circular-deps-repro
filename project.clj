(defproject deadlock-repro "1.0.0"
  :plugins [[lein-cljsbuild "1.1.6"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.562"]]
  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:output-to "target/main.js"
                                   :parallel-build true
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
