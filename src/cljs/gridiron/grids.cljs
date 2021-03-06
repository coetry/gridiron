(ns gridiron.grids
  (:require
   [reagent.core :as r]))



(defn three-col-grid-container 

  "Takes a vector of child components
   and wraps them in a grid"

  [children]
  
  [:div {:style {:display "grid"
                 :grid-template-columns "1fr 1fr 1fr"
                 :grid-gap "40px 40px"
                 :top "0"
                 :bottom "0"
                 :height "100vh"
                 :margin"5% 5% 5% 5%"}}
   (for [child children]
     child)])

(defn four-col-grid-container 

  "Takes a vector of child components
   and wraps them in a grid"

  [children]
  
  [:div {:style {:display "grid"
                 :grid-template-columns "1fr 1fr 1fr 1fr"
                 :grid-gap "40px 40px"
                 :top "0"
                 :bottom "0"
                 :height "100vh"
                 :margin"5% 5% 5% 5%"}}
   (for [child children]
     child)])



(defn line-based-grid-col-row-short

 "Takes a component and some styling props
  for color and grid positioning"
  
  [comp color bg-color grid-pos-vec]

  (let [[gcs gce grs gre ] grid-pos-vec]
    [:div {:style {:text-transform "uppercase"
                   :background-color bg-color
                   :color color
                   :height "100%"
                   :padding-top "20px"
                   :padding-left "20px"
                   :grid-column (str gcs " / " gce)
                   :grid-row (str grs " / " gre)
                   :border-radius 5}} 
     comp]))
  




