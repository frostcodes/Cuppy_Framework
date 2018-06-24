﻿Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'This file contain Utility sub/functions for File & Directory manipulation 

Private Sub Process_Globals
	
	Private fx As JFX
	  
End Sub
  
  #Region TODO:refactor  the below... same function , second is just recursive
  
'Get the total size of files in a folder
'NOTE: sub folders are not included...
'To get with sub folders use : SizeOfFilesInFolder(dir As String)
'
'NOTE: This would run slowly if folder is computer root folder.
'Also on Linux avoid folder with symbolic links
'
'FROM : https://www.b4x.com/android/forum/threads/size-of-a-directory-in-bytes-kb-or-mb-in-b4j.78534/
Public Sub SizeOfCurrentFilesInFolder(dir As String) As Long
	
	Dim total As Long
	
	For Each filename As String In File.ListFiles(dir)
		
		If File.IsDirectory(dir, filename) = False Then
			
			total = total + File.Size(dir , filename)
			
		End If
		
	Next
	
	Return total
	
End Sub

'Get the total size of files in a folder including Sub folders.
'
'NOTE: This would run slowly if folder is computer root folder.
'Also on Linux avoid folder with symbolic links
'
'FROM : https://www.b4x.com/android/forum/threads/size-of-a-directory-in-bytes-kb-or-mb-in-b4j.78534/
Public Sub SizeOfFilesInFolder(dir As String) As Long
	
	Dim total As Long
	
	For Each filename As String In File.ListFiles(dir)
		
		If File.IsDirectory(dir, filename) = False Then
			
			total = total + File.Size(dir, filename)
		
		Else
			
			total = total + SizeOfFilesInFolder(dir & "\" & filename)
			
		End If
		
	Next
	
	Return total
	
End Sub

#End Region
  
'Write an array of bytes to a file
'FROM: https://www.b4x.com/android/forum/threads/b4x-bytes-to-file.70111/#content
Public Sub BytesToFile (Dir As String, FileName As String, Data() As Byte)
	
	Dim out As OutputStream = File.OpenOutput(Dir, FileName, False)
	out.WriteBytes(Data, 0, Data.Length)
	out.Close
	
End Sub

'Read a file into an array of bytes
'FROM: https://www.b4x.com/android/forum/threads/b4x-bytes-to-file.70111/#content
Public Sub FileToBytes (Dir As String, FileName As String) As Byte()
	
	Return Bit.InputStreamToBytes(File.OpenInput(Dir, FileName))
	
End Sub
 
'Converts Bytes to Image
Public Sub BytesToImage(bytes() As Byte) As Image
	
	Dim in As InputStream
	in.InitializeFromBytesArray(bytes,0,bytes.Length)
	
	Dim bmp As Image
	bmp.Initialize2(in)
	
	Return bmp
 
End Sub
 
'Format file's size in Human readable format
Public Sub FormatFileSize(Bytes As Float) As String
   
	Private Unit() As String = Array As String(" Byte", " KB", " MB", " GB", " TB", " PB", " EB", " ZB", " YB")
   
	If Bytes = 0 Then
                    
		Return "0 Bytes"
    
	Else
       
		Private Po, Si As Double
		Private I As Int
       
		Bytes = Abs(Bytes)
                            
		I = Floor(Logarithm(Bytes, 1024))
		Po = Power(1024, I)
		Si = Bytes / Po
       
		Return NumberFormat(Si, 1, 3) & Unit(I)
       
	End If
	 
	
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