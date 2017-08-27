(ns gridiron.core  
  (:require
   [reagent.core :as r]
   [gridiron.grids :as g]))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Vars

(defonce app-state
  (r/atom {}))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Page



(defn page [ratom]
  [:div {:style {:margin "5%"}}

   [:h1 "Line-based Placement (Grid Col/Row Shorthand)"]
   
   [g/grid-container
    [[g/line-based-grid-col-row-short [:p "a"] "#333333" "#FFA3D7" [2 3 1 2]]
     [g/line-based-grid-col-row-short [:p "b"] "#333333" "#9EEBCF" [2 3 2 3]]
     [g/line-based-grid-col-row-short [:p "c"] "#333333" "#96CCFF" [3 4 2 3]]
     [g/line-based-grid-col-row-short [:p "d"] "#333333" "#FFDFDF" [1 2 1 2]]
     [g/line-based-grid-col-row-short [:p "e"] "#333333" "#555555" [1 2 2 3]]
     [g/line-based-grid-col-row-short [:p "f"] "#333333" "#AAAAAA" [3 4 1 2]]]]

   [:h1 "Line-based Placement Spanning Tracks"]
   
   [g/grid-container
    [[g/line-based-grid-col-row-short [:p "a"] "#333333" "#FFA3D7" [1 2 1 3]]
     [g/line-based-grid-col-row-short [:p "b"] "#333333" "#9EEBCF" [2 4 1 2]]
     [g/line-based-grid-col-row-short [:p "c"] "#333333" "#96CCFF" [2 3 2 3] ]
     [g/line-based-grid-col-row-short [:p "d"] "#333333" "#FFDFDF" [3 4 2 3]]]]])


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Initialize App

(defn dev-setup []
  (when ^boolean js/goog.DEBUG
    (enable-console-print!)
    (println "dev mode")
    ))

(defn reload []
  (r/render [page app-state]
                  (.getElementById js/document "app")))

(defn ^:export main []
  (dev-setup)
  (reload))
