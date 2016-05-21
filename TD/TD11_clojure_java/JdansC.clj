(let [s (new java.util.HashSet)]
	(doto s
		(.add 1)
		(.add 2)
		(.add 3))
	(println (System/currentTimeMillis))
  	(println (.contains s 1)
 	(println (.contains s 5) )))
 	
 
 (let [l (new java.util.ArrayList)]
  (doto l
    (.add 1)
    (.add 2)
    (.add 3))
  (println (map inc l)))
  

(let [output (new java.util.zip.GZIPOutputStream (new java.io.FileOutputStream "out.gz"))]
	(doto output
		(.write(.getBytes "Hello world" ))
		(.close)))
		
		
		
(defn make-a-class []
  (proxy ;creer un objet qui permet de référencer un autre
    [java.util.ArrayList java.util.concurrent.Callable]
    [12] ; argument à la création
    (call [] (clojure.string/join "::" this)) ; redef des méthodes
    (toString [] (str "A Callable ArrayList"))  ))

(let [l (make-a-class)]
  (doto l
    (.add 1)
    (.add 2)
    (.add 3)
    (.add 4))
  (println (.call l))
  (println (.toString l))
  (println (.getClass l)) )
