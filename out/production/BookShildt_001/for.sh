#!/bin/bash

CURRENT=`pwd`
dirname=`basename "$CURRENT"`

echo "$dirname"

ls | grep class | sed 's/\..*//' > ~/tmp/filename.txt
ls | grep class > ~/tmp/file.txt

echo "ENTER INDEX:"
read index

for filename in `cat ~/tmp/filename.txt`
do
  echo $filename

  javap -c -v $filename.class > $filename-$index.txt
  echo "#############################################################################################" >> $filename-$index.txt
  cat ../../../../src/$dirname/*.java >> $filename-$index.txt
  echo "\n---------------------------------------------------------------------------------------------" >> $filename-$index.txt

  mv $filename.class $filename-$index.class
  # echo "We have created file $filename-$index.txt and $filename-$index.class"

  # cp $filename-$index.class e:/TMP 2>&1  #/
  # mv $filename-$index.* SAVE_CLASS
  
done