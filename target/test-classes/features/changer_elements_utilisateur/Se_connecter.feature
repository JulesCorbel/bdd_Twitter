# language : fr
@tag
Fonctionnalité: Se connecter à Twitter
  En tant qu'utilisateur de Twitter
  Je souhaite me connecter à mon compte
  Afin de profiter de toutes les fonctionnalités du site

  Scénario: Se connecter à son compte
    Soit un utilisateur non connecté sur la page d'accueil
    Quand l'utilisateur veut se connecter
    Et qu'il saisit son identifiant "testetmaintenance@gmail.com"
    Et qu'il saisit le mot de passe "3qPeWm2289xuJ5B"
    Alors il est connecté à son compte
    
  Scénario: Echouer à se connecter à son compte
    Soit un utilisateur non connecté sur la page d'accueil
    Quand l'utilisateur veut se connecter
    Et qu'il saisit son identifiant "testetmaintenance@gmail.com"
    Et qu'il saisit le mot de passe "Raté"
    Alors il échoue à se connecter
