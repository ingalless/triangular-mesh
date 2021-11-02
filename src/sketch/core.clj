(ns sketch.core
  (:require [sketch.dynamic :as dynamic])
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(q/defsketch sketch
  :title "Triangular Mesh"
  :size [500 500]
  :draw dynamic/draw
  :features [:keep-on-top])

(defn refresh []
  (use :reload 'sketch.dynamic)
  (.loop sketch))
