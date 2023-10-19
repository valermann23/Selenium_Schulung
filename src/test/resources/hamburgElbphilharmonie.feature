# language: de
# encoding: utf-8

@RegTest
@GUI
@eventim
@hamburg
@elbphilharmonie

Funktion: Veranstaltungen
"""
Dieser Test prüft, ob die Suchmaschine 'duckduckgo.de' zur Website von 'eventim' führt
und wie ein Benutzer die Eventim-Webseite nutzt, um nach Veranstaltungen in der Elbphilharmonie Hamburg zu suchen"""

  Szenario: Elbphilharmonie Hamburg
    #Precondition
    Angenommen Eine Suchmaschine 'duckduckgo.de' wird aufgerufen
    #Prozess
    Wenn "eventim" in das Suchfeld eingegeben wird
    Und In der Ergebnisliste auf Link 'www.eventim.de' gedrückt wird
    Und Die Web-Seite 'Eventim' wird angezeigt
    Und Im Cookie-Dialog wird eine Taste 'Akzeptieren' gedrückt
    Und Auf der Web-Seite 'Eventim' wird eine Taste "Alle Events" angezeigt
    Und Auf der Web-Seite 'Eventim' wird eine Taste "Alle Orte" gedrückt
    Und Auf der Standortliste wird eine "Hamburg"-Taste gedrückt
    Und Auf der Veranstaltungsliste für Hamburg wird eine "Elbphilharmonie Hamburg"-Taste gedrückt
    #Ergebnisse
    Dann wird eine Adresse für "Elbphilharmonie Hamburg" angezeigt
    Und Eine Taste "Kalender" wird angezeigt
    Und Eine Taste "Filter" wird angezeigt
    Und Der Test ist beendet
