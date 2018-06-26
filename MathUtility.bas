Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'This file contain math related functions
Sub Process_Globals
	Private fx As JFX
End Sub

'checks if a value is NaN
Public Sub IsNan(d As Double) As Boolean
	
	Return d <> d
	
End Sub

'Inverse hyperbolic cosine
Public Sub acosh (arg As Double) As Double
	
	Return Logarithm(arg  + Sqrt(arg * arg - 1) , 2.7182818284590452354)
	 
End Sub

'Inverse hyperbolic sine
Public Sub asinh (arg As Double) As Double
	
	Return Logarithm(arg  + Sqrt(arg * arg + 1) , 2.7182818284590452354)
	 
End Sub

'Inverse hyperbolic tangent
Public Sub atanh (arg As Double) As Double
	 
	Return 0.5 * Logarithm((1 + arg) / (1 - arg) , 2.7182818284590452354 )
	 
End Sub
 
'Convert integer in any base ( 2 to 10 ) to decimal integer.
'FROM: https://www.b4x.com/android/forum/threads/number-base-conversions.39360/
Public Sub ConvertToDecimal( n As Int, base As Int) As Int
	
	Dim result As Int = 0
	Dim multiplier As Int = 1
	
	Do While n > 0
		
		result = result + (n Mod 10) * multiplier
		multiplier = multiplier * base
		n = n / 10
	
	Loop
	
	Return result
	
End Sub

'Convert decimal integer to any base (2 to 10)
'FROM: https://www.b4x.com/android/forum/threads/number-base-conversions.39360/
Public Sub ConvertfromDecimal(n As Int, base As Int) As Int
	
	Dim result As Int = 0
	Dim multiplier As Int = 1
	
	Do While n > 0
	
		result = result + (n Mod base) * multiplier
		multiplier = multiplier * 10
		n = n / base
	
	Loop
	
	Return result
	
End Sub

'Convert decimal integer to any base up to 20, returns string
'FROM: https://www.b4x.com/android/forum/threads/number-base-conversions.39360/
Public Sub ConvertfromDecimal2(n As Int, base As Int) As String
	
	Dim chars As  String ="0123456789ABCDEFGHIJ"
	Dim result As String = ""
	
	Do While n > 0
		
		result = chars.charAt(n Mod base) & result
		n = n / base
	
	Loop
	
	Return result
	
End Sub

'Convert any base up to 20 to decimal integer
'FROM: https://www.b4x.com/android/forum/threads/number-base-conversions.39360/
Public Sub ConverttoDecimal2( n As String, base As Int) As Int
	
	n = n.ToUpperCase
	Dim result As Int = 0
	Dim st As String
	
	Dim chars As  String ="0123456789ABCDEFGHIJ"
	Dim k As Int = n.length - 1
	Dim multiplier As Int = 1
	
	For i =  k To 0 Step -1
		
		st = n.CharAt(i)
		result = chars.IndexOf(st) * multiplier  + result
		multiplier = multiplier * base
	
	Next
	
	Return result
	
End Sub

'Convert from one base to another, both must be less or equal to 10
'FROM: https://www.b4x.com/android/forum/threads/number-base-conversions.39360/
Public Sub ConvertFromTo(n As Int, frombase As Int, tobase As Int) As Int
	
	Dim t As Int = ConvertToDecimal(n,frombase)
	Return ConvertfromDecimal(t,tobase)
	
End Sub