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
                 :grid-template-columns "1fr"
                 :grid-template-rows "1fr"
                 :background-color "indianred"
                 :top "0"
                 :bottom "0"
                 :height "100vh"}}
   (for [child children]
     child)])

(defn letter [l color bg-color]
 [:h1 {:style {:text-transform "uppercase"
               :background-color bg-color
               :color color
               :height "100%"}}
        
   l])
