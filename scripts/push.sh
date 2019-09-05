    
#!/bin/sh

#copy buff's slides.pdf from my local dir

cp -u ../buff-public/slides/slides.pdf ../

#Push
git add ../*

# Timestamp this baby and push the commit
git commit -m "buff's stuff @  $(date +%Y-%m-%d%t%T%t%Z)"	
git push -u origin master
