# language : fr

Fonctionnalité: Tweeter
  En tant qu'utilisateur de Twitter
  Je souhaite pouvoir tweeter
  Afin de pouvoir intéragir avec la Tweetosphère

  Scénario: Envoyer un tweet
    Soit un utilisateur sur la page d'accueil
    Quand il souhaite envoyer un tweet
    Et qu'il saisit le message "First Tweet #test"
    Alors son tweet est envoyé
    
  Scénario: Supprimer un Tweet
    Soit un utilisateur sur son profil
    Quand il choisit le Tweet le plus récent
    Et qu'il veut le supprimer
    Alors le Tweet est supprimé
