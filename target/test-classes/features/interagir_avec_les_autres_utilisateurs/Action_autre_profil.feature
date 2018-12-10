# language : fr
@tag
Fonctionnalité: Actions sur un utilisateur
  En tant qu'utilisateur de Twitter
  Je souhaite effectuer des actions par rapport à un autre utilisateur
  Afin de pouvoir suivre ou non ses actualités

  Scénario: Suivre un utilisateur
    Soit un utilisateur sur la page d'accueil
    Quand il souhaite aller sur la page Twitter de "lillefrance"
    Et qu'il veut s'abonner à cet utilisateur
    Alors il y est maintenant abonné
    
  Scénario: Masquer un utilisateur
    Soit un utilisateur sur la page d'accueil
    Quand il souhaite aller sur la page Twitter de "lillefrance"
    Et qu'il souhaite masquer le profil de cet utilisateur
    Alors il ne recevra plus de notifications de la part de cet utilisateur

