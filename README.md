# buffstuff
A public mirror of buff's public directory. A crontab on onyx calls the script every day.
Hopefully, this public Github repo is easier to get to than the public onyx dir.
I got tired of running MobaXterm every morning to find the slides.pdf :)

Below is the crontab command. Every day at 6 AM Boise time, buff's changes will be reflected in this repo:

```0 6 * * * cd /home/GRAHAMHILL/Documents/github/buffstuff/scripts/ && ./run.sh
```

Last edited on Sept 5, 2019.

# Contents 

### buff-public
A copy of /home/JBuffenb/classes/354/pub/ on Boise State Onyx network.
All contents are the work of Jim Buffenbarger, visit his home page @ http://cs.boisestate.edu/~buff/

### scripts
* getbuff.sh

Copies buff's public directory into my local directory. Only copies if there are changes.

* push.sh

Copies slides.pdf into the top-level folder of this git project. Pushes to github.

* run.sh

Calls getbuff.sh and then push.sh, that's it!

### README.md
this file

### slides.pdf
this is the content that buff presents in arguably his most popular couse, CS 354.
It is placed in the top-level directory for easy access.

## Thanks for looking!
