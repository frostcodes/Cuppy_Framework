B4J=true
Group=Cuppy Framework\Cuppy\Utilities
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'This contain Utilies for string manipulation 
Private Sub Process_Globals
	Private fx As JFX
End Sub

 'Checks if an object returns NULL
Public Sub IsNull(obj As Object) As Boolean
	
	Return (obj = Null)
	
End Sub
	
'Checks if a string is empty
Public Sub IsEmpty(str As String) As Boolean
	
	Return (str.Trim = "")
	
End Sub

'Checks if a string contains a valid email
'FROM: https://www.b4x.com/android/forum/threads/validate-a-correctly-formatted-email-address.39803/
Public Sub IsEmail(EmailAddress As String) As Boolean
	
	Dim MatchEmail As Matcher = Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$", EmailAddress)
	
	If MatchEmail.Find = True Then
		Return True
	Else
		Return False
	End If
	
End Sub

'Checks if a string is a valid ip-address (ipv4 only)
'FROM: https://www.b4x.com/android/forum/threads/using-regex-to-validate-an-ip-address.15642/
Public Sub IsValidIp(ip As String) As Boolean
	
	Dim m As Matcher
	m = Regex.Matcher("^(\d+)\.(\d+)\.(\d+)\.(\d+)$", ip)
	
	If m.Find = False Then Return False
	
	For i = 1 To 4
		If m.Group(i) > 255 Or m.Group(i) < 0 Then Return False
	Next
	
	Return True
	
End Sub
 
 'Checks if a single Char is a letter only!
 'FROM: https://www.b4x.com/android/forum/threads/isletters-check-if-string-are-letters.83506/
Public Sub IsLetter (c As String) As Boolean
	
	Dim pattern As String = "\p{Alpha}"
	If IsDevTool("B4J") Then pattern = "(?U)" & pattern
	
	Return Regex.IsMatch(pattern, c)
	
End Sub

'Checks if string contains letters only!
'FROM: https://www.b4x.com/android/forum/threads/isletters-check-if-string-are-letters.83506/
Public Sub IsLetters (text As String) As Boolean
	
	Dim pattern As String = "\p{Alpha}+"
	If IsDevTool("B4J") Then pattern = "(?U)" & pattern
	
	Return Regex.IsMatch(pattern, text)
	
End Sub
 
'Checks if string is a url
Public Sub IsUrl (text As String) As Boolean
	
	text = text.Trim
	
	Return text.StartsWith("http://") Or text.StartsWith("https://")
	
End Sub

'Checks if string Contains a Url
Public Sub ContainUrl(text As String) As Boolean
	
	text = text.Trim
	
	Return text.Contains("http://") Or text.Contains("https://")
	
End Sub
 
'Trim a character once at the both sides from a string
Public Sub Trim_Once(str As String, character As String) As String
 
	str = Trim_Left_Once(str, character)
	str = Trim_Right_Once(str, character)
		 
	Return str
	
End Sub

'Trim a character once at the left side from a string
Public Sub Trim_Left_Once(str As String, character As String) As  String
	 
	If IsEmpty(character) Then
		
		character = " " 'empty space
		 
	End If
	 
	If str.StartsWith(character) Then
		
		str = str.SubString(1)
		
	End If
	
	Return str
	 
End Sub

'Trim a character once at the right side from a string
Public Sub Trim_Right_Once(str As String, character As String) As  String
	 
	If IsEmpty(character) Then
		
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
Public Sub Trim_Slashes_Once(str As String) As String
  
	Return Trim_Once( str, "/")
	 
End Sub
	
