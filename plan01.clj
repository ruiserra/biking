(ns plan01
  (:use [clojure.contrib.def :only (defvar)]))

(def places {"local1" {:desc "cool place! we have to go there!",
		       :price 10,
		       :est-time 1,
		       :worktime {:normal [8 20] :saturday [8 12] :sunday nil}}})

(def routes {["local1" "local2"] {:distance 20,
				  :elevation 3,
				  :interest 2}})