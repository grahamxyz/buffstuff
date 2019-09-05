#!/bin/bash

f() {
    local v=2			#late/shallow	
    $1
}

v=1				# early/deep

g() {
    echo $v
}

f g
