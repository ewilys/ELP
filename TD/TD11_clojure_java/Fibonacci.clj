(ns Fibonacci)  
  
(defn fib [n]
	 (cond
	 	(= n 0) n
	 	(= n 1) n 
	 	:else (+ (fib(- n 1)) (fib(- n 2)))
	 )
)

