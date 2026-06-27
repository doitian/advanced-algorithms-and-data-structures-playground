(ns advanced-algorithms-and-data-structures-playground.core-test
  (:require [clojure.test :refer :all]
            [advanced-algorithms-and-data-structures-playground.core :refer :all]))

(deftest main-prints-hello-world
  (testing "-main prints a greeting"
    (is (= "Hello, World!\n"
           (with-out-str
             (-main))))))
