(def pg \()
(def pd \))



(defn parcours [chaine compt]
	(cond 
		(empty? chaine) (= compt 0)
		(< compt 0) false
		(= (first chaine) pg) (parcours (rest chaine) (inc compt))
		(= (first chaine) pd) (parcours (rest chaine) (dec compt))
		:else (parcours (rest chaine) compt) 
	)
)

(defn balanced? [chaine]
	(parcours chaine 0))
			
(println (balanced? "()"))
(println (balanced? ")("))
(println (balanced? "(( abc))"))
(println (balanced? "())"))
(println (balanced? "(("))
