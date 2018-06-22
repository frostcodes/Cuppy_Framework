Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'This file contain Utility sub/functions for string manipulation 

Private Sub Process_Globals
	
	Private fx As JFX
	  
End Sub
  
  
  
  
  
  
  
'
''Generate random string array
''Example:
''<code> 
''Dim CardArray() As String = Array As String(1, 2, 3, 4, 5, 6, 7, 8, 9)
''Log(StringUtility.shuffleArray(CardArray))
''</code>
''FORM: https://www.b4x.com/android/forum/threads/randomly-shuffle-a-string-array.39435/
'Public Sub shuffleArray(StringArray() As String) As String()
'	
'	Dim ArrayVal As String
'	Dim Random As Int
' 
'	For i = 0 To StringArray.Length - 1
'		Random = Rnd(i, StringArray.Length)
'		ArrayVal = StringArray(i)
'		StringArray(i) = StringArray(Random)
'		StringArray(Random) = ArrayVal
'	Next
'	Return StringArray
'End Sub
' 