B4J=true
Group=Cuppy\Utilities
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'This file contain math related functions
Sub Process_Globals
	Private fx As JFX
	'or 2.7182818284590452354 for Exponential equavalent 
	Public Exponential_Equivalent As Double = 2.718281828459045 
	
	Public NEGATIVE_INFINITY As String = "-Infinity"
	Public POSITIVE_INFINITY As String = "Infinity"
	
	Public MAX_SAFE_INTEGER As String  = "9007199254740991"
	Public MIN_SAFE_INTEGER As String = "-9007199254740991"
	
	Public MIN_VALUE As String  = "5e-324"
	Public MAX_VALUE As String = "1.7976931348623157e+308"
	
	
End Sub

'checks if a value is NaN
Public Sub IsNan(d As Double) As Boolean
	
	Return d <> d
	
End Sub

'Inverse hyperbolic cosine
Public Sub acosh (arg As Double) As Double
	
	Return Logarithm(arg  + Sqrt(arg * arg - 1) , Exponential_Equivalent)
	 
End Sub

'Inverse hyperbolic sine
Public Sub asinh (arg As Double) As Double
	
	Return Logarithm(arg  + Sqrt(arg * arg + 1) , Exponential_Equivalent)
	 
End Sub

'Inverse hyperbolic tangent
Public Sub atanh (arg As Double) As Double
	 
	Return 0.5 * Logarithm((1 + arg) / (1 - arg) , Exponential_Equivalent )
	 
End Sub

'Hyperbolic cosine of a number 
Public Sub cosh (arg As Double) As Double
	 
	Return (exp(arg) + exp(-arg)) / 2
	 
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

'Calculates the exponent of e
'Returns e raised to the power of arg
Public Sub exp(arg As Double) As Double
	
	Return Power(Exponential_Equivalent, arg)
	
End Sub
'Hyperbolic tangent of a number,
'which is equal to sinh(x)/cosh(x).
Public Sub tanh(number As Double) As Double
	
	Return 1 - 2 / (exp(2 * number) + 1)
	
End Sub

'Hyperbolic sine of a number, 
'which is equal to (exp(number) - exp(-number))/2).
Public Sub sinh(number As Double) As Double
	 
	Return (exp(number) - exp(-number)) / 2
	
End Sub
 
 'Check whether a value is infinite or not
 Public Sub is_infinite(val As String) As Boolean
 	
	Return val = POSITIVE_INFINITY Or val = NEGATIVE_INFINITY
		 
End Sub

'Check whether a value is finite or not
Public Sub is_finite(val As String) As Boolean
 	
	Return Not(is_infinite(val))
	
End Sub
	
'Converts the number in degrees to the radian equivalent
Public Sub deg2rad(angle As Double) As Double
	
	Return angle * 0.017453292519943295
 
End Sub

'Converts a radian value to a degree value.
Public Sub rad2deg(number As Double) As Double
	
	Return number * 57.29577951308232
 
End Sub

'Calculate the length of the hypotenuse 
'of a right-angle triangle
Public Sub hypot(x As Double, y As Double) As Double
	
	x = Abs(x)
	   y = Abs(y)
	'
	Dim t As Double = Min(x, y)
	x = Max(x, y)
	t = t / x
	
	Return x * Sqrt(1 + t * t)  
 
End Sub



'
'
'module.exports = function hypot (x, y) {
'  //  discuss at: http://locutus.io/php/hypot/
'  // original by: Onno Marsman (https://twitter.com/onnomarsman)
'  // imprived by: Robert Eisele (http://www.xarg.org/)
'  //   example 1: hypot(3, 4)
'  //   returns 1: 5
'  //   example 2: hypot([], 'a')
'  //   returns 2: Null
'
'  x = Math.abs(x)
'  y = Math.abs(y)
'
'  var t = Math.min(x, y)
'  x = Math.max(x, y)
'  t = t / x
'
'  Return x * Math.sqrt(1 + t * t) || Null
'}


'
'module.exports = function rad2deg (angle) {
'  //  discuss at: http://locutus.io/php/rad2deg/
'  // original by: Enrique Gonzalez
'  // improved by: Brett Zamir (http://brett-zamir.me)
'  //   example 1: rad2deg(3.141592653589793)
'  //   returns 1: 180
'
'  Return angle * 57.29577951308232 // angle / Math.PI * 180
'}






	 
'
''TODO:log1p
'
''The log1p() function returns log(1+number),
''computed in a way that is accurate even
''when the value of number is close to zero.
'Public Sub log1p(number As Double) As Double
' 
'End Sub
'
'' 