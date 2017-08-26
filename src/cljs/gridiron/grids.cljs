(ns gridiron.grids
  (:require
   [reagent.core :as r]))


(defn header [text]
  [:h1 {:class "header"}
   text])


(defn container 
  "Takes a vector of child components
   and makes wraps them in a grid"

  [children]
  
  [:div {:style {:display "grid"
                 :grid-template-columns "1fr 1fr 1fr"
                 :grid-gap "10px"
                 :top "0"
                 :bottom "0"
                 :height "100vh"
                 :margin"5% 5% 5% 5%"}}
   (for [child children]
     child)])

(defn letter [l color bg-color grid-pos-vec]
  [:div {:style {:text-transform "uppercase"
                 :background-color bg-color
                 :color color
                 :height "90%"
                 :padding-top "20px"
                 :padding-left "20px"
                 :grid-column (str (nth grid-pos-vec 0)
                                   " / "
                                   (nth grid-pos-vec 1))
                 :grid-row (str (nth grid-pos-vec 2)
                                   " / "
                                   (nth grid-pos-vec 3))
                 :border-radius 5}} 
   [:p l]])
