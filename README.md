# Singleton

Devoir n° 1 — Patrons de construction (INF4067), Master Professionnel SIGL, Université de Yaoundé I.
Auteur : KOUONGME MBOUOM Franck Dimitri

## Contenu

- `cours/` : Singleton classique (constructeur privé, `getInstance()`)
- `modifie/` : Singleton sûr en multi-thread (`volatile` + `synchronized` avec double test), testé avec 5 threads

## Exécuter un exemple

```bash
cd <dossier>          # par exemple : cours/
javac *.java
java Client
```

Nécessite Java 8 ou plus.
