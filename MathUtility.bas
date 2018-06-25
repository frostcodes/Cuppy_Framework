Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'This file contain math related functions
Sub Process_Globals
	Private fx As JFX
End Sub


'Inverse hyperbolic cosine
Public Sub acosh (arg As Double) As Double
	
	Return Logarithm(arg  + Sqrt(arg * arg - 1) , 2.7182818284590452354)
	
End Sub

