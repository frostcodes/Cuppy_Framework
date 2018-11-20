B4J=true
Group=Cuppy Framework\Cuppy\Utilities
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'This file contains function for  data types 
'such as checking their types or conversion of types
Private Sub Process_Globals
	Private fx As JFX
End Sub

'Resolves a value type into Boolean
'Eg 0 is false , 1 is true in Boolean table
Public Sub BoolVal(mixedVar As Object) As Boolean
	
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
Private Sub StripJavaType(str As String) As String
	
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
Public Sub IsTypeOf(obj As Object , TypeOf As String) As Boolean
	 
	Return StripJavaType(GetType(obj)) = TypeOf.ToLowerCase
	
End Sub
 
 'Checks if an object returns NULL
 'ALIAS of CFStringUtility.isNull()
Public Sub IsNull(obj As Object) As Boolean
	
	Return CFStringUtility.isNull(obj)
	
End Sub

'Checks if a value is an  Object
Public Sub IsObject(obj As Object) As Boolean
	
	Return IsTypeOf(obj, "object")
	
End Sub 
 
'Check whether a variable Is a scalar. 
'Note : Values which contain boolean, double, 
'integer, Or string types are scalar.
'Array, object, etc are Not scalar.
Public Sub IsScalar (mixedVar As Object) As Boolean
	
	Return mixedVar Is String Or IsNumber(mixedVar) Or mixedVar Is Boolean
	  
End Sub
 