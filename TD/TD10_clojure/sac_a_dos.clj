
(defn compte [ total list ]
	(cond
		(empty? list) 0
		(= total 0) 1
		(< total 0) 0
		:else ( + (compte (- total (first list)) list) (compte total rest(list)))
	)
		
)
		
		
		
	
(println (compte 4 '(1 2)))
