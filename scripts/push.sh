    
#!/bin/sh

#copy buff's slides.pdf

cp -u /home/JBuffenb/classes/354/pub/slides/slides.pdf ../



#Push
git add ../*
git commit -m "buff's stuff @  $(date +%Y-%m-%d%t%T%t%Z)"	
git push
