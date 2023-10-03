# language: de
# encoding: utf-8

@RegTest
@GUI
@ueberMsg

Funktion: msg
"""
Dieser Test prüft, ob die Suchmaschine 'duckduckgo.de' zur Website von 'MSG Group' führt
und die Webseite 'Über MSG Group' ist durch die entsprechende Taste erreichbar""""

  Szenario: Seite Über MSG
    #Precondition
    Angenommen Eine Suchmaschine 'duckduckgo.de' wird aufgerufen
    #Prozess
    Wenn "msg" in das Suchfeld eingegeben wird
    Und In der Ergebnisliste auf Link 'www.msg.group' gedrückt wird
    Und Die Web-Seite 'MSG Group' wird angezeigt.
    Und Auf die Taste 'Über MSG Group' gedrückt wird
    #Ergebnisse
    Dann Eine Seite 'Über MSG Group' wird angezeigt
    Und Der Test ist beendet
