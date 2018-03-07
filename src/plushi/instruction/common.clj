(ns plushi.instruction.common
  (:require [plushi.instruction :as i]
            [plushi.state :as state]))


(defn register-common
  [type-kw]
  (let [type-str (name type-kw)]

    (i/register (str type-str "_pop")
                (fn [x] nil)
                [type-kw] [] 0)

    (i/register (str type-str "_dup")
                (fn [x] [x x])
                [type-kw] [type-kw type-kw] 0)
    ))

(doall (map register-common [:integer :float :string :boolean :code]))
