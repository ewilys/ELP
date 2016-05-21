    
(defn fib [n]
	 (cond
	 	(= n 0) n
	 	(= n 1) n 
	 	:else (+ (fib(- n 1)) (fib(- n 2)))
	 )
)

(println (fib 0))
(println (fib 1))
(println (fib 2))
(println (fib 10))
(println (fib 30))
