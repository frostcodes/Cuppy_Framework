﻿Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'This contains codes that are for the app object
Sub Process_Globals
	Private fx As JFX
End Sub



'Return the current PackageName
'FROM: https://www.b4x.com/android/forum/threads/configure-tooltip-timings.76298/
Public Sub GetPackageName(Module As Object) As String
	Dim ModJo As JavaObject = Module
	Dim MoStr As String = ModJo.RunMethod("toString",Null)
	Return MoStr.SubString2(MoStr.LastIndexOf(" ")+1,MoStr.LastIndexOf("."))
End Sub
