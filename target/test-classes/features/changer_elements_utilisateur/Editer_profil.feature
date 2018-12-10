# language : fr

Fonctionnalité: Editer le profil
  En tant qu'utilisateur de Twitter
  Je souhaite éditer mon profil
  Afin de donner plus d'informations sur moi

  Scénario: Changer le nom d'utilisateur
    Soit un utilisateur sur son profil
    Quand il veut éditer son profil
    Et qu'il choisit comme nouveau nom d'utilisateur "New Name"
    Alors son nom d'utilisateur est changé
    
  Scénario: Changer la biographie
    Soit un utilisateur sur son profil
    Quand il veut éditer son profil
    Et qu'il écrit "Compte créé pour faire des tests"
    Alors sa biographie est changée
