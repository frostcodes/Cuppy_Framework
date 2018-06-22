﻿Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Static code module
Private Sub Process_Globals
	Private fx As JFX
End Sub

 'checks if an object returns NULL
 Public Sub isNull(val As Object) As Boolean
	Return (val = Null)
End Sub
	
'checks if a string is empty
Public Sub isEmpty(str As String) As Boolean
	Return (str.Trim = "")
End Sub

'checks if a string contains a valid email
Public Sub IsEmail(EmailAddress As String) As Boolean
	Dim MatchEmail As Matcher = Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$", EmailAddress)
	If MatchEmail.Find = True Then
		Log(MatchEmail.Match)
		Return True
	Else
		Log("Oops, please double check your email address")
		Return False
	End If
End Sub


'Trim a character once at the both sides from a string
Public Sub trim_once(str As String, character As String) As String
 
	str = trim_left_once(str, character)
	str = trim_right_once(str, character)
		 
	Return str
	
End Sub

'Trim a character once at the left side from a string
Public Sub trim_left_once(str As String, character As String) As  String
	 
	If isEmpty(character) Then
		
		character = " " 'empty space
		 
	End If
	 
	If str.StartsWith(character) Then
		
		str = str.SubString(1)
		
	End If
	
	Return str
	 
End Sub

'Trim a character once at the right side from a string
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
'Example:
'<code> 
'Dim CardArray() As String = Array As String(1, 2, 3, 4, 5, 6, 7, 8, 9)
'Log(StringUtility.shuffleArray(CardArray))
'</code>
'FORM: https://www.b4x.com/android/forum/threads/randomly-shuffle-a-string-array.39435/
Public Sub shuffleArray(StringArray() As String) As String()
	
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
 'Example:
'<code>log(StringUtility.generateRandomString(16)) 'This will generate 16 random characters
' 'Outputs something like this: Phapk3eN6VmlbGlU
 ' </code>
'FROM: https://www.b4x.com/android/forum/threads/create-random-string.24403/
Public Sub generateRandomString(StrLength As Int) As String
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
 'Example:
'<code>log(StringUtility.generateRandomString2(16)) 'This will generate 16 random characters
' 'Outputs something like this: !hap$k3eN6V@mlbG
 ' </code>
Public Sub generateRandomString2(StrLength As Int) As String
	
	Dim RandomArray() As String = Array As String("!","@","#","$","%")
	Dim result As String
	
	'make it with lots of symbols
	result =  StringArray2String(shuffleArray(RandomArray)) 
	result = result  & generateRandomString( Floor( StrLength/ 2))
	result = result  & StringArray2String(shuffleArray(RandomArray))
	result = result  & generateRandomString( Floor( StrLength/ 2))
	
	'return the length needed
	Return  result.SubString2( result.Length - StrLength , result.Length)
	
End Sub
 
'This will generate random numeric codes
'Example:
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
 'Example:
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
 
 
 
  
'Add's _1 to a string or increment the ending number to allow _2, _3, etc
'str = string to increment on
'separator = What should the duplicate number be appended with
'first = Which number should be used For the first dupe increment
'Example:
'<code>
 'Log(StringUtility.increment_string("test", "_",1)) ' returns: test_1
'Log(StringUtility.increment_string("test_24", "_",1))  ' returns: test_25
'</code>
'NOTE: large values like test_24895895 returns in Exponential values like test_2.4895896E7
Public Sub increment_string(str As String, separator As String , first As Int  ) As String
 	
	Dim parsed_str, foundInt As String =""
	Dim IndexOfSeperator  As Int = 0
	 
	IndexOfSeperator = str.LastIndexOf(separator)  'finds where we have separator
	 
	If  IndexOfSeperator <> 0 Then
		'we have a separator
		 
		 foundInt = str.SubString((IndexOfSeperator +1) ) 
		   
		'check if we have a valid INT
		 
		If IsNumber(foundInt) Then
		 
			parsed_str = str.SubString2(0 , IndexOfSeperator) 'Text found before the number to increment
			 
			Return parsed_str & separator & (foundInt + 1)
			 
		Else
				
			'not valid	
			Return str & separator & first
			 	
		End If
		 
	Else
			
		'missing separator..
		Return str & separator & first
			 
	End If
	  
End Sub

'Allow spliting a string by a common delimiter such as , or :
Public Sub explode(delimiter As String ,  str As String ) As List
	
	Dim result As List
	result.Initialize
	
	Dim delimiterIndex As Int
	delimiterIndex=str.IndexOf(delimiter)
   
	Do While delimiterIndex >-1
		Dim LeftSide As String : LeftSide= str.SubString2(0,delimiterIndex)
		Dim RightSide As String :RightSide= str.SubString(delimiterIndex+1)
		result.Add(LeftSide)
		str=RightSide
		delimiterIndex=str.IndexOf(delimiter)
	Loop
	
	result.Add(str)
	
	Return result
 
End Sub

'Join list values into a single string
Public Sub implode(separator As String, StrList As List) As String
	Dim result As String =""
	 
	For Each str As String In StrList 'an array
		result = result & str & separator
		Next
		
	Return trim_once(result, separator) ' trim separator just in case
	
End Sub


'Convert the first character of each word to uppercase
Public Sub ucwords(str As String) As String
	
	Dim result As String =""
	
	For Each txt As String In explode(" ", str)
		Dim firstChar As String =""
		firstChar= txt.CharAt(0)
		firstChar = firstChar.ToUpperCase
		
		result = result & firstChar & txt.SubString(1) & " "
	Next
	
	Return result
	
End Sub


'converts the first character of a string to uppercase.
Public Sub ucfirst(str As String) As String
 
	Dim firstChar As String =""
	firstChar= str.CharAt(0)
	firstChar = firstChar.ToUpperCase
	
	Return firstChar & str.SubString(1)
	 
	
End Sub

'Takes multiple words separated by spaces Or underscores And camelizes them
'Example:
'<code>
 'Log(StringUtility.camelize("my_dog_spot")) ' returns: myDogSpot
'</code>
Public Sub camelize(str As String)  As String
	Dim firstChar, result As String =""
	
	str= str.Replace(" ", "_") 'make all spaces _
	
	firstChar = str.CharAt(0)
	firstChar = firstChar.ToLowerCase
	 
	For Each txt As String In explode("_", str)
		result = result & ucfirst(txt)
	Next
	 
	Return firstChar & result.SubString(1)
	 
End Sub


'Takes multiple words separated by spaces and underscores them
Public Sub underscore(str As String)  As String
	
	str= str.ToLowerCase
	Return str.Replace(" ",  "_") 
	
End Sub


'Takes multiple words separated by the separator and changes them to spaces
Public Sub humanize(str As String, separator As String)  As String
	 
	str= str.ToLowerCase
	Return ucwords(str.Replace(separator, " "))
	
End Sub

