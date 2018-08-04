B4J=true
Group=Cuppy Framework\Cuppy\Cuppy Internals
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'This file defines all the framework configurations 
Private Sub Process_Globals
 
	'Libary Infos and Behaviour
	Public LibraryAuthor As String = "Punchline Technologies"
	Public LibraryName As String =  "Cuppy Framework"
	Public LibraryVersion As Double =  1.02
	Public LibraryCopyright As String =  "Copyright to Oluwaseyi Aderinkomi < Frost Codes >"
	 
	Public DebugMode As Boolean = True  'are we debugging ... or in release mode
	
	'Paths
	Public AppDir As String = File.DirApp
	 
	'License Verification....
	Private LicenseServer As String ="" 'ignore
	 
End Sub 
