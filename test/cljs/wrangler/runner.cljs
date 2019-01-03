(ns wrangler.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [wrangler.core-test]))

(doo-tests 'wrangler.core-test)
