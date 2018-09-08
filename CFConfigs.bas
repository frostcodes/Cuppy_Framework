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
	  
End Sub

Public Sub DonationLink As String
	
	Return "http://punchlinetech.com/product/cuppy-framework-free/#FullCuppyFramework"
	 
End Sub

'Generate an image url for Full Cuppy Required image asset
Public Sub FullCuppyRequiredImageUrl As String
	 
	Return File.GetUri(File.DirAssets, "full-cuppy-framework-required.png")

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