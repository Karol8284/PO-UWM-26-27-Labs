# Programowanie obiektowe - laboratoria

Samodzielne repozytorium z kodem z laboratoriow z przedmiotu
**Programowanie obiektowe (Java)**.

Repozytorium jest przeznaczone do:

- przechowywania rozwiazan kolejnych zadan laboratoryjnych;
- dodawania krotkich opisow zalozen i sposobu uruchomienia;
- zachowania testow, notatek z weryfikacji i historii zmian;
- oddawania prowadzacemu tylko kodu zrodlowego potrzebnego do oceny.

## Zasady

Aktualne wymagania prowadzacego maja pierwszenstwo przed tym plikiem.
W szczegolnosci:

- zadania punktowane nalezy przygotowywac samodzielnie;
- nie wolno uzywac generatywnej AI do generowania, uzupelniania,
  modyfikowania ani poprawiania kodu oddawanego jako rozwiazanie zadania;
- przed oddaniem trzeba umiec wyjasnic kod i wykonac niewielka modyfikacje
  na prosbe prowadzacego;
- do repozytorium trafia kod zrodlowy, a nie pliki wygenerowane przez IDE
  lub kompilator.

## Struktura

```text
Labs/
├── labs/
│   ├── README.md
│   ├── lab-01-temat/
│   │   ├── README.md
│   │   └── src/
│   └── lab-02-temat/
│       ├── README.md
│       └── src/
├── templates/
│   └── lab/
│       └── README.md
├── .editorconfig
├── .gitattributes
├── .gitignore
└── README.md
```

Kazde laboratorium ma osobny katalog w `labs/`. Nazwa katalogu powinna:

- zaczynac sie od numeru z dwoma cyframi;
- krotko opisywac temat;
- uzywac malych liter i lacznikow zamiast spacji;
- pozostac stabilna po opublikowaniu zadania.

Przyklady:

```text
lab-01-java-basics
lab-02-classes-and-objects
lab-03-encapsulation
lab-04-inheritance
```

## Jak dodac kolejne laboratorium

1. Skopiuj `templates/lab/` do `labs/lab-XX-krotki-temat/`.
2. Uzupelnij README nowego laboratorium.
3. Dodaj kod zrodlowy w ustalonej strukturze `src/`.
4. Uruchom i sprawdz rozwiazanie w IntelliJ IDEA albo z linii polecen.
5. Usun pliki lokalne IDE i pliki wygenerowane przed oddaniem.
6. Zaktualizuj indeks w `labs/README.md`.

Nie tworz osobnego repozytorium Git dla kazdego laboratorium. Jedno repozytorium
`Labs` upraszcza oddawanie kodu i zachowuje wspolna historie zmian.

## Minimalna karta laboratorium

README kazdego laboratorium powinien zawierac:

- temat i tresc zadania albo odnosnik do materialu prowadzacego;
- date wykonania;
- sposob kompilacji i uruchomienia;
- opis uzytych mechanizmow OOP;
- informacje o testach lub recznej weryfikacji;
- znane ograniczenia i elementy wymagajace sprawdzenia.

## Przed publikacja

Wykonaj lokalnie:

```powershell
git status
git add .
git diff --cached --check
```

Nastepnie sprawdz, czy w zmianach nie ma:

- katalogow `.idea/`, `out/`, `target/`, `build/` ani `.gradle/`;
- plikow `.class`, logow i innych artefaktow kompilacji;
- lokalnych sekretow lub konfiguracji srodowiska;
- rozwiazan albo materialow, ktorych nie wolno publikowac.

## Uruchamianie prostego laboratorium Java

Szczegolowe polecenia powinny znajdowac sie w README konkretnego laboratorium.
Dla prostego projektu bez systemu budowania schemat moze wygladac tak:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
java -cp out package.Main
```

Katalog `out/` jest lokalnym katalogiem wynikowym i jest ignorowany przez Git.

## Publikacja w osobnym repozytorium GitHub

Po utworzeniu pustego repozytorium na GitHubie podlacz je lokalnie:

```powershell
git remote add origin <adres-repozytorium>
git add .
git commit -m "chore: initialize object-oriented programming labs"
git push -u origin main
```

### READMY.md napisane na szybko w AI, wygodniejsze dla mnie to.
