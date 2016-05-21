(ns hello-world)  ; Commentaire

; Commentaire
(println "Hello, world!")

;apply permet d'appliquer des arguments directement d'une fonction
;(apply odd? [1])
;(apply + [1 2 3])
;(apply + '(1 2 3))


;(or false false true)

(defn either [pred1 pred2]
  (fn [x] (or
    (apply pred1 [x])	
    (apply pred2 [x]) )))
    
(defn check []
  (let [p1 odd? p2 even?]               ;affecte une valeur a un nom localement
    (let [always-true (either p1 p2)]
      (println (always-true 1))
      (println (always-true 2)) )))

(check)


(defn fen[n]
	 (repeatedly 10000 (fn[](rand-int n))))
(println (take 10 (fen 4)))

(defn moy []
	(let [val (take 1000 (fen 5)) ]
		(let [som (reduce + val)]
			(let [nb (count val)]
				(/ som nb)))))

(defn moyPair []
	(let [pair (filter even? (fen 5))]
		(println (take 10 pair))
		(let [val (take 1000 pair) ]
			(let [som (reduce + val)]
				(let [nb (count val)]
					(/ som nb))))))
				
(def res (moy))
(println res (double res))

	
(def res2 (moyPair))
(println res2 (double res2))

(defn fib [n]
	 (cond
	 	(= n 0) n
	 	(= n 1) n 
	 	:else (+ (fib(- n 1)) (fib(- n 2)))
	 )
)

(def nat (range 0 30))
(println nat)

(println
	(map 
		(fn [x](fib x))
		nat))
	

