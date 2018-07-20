B4J=true
Group=Cuppy
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'This file defines all the framework configurations 
Private Sub Process_Globals
 
	'Libary Infos and Behaviour
	Public LibraryAuthor As String = "Punchline Technologies"
	Public LibraryName As String =  "Cuppy Framework"
	Public LibraryVersion As Double =  0.994
	Public DebugMode As Boolean = True  'are we debugging ... or in release mode
	
	'Paths
	 
	Public AppDir As String = File.DirApp
	'TODO: try adding to assets folder and see if working
	Public RobotoFontsPath As String =  File.Combine(AppDir , "Roboto") 'ignore
	
	
	'License Verification....
	
	
	Private LicenseServer As String ="" 'ignore
	
	
	
	
End Sub

 