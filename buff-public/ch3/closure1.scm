#!/bin/guile
!#

(define (g ff)
  (let ((i 2))				;late/shallow
    (ff)))

(define (closure)
  (let ((i 1))				;early/deep
    (define (f)
      (display i)
      (display "\n"))
    (g f)))

(closure)
