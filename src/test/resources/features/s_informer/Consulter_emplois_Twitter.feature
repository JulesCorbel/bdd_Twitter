# language : fr
@tag
Fonctionnalité: Consulter les emplois proposés par Twitter
  En tant qu'utilisateur de Twitter
  Je souhaite consulter les emplois que propose Twitter
  Afin de pourquoi pas trouver un emploi

  Scénario: Recherche par mot-clé
    Soit un utilisateur sur la page d'accueil
    Quand il veut consulter les offres d'emploi proposées par Twitter
    Et qu'il rentre le mot-clé "Data Scientist"
    Alors il obtient 33 résultats pour sa recherche
    
  Scénario: Recherche sans résultat
    Soit un utilisateur sur le site de recrutement de Twitter
    Quand il rentre le mot-clé "Internship"
    Et qu'il choisit l'équipe "machine-learning"
    Alors sa recherche ne donne aucun résultat
