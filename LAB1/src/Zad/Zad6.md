
# Klasa: Book


## Stan:
- GUID
- Title
- Writer
- ISBN
- PublicationYear 

Odpowiedzialności:
- Entity representation of a book
- Store book information

# Klasa: Reader


## Stan:
- GUID
- FirstName
- LastName
- LibraryCardNumber

Odpowiedzialności:
- Entity representation of a reader
- Store reader information

# Klasa: Library


## Stan:
- GUID
- Name

Odpowiedzialności:
- Entity representation of a library
- Store library information


# Klasa: BookBorrowing


## Stan:
- GUID
- BookGUID or Book object
- ReaderGUID or Reader object
- BorrowDate
- ReturnDate

Odpowiedzialności:
- Entity representation of a book borrowing
- Store book borrowing information
- Remembering the date of borrowing and the return deadline



Przeanalizuj następujący opis:

Tworzony jest system obsługi biblioteki. 
Biblioteka posiada książki. 
Każda książka ma tytuł, autora, ISBN oraz rok wydania. 
Z biblioteki korzystają czytelnicy posiadający imię, nazwisko oraz numer karty bibliotecznej. 
Czytelnik może wypożyczyć książkę. 
System musi pamiętać datę wypożyczenia oraz termin zwrotu.