# language : fr

Fonctionnalité: Changer les paramètres
  En tant qu'utilisateur de Twitter
  Je souhaite changer mes paramètres
  Afin de modifier les informations incorrectes

  Scénario: Changer la langue
    Soit un utilisateur sur la page d'accueil
    Quand il veut changer ses paramètres
    Et qu'il choisit "English-Anglais" comme langue de son Twitter
    Alors son Twitter passe en anglais
    
  Scénario: Exiger des informations pour réinitialiser son mot de passe
    Soit un utilisateur sur la page d'accueil
    Quand il veut changer ses paramètres
    Et qu'il souhaite exiger des informations personnelles pour réinitialiser son mot de passe
    Alors cette fonctionnalité est ajoutée à son compte
