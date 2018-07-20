B4J=true
Group=Cuppy\Utilities
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'This file contains function for  data types 
'such as checking their types or conversion of types etc..
 
'TODO: create a sub that contain info of module header.. like mod_info or info() for all modules

Sub Process_Globals
	Private fx As JFX
End Sub

'Resolves a value type into Boolean
'Eg 0 is false , 1 is true in Boolean table
Public Sub boolval(mixedVar As Object) As Boolean
	
	If mixedVar = False Then
		Return False
	End If
 
	If mixedVar = 0  Or mixedVar = 0.0 Then
		Return False
	End If
	  
	If mixedVar = "" Or mixedVar = "0" Then
		Return False
	End If
	  
	If mixedVar = Null  Or mixedVar = "undefined" Then
		Return False
	End If
	 
	Return True
	 
End Sub

'Removes the beginning java type 
Private Sub strip_java_type(str As String) As String
	
	str = str.Replace("java.lang.","")
	str = str.Replace("java.util.","")
	
	'Support parsing types like: b4j.example.main$_mytype
	If str.Contains("$") Then
		
		str = CFStringUtility.breakStrAt( str, "$")
		str = CFStringUtility.trim_left_once(str, "$")
		str = CFStringUtility.trim_left_once(str, "_")
		  
	End If
	  
	Return str.ToLowerCase
	
End Sub

'Check if an object is the type of a custom or inbuilt data type
Public Sub isTypeOf(obj As Object , TypeOf As String) As Boolean
	 
	Return strip_java_type(GetType(obj)) = TypeOf.ToLowerCase
	
End Sub

'Checks if an obj is a boolean
Public Sub isBoolean(obj As Object) As Boolean
	
	Return isTypeOf(obj, "boolean")
	
End Sub
 
'Checks if an obj is a string
Public Sub isString(obj As Object) As Boolean
	
	Return isTypeOf(obj, "string")
	
End Sub
 
'Checks if an obj is an integer
Public Sub isInteger(obj As Object) As Boolean
	
	Return isTypeOf(obj, "integer")
	
End Sub

'Checks if an obj is an double
Public Sub isDouble(obj As Object) As Boolean
	
	Return isTypeOf(obj, "double")
	
End Sub

'Checks if an obj is an arraylist
Public Sub isArrayList(obj As Object) As Boolean
	
	Return isTypeOf(obj, "arraylist")
	
End Sub

'Checks if an obj is an arraylist
'ALIAS of isArrayList()
Public Sub isList(obj As Object) As Boolean

	Return isArrayList(obj)
	
End Sub
 
 'Checks if an object returns NULL
 'ALIAS of StringUtility.isNull()
Public Sub isNull(obj As Object) As Boolean
	
	Return CFStringUtility.isNull(obj)
	
End Sub

'Checks if a value is an  Object
Public Sub isObject(obj As Object) As Boolean
	
	Return isTypeOf(obj, "object")
	
End Sub 
 
'Check whether a variable Is a scalar. 
'Note : Values which contain boolean, double, 
'integer, Or string types are scalar.
' Array, object, etc are Not scalar.
Public Sub is_scalar (mixedVar As Object) As Boolean
	
	Return isString(mixedVar) Or IsNumber(mixedVar) Or isBoolean(mixedVar)
	  
End Sub
 