(ns captain-githook.slack)

(def connection {:api-url "https://slack.com/api" :token "YOUR TOKEN"})

(defn post-message [channel-id text]
  (clj-slack.chat/post-message
    connection
    channel-id
    text
    {:username
     (str
       "captain-githook-"
       (.getCanonicalHostName
         (java.net.InetAddress/getLocalHost)))
     :icon_emoji ":ghost:"}))

;; success response example
;{:ok true, :channel "xxx", :ts "1455029267.000005",
;:message {:text "test2", :username "captain-githook-zarni-E7450",
;:icons {:emoji ":ghost:", :image_64 "https://slack.global.ssl.fastly.net/d4bf/img/emoji_2015_2/apple/1f47b.png"},
;:type "message", :subtype "bot_message", :ts "1455029267.000005"}}

