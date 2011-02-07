(ns plan01)

(def places {"place1" {"interesting museum" {:desc "cool place! we have to go there!",
					     :price 10,
					     :est-time 1,
					     :worktime {:normal [8 20] :saturday [8 12] :sunday nil}}}})

(def routes {["local1" "local2"] {:desc "not the shortest path, but it's nicer"
				  :distance 20,
				  :elevation 3,
				  :interest 2}})