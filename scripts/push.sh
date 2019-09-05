    
#!/bin/sh

#copy buff's slides.pdf

cp -u /home/JBuffenb/classes/354/pub/slides/slides.pdf ../



#Push
git add ../*
git commit -m "buff's stuff for $(date +%Y-%m-%d)"	
git push
