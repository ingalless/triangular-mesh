(ns sketch.dynamic
  (:require [quil.core :refer :all]))


(defn draw []
  (no-loop)
  (color-mode :hsb 360 100 100 1.0)
  (background 220 49 30)

  ;; Do some drawing here!

  (save "sketch.tif")
  (save "sketch.png"))
