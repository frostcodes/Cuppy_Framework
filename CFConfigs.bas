B4J=true
Group=Cuppy Framework\Cuppy\Cuppy Internals
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'This file defines all the framework internal configurations 
Private Sub Process_Globals
 
	'Libary Infos and Behaviour
	Public LibraryAuthor As String = "Punchline Technologies"
	Public LibraryName As String =  "Cuppy Framework"
	Public LibraryVersion As Double =  1.03
	Public LibraryCopyright As String =  "Copyright to Oluwaseyi Aderinkomi < Frost Codes >"
	 
	Private DonationLink as String = ""
End Sub


#If Full

'Is Cuppy Framework Free Version?
Public Sub IsFreeVersion As Boolean
	 	
	Return False
		
End Sub

'Is Cuppy Framework Full Version?	 	 
Public Sub IsFullVersion As Boolean
	 	
	Return True
		
End Sub

#Else If Free

'Is Cuppy Framework Free Version?
Public Sub IsFreeVersion As Boolean
	 	
	Return True
	 
End Sub
	 
'Is Cuppy Framework Full Version?	 	 
Public Sub IsFullVersion As Boolean
	 	
	Return False
		
End Sub

	#End If