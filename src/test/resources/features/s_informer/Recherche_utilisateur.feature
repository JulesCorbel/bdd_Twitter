# language : fr

Fonctionnalité: Recherche d'un utilisateur
  En tant qu'utilisateur de Twitter
  Je souhaite rechercher un autre utilisateur
  Afin de pouvoir consulter son profil

  Scénario: Recherche d'un utilisateur existant
    Soit un utilisateur sur la page d'accueil
    Quand il recherche "Pictime"
    Et qu'il choisit l'utilisateur "PictimeGroupe"
    Alors il arrive sur le profil de cet utilisateur
    
  Scénario: Recherche d'un utilisateur inexistant
    Soit un utilisateur sur la page d'accueil
    Quand il recherche "azertynemarchepas"
    Alors il n'obtient aucun résultat

