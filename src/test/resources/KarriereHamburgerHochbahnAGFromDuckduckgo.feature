# language: de
# encoding: utf-8

@RegTest
@GUI
@hochbahn
@karriere

Funktion: Hochbahn AG
"""
Überprüfen der Funktionalität und Korrektheit des Navigationssystems auf der Karriereseite der Hamburger Hochbahn AG.
Insbesondere testet das Szenario, ob das erfolgreiche Navigieren von einer externen Suchmaschine zur Homepage,
das Lokalisieren von Navigationselementen auf der Homepage und schließlich das Klicken auf den "Kontakt"-Button zur erwarteten "Kontakt"-Seite führt."""

  Szenario: Navigation zur Karierre-Seite der Hochbahn
    #Precondition
    Angenommen Eine Suchmaschine 'duckduckgo.de' wird aufgerufen
    #Prozess
    Wenn "karriere hochbahn" in das Suchfeld eingegeben wird
    Und In der Ergebnisliste auf Link 'Karriere Hamburger Hochbahn AG' gedrückt wird
    Und Die Web-Seite 'Karriere bei der HOCHBAHN' wird angezeigt
    Und Auf der Web-Seite wird eine Taste "Unternehmen" angezeigt
    Und Auf der Web-Seite wird eine Taste "Verantwortung" angezeigt
    Und Auf der Web-Seite wird eine Taste "Projekte" angezeigt
    Und Auf der Web-Seite wird eine Taste "Karriere" angezeigt
    Und Auf der Web-Seite wird eine Taste "Betrieb" angezeigt
    Und Auf der Web-Seite wird eine Taste "Presse" angezeigt
    Und Auf der Web-Seite wird eine Taste "Kontakt" gedrückt
    #Ergebnisse
    Dann wird eine Web-Seite 'KONTAKT' angezeigt
#    Und ...
#    Und...
