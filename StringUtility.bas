Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Static code module
Private Sub Process_Globals
	Private fx As JFX
End Sub

 
 Public Sub isNull(val As Object) As Boolean
	Return (val = Null)
End Sub
	
Public Sub isEmpty(str As String) As Boolean
	Return (str.Trim = "")
End Sub

Public Sub trim_once(str As String, character As String) As String
 
	str = trim_left_once(str, character)
	str = trim_right_once(str, character)
		 
	Return str
	
End Sub

Public Sub trim_left_once(str As String, character As String) As  String
	 
	If isEmpty(character) Then
		
		character = " " 'empty space
		 
	End If
	 
	If str.StartsWith(character) Then
		
		str = str.SubString(1)
		
	End If
	
	Return str
	 
End Sub


Public Sub trim_right_once(str As String, character As String) As  String
	 
	If isEmpty(character) Then
		
		character = " " 'empty space
		
	End If
	  
	If str.EndsWith(character) Then
		
		str = str.SubString2(0, str.Length - 1)
	  
	End If
	  
	Return str
	 
End Sub



'Trim Slashes once from a string
'Removes any leading/trailing slashes from a string:
'/this/that/theother/   becomes:  this/that/theother
Public Sub trim_slashes_once(str As String) As String
  
	Return trim_once( str, "/")
	 
End Sub
	
'Removes single And double quotes from a string
Public Sub strip_quotes(str As String) As String
	
	str = str.Replace("'", "")
	str = str.Replace("""","")	
	Return str
	 
End Sub
 	
' Converts single And double quotes To entities
Public Sub quotes_to_entities(str As String) As String
	
	str = str.Replace("\'", "&#39;")
	str = str.Replace("\""","&quot;")
	
	str = str.Replace("'", "&#39;")
	str = str.Replace("""","&quot;")
	 
	
	Return str
	 
End Sub

' Converts double slashes in a string To a single slash,
' except those found in http://
' http://www.some-site.com//index.php
' becomes: http://www.some-site.com/index.php
Public Sub reduce_double_slashes(str As String) As String
	 
	If str.ToLowerCase.StartsWith("http://") Then
		
		str = str.Replace("//" ,"/")
		str =  str.Replace("http:/" ,"http://")  'fix back http://

		Else
			
		str = str.Replace("//" ,"/")
		
	End If
	
	 Return str
	 
End Sub


'Generate random string array
'<code> 
'Dim CardArray() As String = Array As String(1, 2, 3, 4, 5, 6, 7, 8, 9)
'Log(StringUtility.ShuffleArray(CardArray))
'</code>
'FORM: https://www.b4x.com/android/forum/threads/randomly-shuffle-a-string-array.39435/
Public Sub ShuffleArray(StringArray() As String) As String()
	
    Dim ArrayVal As String
    Dim Random As Int
 
    For i = 0 To StringArray.Length - 1
       Random = Rnd(i, StringArray.Length)
       ArrayVal = StringArray(i)
       StringArray(i) = StringArray(Random)
       StringArray(Random) = ArrayVal
    Next
	Return StringArray
End Sub

 'This will generate random string 
'<code>log(StringUtility.GenerateRandomString(16)) 'This will generate 16 random characters
' 'Outputs something like this: Phapk3eN6VmlbGlU
 ' </code>
'FROM: https://www.b4x.com/android/forum/threads/create-random-string.24403/
Public Sub GenerateRandomString(StrLength As Int) As String
	Dim RndString As String
	Dim RndNumber As Int
	Do While RndString.Length < StrLength
		RndNumber = Rnd(48,123) 'Yep, 123, because the last number is "exclusive"
		If (RndNumber >= 48 And RndNumber <= 57) Or (RndNumber >= 65 And RndNumber <= 90) Or (RndNumber >= 97 And RndNumber <= 112) Then
			RndString = RndString & Chr(RndNumber)
		End If
	Loop
	Return RndString
End Sub
 
 'This will generate random string but with symbols always
'<code>log(StringUtility.GenerateRandomString2(16)) 'This will generate 16 random characters
' 'Outputs something like this: !hap$k3eN6V@mlbG
 ' </code>
Public Sub GenerateRandomString2(StrLength As Int) As String
	
	Dim RandomArray() As String = Array As String("!","@","#","$","%")
	Dim result As String
	
	'make it with lots of symbols
	result =  StringArray2String(ShuffleArray(RandomArray)) 
	result = result  & GenerateRandomString( Floor( StrLength/ 2))
	result = result  & StringArray2String(ShuffleArray(RandomArray))
	result = result  & GenerateRandomString( Floor( StrLength/ 2))
	
	'return the length needed
	Return  result.SubString2( result.Length - StrLength , result.Length)
	
End Sub
 
  'This will generate random numeric codes
'<code>log(StringUtility.generatePinCode(4)) 'This will generate 4 random numbers
' 'Outputs something like this: 3760
 ' </code>
 Public Sub generatePinCode(PinLength As Int) As Int
 	
	Dim result As String =""
	Dim RandomArray() As String = Array As String(1,2,3,4,5,6,7,8,9,0)
	
	For i = 0 To PinLength - 1
		
		result = result &  RandomArray( Rnd( 0, Rnd(2, RandomArray.Length -1)) )
		 
	Next
	
	Return  result
	
End Sub
 
 
 'Convert an array of strings to a single string
 '<code>Dim RandomArray() As String = Array As String("A","B","C")
 'log(StringUtility.StringArray2String(RandomArray)) 'would produce ABC
 '</code>
Public Sub StringArray2String(StrArray() As String) As String
 	
	 Dim result As String =""
	For Each str As String In StrArray 'an array
		result = result & str
	Next
	
	Return result
	
End Sub
 
 
 