'Removes single And double quotes from a string
Public Sub Strip_Quotes(str As String) As String
	
	str = str.Replace("'", "")
	str = str.Replace("""","")
	Return str
	 
End Sub
 	
' Converts single And double quotes To entities
Public Sub Quotes_To_Entities(str As String) As String
	
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
Public Sub Reduce_Double_Slashes(str As String) As String
	 
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

'Log(CFStringUtility.shuffleArray(CardArray))
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

'Returns a random list value from a LIST 
Public Sub RandListValue(ListX As List) As Object
	
	Return ListX.Get(Rnd(0, ListX.Size -1))
	
End Sub
  
'This will generate random string 
'Example:
'<code>log(CFStringUtility.generateRandomString(16)) 'This will generate 16 random characters
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
 'Example:
'<code>log(CFStringUtility.generateRandomString2(16)) 'This will generate 16 random characters
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
'Example:
'<code>log(CFStringUtility.generatePinCode(4)) 'This will generate 4 random numbers
' 'Outputs something like this: 3760
 ' </code>
Public Sub GeneratePinCode(PinLength As Int) As Int
 	
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
 'log(CFStringUtility.StringArray2String(RandomArray)) 'would produce ABC
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
 'Log(CFStringUtility.increment_string("test", "_",1)) ' returns: test_1
'Log(CFStringUtility.increment_string("test_24", "_",1))  ' returns: test_25
'</code>
Public Sub Increment_String(str As String, separator As String , first As Int  ) As String
 	
	Dim parsed_str, foundInt As String =""
	Dim IndexOfSeperator  As Int = 0
	 
	IndexOfSeperator = str.LastIndexOf(separator)  'finds where we have separator
	 
	If  IndexOfSeperator <> 0 Then
		'we have a separator
		 
		foundInt = str.SubString((IndexOfSeperator +1) )
		   
		'check if we have a valid INT
		 
		If IsNumber(foundInt) Then
		 
			parsed_str = str.SubString2(0 , IndexOfSeperator) 'Text found before the number to increment
			
			'FIX: added to allow longer numbers like test_24895895
			'Before it use to get converted to Exponential values like test_2.4895896E7
			
			Dim foundLong As Long = (foundInt + 1)
			  
			Return parsed_str & separator & foundLong
			 
		Else
				
			'not valid
			Return str & separator & first
			 	
		End If
		 
	Else
			
		'missing separator..
		Return str & separator & first
			 
	End If
	  
End Sub

'Escapes a string by adding
'a black slash(\) before the value
Public Sub EscapeString(value As String) As String
 
	Return "\" & value
 
End Sub

'fix a delimiter i.e. escape a delimiter
Public Sub FixDelimiter(sValue As String) As String
	
	If sValue = "|" Then sValue = "\|"
	If sValue = "." Then sValue = "\."
	If sValue = "\" Then sValue = "\\"
	If sValue = "^" Then sValue = "\^"
	If sValue = "$" Then sValue = "\$"
	If sValue = "?" Then sValue = "\?"
	If sValue = "*" Then sValue = "\*"
	If sValue = "+" Then sValue = "\+"
	If sValue = "(" Then sValue = "\("
	If sValue = ")" Then sValue = "\)"
	If sValue = "[" Then sValue = "\["
	If sValue = "{" Then sValue = "\{"
	If sValue = ";" Then sValue = "\;"
	Return sValue
	
End Sub
 
'Allow spliting a string by a common delimiter such as , or :
Sub Split(str As String, delimiter As String) As List
	Dim t As List
	t = Regex.Split(FixDelimiter(delimiter), str)
	Return t
End Sub

'ALIAS of : Split() just paramater arrangement that differs
'Allow spliting a string by a common delimiter such as , or :
Public Sub Explode(delimiter As String ,  str As String ) As List
	
	Return Split(str, delimiter)
 
End Sub

'Join list values into a single string
Public Sub Implode(separator As String, StrList As List) As String
	Dim result As String =""
	 
	For Each str As String In StrList 'an array
		result = result & str & separator
	Next
		
	Return Trim_Once(result, separator) ' trim separator just in case
	
End Sub

'ALIAS of : implode() just paramater arrangement that differs
'Join list values into a single string
Public Sub Join(StrList As List,separator As String )  As String
	
	Return Implode(separator, StrList)
	
End Sub

'Convert the first character of each word to uppercase
Public Sub Ucwords(str As String) As String
	
	Dim result As String =""
	
	For Each txt As String In Explode(" ", str.ToLowerCase)
		Dim firstChar As String =""
		firstChar= txt.CharAt(0)
		firstChar = firstChar.ToUpperCase
		
		result = result & firstChar & txt.SubString(1) & " "
		
	Next
	
	Return result
	
End Sub
 
'converts the first character of a string to uppercase.
Public Sub Ucfirst(str As String) As String
 
	str = str.ToLowerCase
 
	Dim firstChar As String =""
	firstChar= str.CharAt(0)
	firstChar = firstChar.ToUpperCase
	
	Return firstChar & str.SubString(1)
	  
End Sub
 
'Make a string's first character lowercase
Public Sub Lcfirst(str As String) As String
 
	Dim firstChar As String =""
	firstChar= str.CharAt(0)
	firstChar = firstChar.ToLowerCase
	
	Return firstChar & str.SubString(1)
	  
End Sub
 
'Takes multiple words separated by spaces Or underscores And camelizes them
'Example:
'<code>
 'Log(CFStringUtility.camelize("my_dog_spot")) ' returns: myDogSpot
'</code>
Public Sub Camelize(str As String)  As String
	Dim firstChar, result As String =""
	
	str= str.Replace(" ", "_") 'make all spaces _
	
	firstChar = str.CharAt(0)
	firstChar = firstChar.ToLowerCase
	 
	For Each txt As String In Explode("_", str)
		result = result & Ucfirst(txt)
	Next
	 
	Return firstChar & result.SubString(1)
	 
End Sub


'Takes multiple words separated by spaces and underscores them
Public Sub Underscore(str As String)  As String
	
	str= str.ToLowerCase
	Return str.Replace(" ",  "_")
	
End Sub

'Takes multiple words separated by the separator and changes them to spaces
Public Sub Humanize(str As String, separator As String)  As String
	 
	str= str.ToLowerCase
	Return Ucwords(str.Replace(separator, " "))
	
End Sub

'Adds http:// in the event that a protocol prefix is missing from a URL.
Public Sub Prep_url(str As String)  As String
	
	str = str.Trim
	 
	If IsEmpty(str) Or str.EqualsIgnoreCase("http://") Then
		
		Return  ""
		
	Else If str.StartsWith("#") Then
			
		Return str
		
	Else
			
		If Not(str.StartsWith("http://")) Then
		  
			Return "http://" & str
		 
		Else
			
			Return str
		 	  	
		End If
			 
	End If
	
End Sub

'Similar To C's sprintf function. 
'It is very simple and handles only the %s, %d, and %f format types.
'%d can have a field width specifying leading spaces Or leading 0's to fill out the field width. 
'For example, %5d will specify a field width of five with leading spaces, 
'%05d will specify a field width of five with leading zeros.
'%f can optionally specify field width, As in %5f. 
'It can also specify field width And precision, As in %5.2f.
'Example:
'<code>
'Dim RandomArray() As String = Array As String("sam", 1,2,3,4,5,6,7,8,9,0)
'Log(CFStringUtility.Sprintf("Hi %s , how are you %d .. %d .. %d", RandomArray))
'Returns:  Hi sam , how are you 1 .. 2 .. 3
'</code>
'
'FROM: https://www.b4x.com/android/forum/threads/sprintf.10860/
Public Sub Sprintf(fmt As String, arg() As Object) As String
	Dim ai, fi, i As Int
	Dim exp, wid As Int
	Dim stmp, ptmp, sres, c, t As String
	Dim bdone As Boolean
  
	ai = 0
	fi = 0
	stmp = ""
	sres = ""
  
	Do While (fi < fmt.Length)
		c = fmt.CharAt(fi)
		fi = fi + 1
   
		If (c = "%") Then
			stmp = ""
			ptmp = ""
			bdone = False
     
			Do While ((fi < fmt.Length) And (bdone = False))
				c = fmt.CharAt(fi)
				fi = fi + 1
      
				If ((IsNumber(c) = True) Or (c = ".")) Then
					ptmp = ptmp & c
					bdone = False
				Else If (c = "s") Then
					stmp = arg(ai)
					ai = ai + 1
					sres = sres & stmp
					bdone = True
				Else If (c = "d") Then
					If (ptmp.Length > 0) Then
						t = " "
						If (ptmp.CharAt(0) = "0") Then
							t = "0"
							ptmp = ptmp.SubString(1)
						End If
					End If
        
					If (ptmp.Length > 0) Then wid = ptmp Else wid = 0
        
					stmp = arg(ai)
        
					Do While (stmp.Length < wid)
						stmp = t & stmp
					Loop
        
					ai = ai + 1
					sres = sres & stmp
					bdone = True
				Else If (c = "f") Then
					If (ptmp.Length > 0) Then
						i = ptmp.IndexOf(".")
						If (i >= 0) Then
							wid = ptmp.SubString2(0, i)
							exp = ptmp.SubString(i+1)
						Else
							wid = ptmp
							exp = 0
						End If
          
						stmp = NumberFormat(arg(ai), wid, exp)
					Else
						stmp = arg(ai)
					End If

					ai = ai + 1
					sres = sres & stmp
					bdone = True
				Else
					ai = ai + 1
				End If
      
			Loop
		Else
			sres = sres & c
		End If
	Loop
  
	Return(sres)
	
End Sub
 
'Word wrap a string after a limit
'NOTE: it is not sensitive to words but characters count
'words like Components might get cut off to - 
' Compo
' nents
Sub Word_Wrap(str As String, limit As Int) As String
	
	str = str.Trim
	 	 
	If str.Length = limit Then
		 
		Return str
	
	Else
		
		Dim DivVal As Int
	
		Dim stringBuild As StringBuilder
		stringBuild.Initialize
	 
		DivVal =  str.Length / limit
		 
		For i = 0 To DivVal
			 
			Dim nextVal As Int = i * limit
			 
			If i = DivVal Then
				
				'Return the remaining text at the end
				stringBuild.Append( str.SubString( nextVal).Trim)
				  
			Else
					
				'get part of the text and wrap
				stringBuild.Append( str.SubString2( nextVal , nextVal + limit).Trim)
				stringBuild.Append( CRLF)
				 	
			End If
			  
		Next
		 
		Return stringBuild.ToString
		
	End If
	 
End Sub

'Converts a string to it ASCII values
' with a seperator such as  {SPACE} 
Public Sub String2AsciiWithSeperator(text As String, seperator As String) As String
	
	Dim result As StringBuilder
	result.Initialize
  
	For i = 0 To text.Length - 1
		
		result.Append(Asc(text.CharAt(i)) & seperator)

	Next
	
	Return result.ToString.Trim

End Sub
	 
'Converts a string to it ASCII values
Public Sub String2Ascii(text As String) As String
	 
	'just an alias but with {SPACE} as seperator
	Return String2AsciiWithSeperator(text, "")

End Sub
	
'Repeat a string
'input = The string To be repeated.
'multiplier = Number of times the input string should be repeated.
'
'NOTE: multiplier has tp be greater than Or equal to 0. 
'If the multiplier is set to 0, the function will return an empty string.
Sub Str_Repeat(input As String, multiplier As Int) As String
  	 
	If multiplier < 1 Then
		
		Return ""
		
	Else
		 
		Dim result As String = ""
		 
		For i = 0 To multiplier - 1
			 
			result = result & input
		
		Next
		  
		Return result
			
	End If
	  
End Sub

'Breaks a string at the position a particular string was found 
'haystack = string to find in
'after = string to search for then break string at 
Public Sub BreakStrAt(haystack As String, after As String) As Object
	
	Dim found As String = ""
	
	found= haystack.IndexOf(after)
	
	If found = -1 Then
		
		Return False
		
	Else
		
		Return haystack.SubString(found)
		 
	End If
	
End Sub

'Searches a string for any of the specified characters.
'Note: This function is Case-sensitive.
'This function returns the rest of the 
'string from where it found the first occurrence 
'of a specified character, otherwise it returns False.
Public Sub Strpbrk(haystack As String, charList As String) As Object
 
	For i = 0 To haystack.Length - 1
		 
		If charList.IndexOf(haystack.CharAt(i)) >= 0 Then
		 	 
			Return haystack.SubString(i)
			
		End If
		  
	Next
	 
	Return False
	  
End Sub

'Converts a string to a List of characters..
'Eg ABCD  = [A, B, C, D]
Public Sub StrToStrList(str As String) As List
	
	Dim result As List
	result.Initialize
	 
	For i = 0 To str.Length - 1
		 
		result.Add(str.CharAt(i))
		 
	Next
	 
	Return result
	
End Sub

'Splits a string into a List
Public Sub Str_Split (str As String, splitLength As Int) As List
	 
	Dim chunks As List
	chunks.Initialize
	 
	If (IsEmpty(str) Or splitLength < 1)  Then
		
		Return chunks 'empty list
		
	Else If  splitLength = str.Length Then
			
		chunks.Add(str)
		Return chunks
			
	End If
	  
	Dim DivVal As Int  =  str.Length / splitLength
		 
	For i = 0 To DivVal
			 
		Dim nextVal As Int = i * splitLength
			 
		If i = DivVal Then
				
			'Return the remaining text at the end
			chunks.add( str.SubString( nextVal))
				  
		Else
					
			'get the remainin part of the text
			chunks.add( str.SubString2( nextVal , nextVal + splitLength))
				 	
		End If
			  
	Next
		  
	Return chunks
	
End Sub
  
  #Region Alias Improved functions of { String }.IndexOf()
  
'Finds the position of the first occurrence
'of a string inside another string.
'
'Note: It is Case-sensitive.
'It also returns -1 if it could not find text 
'
'Alias of inbuilt function { String }.IndexOf()
Public Sub Strpos(haystack As String , find As String) As Int
  	
	Return haystack.IndexOf(find)
	
End Sub
   
'Finds the position of the first occurrence
'of a string inside another string.
'
'Note: It is Case-sensitive. 
'It also returns -1 if it could not find text 
'
'Alias of inbuilt function  { String }.IndexOf2()
Public Sub Strpos2(haystack As String , find As String, start As Int) As Int
	
	Return haystack.IndexOf2(find, start)
	
End Sub
 
'Finds the position of the first occurrence
'of a string inside another string.
'
'Note: It is Case-Insensitive.
'It also returns -1 if it could not find text 
'
'Alias of inbuilt function { String }.IndexOf()
Public Sub Stripos(haystack As String , find As String) As Int
  	
	haystack = haystack.ToLowerCase
	find = find.ToLowerCase
	
	Return haystack.IndexOf(find)
	
End Sub
   
'Finds the position of the first occurrence
'of a string inside another string.
'
'Note: It is Case-Insensitive. 
'It also returns -1 if it could not find text 
'
'Alias of inbuilt function  { String }.IndexOf2()
Public Sub Stripos2(haystack As String , find As String, start As Int) As Int
  	
	haystack = haystack.ToLowerCase
	find = find.ToLowerCase
	
	Return haystack.IndexOf2(find, start)
	
End Sub
 
  #End Region

#Region Alias Improved functions of { String }.LastIndexOf()
  
'Finds the position of the last occurrence 
'of a string inside another string.
'
'Note: It is Case-sensitive.
'It also returns -1 if it could not find text 
'
'Alias of inbuilt function { String }.LastIndexOf()
Public Sub Strrpos(haystack As String , find As String) As Int
  	
	Return haystack.LastIndexOf(find)
	
End Sub
   
'Finds the position of the last occurrence 
'of a string inside another string.
'
'Note: It is Case-sensitive. 
'It also returns -1 if it could not find text 
'
'Alias of inbuilt function  { String }.LastIndexOf()
Public Sub Strrpos2(haystack As String , find As String, start As Int) As Int
	
	Return haystack.LastIndexOf2(find, start)
	
End Sub
 
'Finds the position of the last occurrence 
'of a string inside another string.
'
'Note: It is Case-Insensitive.
'It also returns -1 if it could not find text 
'
'Alias of inbuilt function { String }.LastIndexOf()
Public Sub Strripos(haystack As String , find As String) As Int
  	
	haystack = haystack.ToLowerCase
	find = find.ToLowerCase
	
	Return haystack.LastIndexOf(find)
	
End Sub
   
'Finds the position of the last occurrence 
'of a string inside another string.
'
'Note: It is Case-Insensitive. 
'It also returns -1 if it could not find text 
'
'Alias of inbuilt function  { String }.LastIndexOf()
Public Sub Strripos2 (haystack As String , find As String, start As Int) As Int
  	
	haystack = haystack.ToLowerCase
	find = find.ToLowerCase
	
	Return haystack.LastIndexOf2(find, start)
	
End Sub
 
  #End Region
  
'Use this To prepend 0 to a value lower than 10
'Eg 9 would ouput 09, 13 would ouput 13
Public Sub Prepend_Zero(num As Int) As String

	If num < 10 And num > 0 Then

		Return "0" & num

	Else
		
		Return num
	
	End If

End Sub
   
   #Region  Query String Parsers
   
'Helps to parse a Query string into a MAP
'NOTE: this does not work with urls directly
'Consider using parseQueryStringUrl() instead for a URL
'
'<code> Example: Parse { key1=value1&key2=value2 }
'Log(CFStringUtility.parseQueryString	("key1=value1&key2=value2" ))
' 'This would output a map where key1 & key2 would be the keys
' 'And the values would be value1 & value2 respectively
'</code>
Public Sub ParseQueryString(QueryString As String) As Map

	Dim Data As Map 'total data
	Data.Initialize
			
	Try
 
		'parse & first
		Dim temp_list As List = Split(QueryString, "&")

		For i = 0 To temp_list.Size - 1
 
			Dim QueryList As List = Split(temp_list.Get(i) , "=")
 
			If Not(Data.ContainsKey(QueryList.Get(0))) Then
  
				Data.Put(QueryList.Get(0), QueryList.Get(1))
				 
			End If
 
		Next
 
	Catch

		LogError("The parser for < parseQueryString() > got broken. Please check input data")

	End Try
 
	Return Data
 
End Sub

'Helps to parse a URL with Query string into a MAP
'
'<code> Example: Parse { key1=value1&key2=value2 }
'Log(CFStringUtility.parseQueryStringUrl("http://urlx.com?key1=value1&key2=value2"))
' 'This would output a map where key1 & key2 would be the keys
' 'And the values would be value1 & value2 respectively
'</code>

Public Sub ParseQueryStringUrl(url As String) As Map
	
	url= BreakStrAt(url, "?") ' Split URL from Query String
	url =  Trim_Left_Once(url, "?")
	
	Return ParseQueryString(url)
	 
End Sub
 
 #End Region
 
 'Helps to truncate text that is 
 'longer than a specificied length
Public Sub Truncate(txt As String, length As Int) As String
	
	' If argument is too big, return the original string.
	' ... Otherwise take a substring from the string's start index.
	
	If length > txt.Length Then
		
		Return txt
		 
	Else
		
		Return txt.Substring2(0, length)
		
	End If
	
End Sub

'Returns a day of a date with the english suffix
'Example 2nd or 4th 
Public Sub DateOrdinal(date As Int) As String
  	
	Dim sufixes() As String = Array As String("th", "st", "nd", "rd", "th", "th","th", "th", "th", "th")
	Dim iVal As String = date
	Dim val As Int =  (date Mod 100)
	If val = 11 Or val =  12 Or val = 13 Then
       
		Return iVal & "th"
			
	Else

		Return iVal & sufixes(date Mod 10)
			
	End If

End Sub

'Returns the current date in a nice format
'Example:  October 5th, 2018
Public Sub NicelyFormattedDate As String
	
	DateTime.DateFormat = "MMMM '" & DateOrdinal(DateTime.GetDayOfMonth(DateTime.Now)) & "', yyyy"
	Return DateTime.Date(DateTime.Now)

End Sub

'Converts Newlines to Html <br> tag
Public Sub Nl2Br(text As String) As String
	
	Return text.Replace(CRLF, "<br>")
	
End Sub

'Makes a word Plural if need be 
'If the count is more than one then it addes the suffix to the text
'Eg if the count of available examples in a list is 1
'it returns 'Example' if not you can set to return 'Examples'
'Example:
'<code>
'Dim examples As Map = CreateMap("January": 1, "February": 2)
'	Log("We have " & (examples.Size) & " " &  CFStringUtility.Plurify("example", examples.Size, "s"))
'	'returns: We have 2 examples
'
'	Dim examples2 As Map = CreateMap("January": 1)
'	Log("We have " & (examples2.Size) & " " & CFStringUtility.Plurify("example", examples2.Size, "s"))
'	'returns: We have 1 example
'</code>
Public Sub Plurify(text As String, count As Int, suffix As String) As String
	
	If count < 2 Then
		
		Return text
		
	Else
		
		Return text & suffix
			
	End If
	
End Sub

'
' Perform the ROT13 transform on a string
'
'The ROT13 encoding shifts every
'letter 13 places in the alphabet. 
'Numeric And non-alphabetical characters 
'remains untouched.
'
'Tip: Encoding And decoding are done by 
'the same function.
'If you pass an encoded string As argument,
'the original string will be returned.
'
'Example:
'<code>
'Log(CFStringUtility.Str_Rot13("Hello World")) 'Returns: Uryyb Jbeyq
'Log(CFStringUtility.Str_Rot13("Uryyb Jbeyq")) 'Returns: Hello World
'</code>
Public Sub Str_Rot13(str As String) As String

	Dim FromStr, ToStr As String
	
	FromStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
	ToStr = "nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZABCDEFGHIJKLM"
	  
	Return Strtr(str, FromStr, ToStr)
	
End Sub

'The Strtr() function translates 
'certain characters in a string.
'
'Note: If the from And To parameters 
'are different in length, 
'both will be formatted To the length
'of the shortest.
'
'Example:
'<code>
'Log(CFStringUtility.Strtr("Hilla Warld","ia","eo")) 'Returns: Hello World
'Log(CFStringUtility.Strtr("Hello World","eo","ia")) 'Returns: Hilla Warld
'</code>
Public Sub Strtr(Str As String, FromStringList As String, ToStringList As String) As String
	
	Dim result As StringBuilder
	result.Initialize
	
	Dim count As Int = Str.Length -1

	For i = 0 To count
		
		Dim CurrentChar As Char = Str.CharAt(i)
		
		If FromStringList.Contains(CurrentChar) Then
		
			result.Append(ToStringList.CharAt(FromStringList.IndexOf(CurrentChar))) 'reverse lookup
		
		Else
			
			result.Append(CurrentChar)
		
		End If
		
	Next
	
	Return result.ToString
	
End Sub
