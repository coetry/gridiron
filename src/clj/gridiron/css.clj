(ns gridiron.css
  (:require [garden.def :refer [defstyles]]))

(def green "#01DF3A")
(def yello "#F3F781")

(defstyles screen
  [:body {:font-family "Avenir"
          :background-color "indianred"
          :color "papayawhip"
          :margin "0"}]

  [:.header {:font-size "3em"
             :text-shadow "3px 3px gray"}])