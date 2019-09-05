    
#!/bin/sh

#copy buff's slides.pdf

cp -u ../buff-public/slides/slides.pdf ../



#Push
git add ../*
git commit -m "buff's stuff @  $(date +%Y-%m-%d%t%T%t%Z)"	
git push
