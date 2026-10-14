# Komunikator Internetowy

# Klasa: User

## Stan:
- GUID
- FirstName
- LastName

Odpowiedzialności:
- Entity representation of a user
- Store user information


# Klasa: Message

## Stan:
- GUID
- Content
- SenderGUID or User object
- ReceiverGUID or User object
- Timestamp

## Odpowiedzialności:
- Entity representation of a message
- Store message information

# Klasa: Chat 

## Stan:
- GUID
- Name
- List<GUID> or List<User> for participants

Odpowiedzialności:
- Entity representation of a chat
- Store chat information

# Klasa: MessageThread

## Stan:
- GUID
- Name
- chatGUID or Chat object

Odpowiedzialności:
- Entity representation of a message thread 
- Store library information