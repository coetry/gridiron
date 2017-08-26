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
  [:div
   [g/container
    [[g/letter "a" "#333333" "#FFA3D7"]
     [g/letter "b" "#333333" "#9EEBCF"]
     [g/letter "c" "#333333" "#96CCFF"]
     [g/letter "d" "#333333" "#FFDFDF"]
     [g/letter "e" "#333333" "#555555"]
     [g/letter "f" "#333333" "#AAAAAA"]]]

   [:br]
   
   [g/container
    [[g/letter "g" "#333333" "#FFA3D7"]
     [g/letter "h" "#333333" "#9EEBCF"]
     [g/letter "i" "#333333" "#96CCFF"]
     [g/letter "j" "#333333" "#FFDFDF"]
     [g/letter "k" "#333333" "#555555"]
     [g/letter "l" "#333333" "#AAAAAA"]]]])


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
