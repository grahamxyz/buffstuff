    
#!/bin/sh

#copy buff's stuff
cp /home/JBuffenb/classes/354/pub/slides/slides.pdf .

#Push
git add -A
git commit -m "buff's stuff for $(date +%Y-%m-%d)"	
git push
