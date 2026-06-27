(defproject advanced-algorithms-and-data-structures-playground "0.1.0-SNAPSHOT"
  :description "A Clojure playground for implementing and exploring advanced algorithms and data structures."
  :url "https://github.com/doitian/advanced-algorithms-and-data-structures-playground"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.2"]]
  :main ^:skip-aot advanced-algorithms-and-data-structures-playground.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
