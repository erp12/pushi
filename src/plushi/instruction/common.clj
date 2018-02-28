(ns plushi.instruction.common
  (:require [plushi.instruction :as i]
            [plushi.state :as state]))


(defn register-common
  [type-kw]
  (let [type-str (name type-kw)]
    (i/register (str type-str "_pop")
                #(state/pop-item % type-kw)
                :STATE [:STATE])
    (i/register (str type-str "_dup")
                #(state/top-item % type-kw)
                :STATE [type-kw])
    ))

(doall (map register-common [:integer :float]))