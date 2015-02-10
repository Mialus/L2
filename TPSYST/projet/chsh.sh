#!/bin/sh
ETC_PASSWD=~/TPSYST/projet/etc/passwd
ETC_SHADOW=~/TPSYST/projet/etc/shadow
ETC_GROUP=~/TPSYST/projet/etc/group

if [ "$*"=NULL ]; then
    echo $user
else
  if [ "$*"=grep "^$user:" /etc/passwd ]; then
    echo "veuillez entrer le mot de passe root : "
    read $mdp
  else
    echo "l'utilisateur n'existe pas"
  fi
fi