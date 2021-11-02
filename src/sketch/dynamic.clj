(ns sketch.dynamic
  (:require [quil.core :refer :all]))

(def gap (/ 500 10))

(defn draw-triangle [x y]
  (stroke 360)
  (stroke-weight 1)
  (begin-shape :triangles)
  (vertex x y)
  (vertex (+ x gap) y)
  (vertex (+ x (/ gap 2)) (+ y gap))
  (end-shape :close)
  ;; (line x y (+ x gap) y)
  ;; (line (+ x gap) y (+ x (/ gap 2)) (+ y gap))
  ;; (line x y (+ x (/ gap 2)) (+ y gap))
  (stroke 0 100 100)
  (stroke-weight 8)
  (point x y)
  (point (+ x gap) y)
  (point (+ x (/ gap 2)) (+ y gap)))

(defn draw []
  (no-loop)
  (color-mode :hsb 360 100 100 1.0)
  (background 220 49 30)
  (stroke 360)
  (no-fill)

  ;; (begin-shape :lines)
  (doseq [x (range (/ gap 2) (width) gap)]
    (doseq [y (range gap (height) gap)]
      (if (even? (/ y gap))
        (draw-triangle x y)
        (draw-triangle (+ x (/ gap 2)), y))))
  ;; (end-shape)

  (save "sketch.tif")
  (save "sketch.png"))
