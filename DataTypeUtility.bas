Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'This file contains function for  data types 
'such as checking their types or conversion of types etc..
Sub Process_Globals
	Private fx As JFX
End Sub

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
	 
'	GetType(mixedVar).ToLowerCase
'	If (Array.isArray(mixedVar) && mixedVar.length === 0) Then
'		Return False
'	End If
'	
	
	If mixedVar = Null  Or mixedVar = "undefined" Then
		Return False
	End If
	
	
	Return True
	 
End Sub

'Removes the beginning java type 
Private Sub strip_java_type(str As String) As String
	
	Return str.Replace("java.lang.","").ToLowerCase
	
End Sub

'Check if an object is the type of a custom or inbuilt data type
Private Sub isTypeOf(obj As Object , TypeOf As String) As Boolean
	 
	Return strip_java_type(GetType(obj)) = TypeOf
	
End Sub

'Checks if an obj is a boolean : true or false
Public Sub isBoolean(obj As Object) As Boolean
	
	Return isTypeOf(obj, "boolean")
	
End Sub
 
'Checks if an obj is a boolean : true or false
Public Sub isString(obj As Object) As Boolean
	
	Return isTypeOf(obj, "string")
	
End Sub

'
'
'Waiting For debugger To connect...
'Program started.
'java.lang.integer
'java.util.arraylist
'java.lang.integer
'java.lang.string
'java.lang.double
'java.lang.boolean
'java.lang.boolean
'Check state changed:  1
'Check state changed:  1
'Check state changed:  1
'Checked:  False
'









'
'module.exports = function boolval (mixedVar) {
'  // original by: Will Rowe
'  //   example 1: boolval(True)
'  //   returns 1: True
'  //   example 2: boolval(False)
'  //   returns 2: False
'  //   example 3: boolval(0)
'  //   returns 3: False
'  //   example 4: boolval(0.0)
'  //   returns 4: False
'  //   example 5: boolval('')
'  //   returns 5: False
'  //   example 6: boolval('0')
'  //   returns 6: False
'  //   example 7: boolval([])
'  //   returns 7: False
'  //   example 8: boolval('')
'  //   returns 8: False
'  //   example 9: boolval(Null)
'  //   returns 9: False
'  //   example 10: boolval(undefined)
'  //   returns 10: False
'  //   example 11: boolval('true')
'  //   returns 11: True
'
'  If (mixedVar === False) {
'    Return False
'  }
'
'  If (mixedVar === 0 || mixedVar === 0.0) {
'    Return False
'  }
'
'  If (mixedVar === '' || mixedVar === '0') {
'    Return False
'  }
'
'  If (Array.isArray(mixedVar) && mixedVar.length === 0) {
'    Return False
'  }
'
'  If (mixedVar === Null || mixedVar === undefined) {
'    Return False
'  }
'
'  Return True
'}
