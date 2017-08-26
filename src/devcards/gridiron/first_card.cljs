(ns gridiron.first-card
  (:require-macros
   [devcards.core :as dc :refer [defcard
                                 defcard-doc
                                 defcard-rg
                                 mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core :as r]))


(def styles {:font-family "Avenir"
             :color "indianred"})

(defcard-rg hi
  [:div
   [:h1 {:styles styles} "hey, hey, hey, friend"]])

(defcard-rg bye
  "bye"
  [:h1 "bye"])







