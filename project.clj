(defproject pushi "0.1.0-SNAPSHOT"
  :description "A language agnostic Push language interpreter"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/data.json "0.2.6"]]
  :plugins [[lein-codox "0.10.3"]]
  :main ^:skip-aot pushi.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :codox {:namespaces [pushi.atoms pushi.core pushi.encode pushi.instruction
                       pushi.interpreter pushi.state pushi.utils
                       pushi.instruction.io]
          :metadata {:doc "FIXME: write docs"}})
