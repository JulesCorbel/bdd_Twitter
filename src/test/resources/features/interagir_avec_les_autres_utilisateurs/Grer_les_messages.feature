# language : fr

Fonctionnalité: Gérer les messages
  En tant qu'utilisateur de Twitter 
  Je souhaite pouvoir consulter et envoyer des messages
  Afin de communiquer avec les autres utilisateurs

  Scénario: Consulter ses messages
    Soit un utilisateur sur la page d'accueil
    Quand il va consulter ses messages
    Alors il n'a actuellement aucun message
    
  Scénario: Envoyer un message
    Soit un utilisateur dans ses messages
    Quand il souhaite commencer une nouvelle conversation
    Et qu'il veut parler à l'utilisateur "et_maintenance"
    Et qu'il envoie "Salut"
    Alors son message est envoyé à l'utilisateur
