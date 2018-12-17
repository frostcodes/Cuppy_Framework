B4J=true
Group=Cuppy Framework\Cuppy\Utilities
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'This contains codes that are for the app object
Sub Process_Globals
	Private fx As JFX
End Sub
 
'Return the current Package Name
'FROM: https://www.b4x.com/android/forum/threads/configure-tooltip-timings.76298/
Public Sub GetPackageName(Module As Object) As String
	
	Dim ModJo As JavaObject = Module
	Dim MoStr As String = ModJo.RunMethod("toString",Null)
	Return MoStr.SubString2(MoStr.LastIndexOf(" ")+1,MoStr.LastIndexOf("."))
	
End Sub

'Detects the current Operating System your app is running on
'Returns: windows, mac or linux
'FROM: https://www.b4x.com/android/forum/threads/windows-mac-or-linux.99825/#content
Public Sub CurrentOS As String
	
	Dim os As String = GetSystemProperty("os.name", "").ToLowerCase
	
	If os.Contains("win") Then
		Return "windows"
	Else If os.Contains("mac") Then
		Return "mac"
	Else
		Return "linux"
	End If
	
End Sub