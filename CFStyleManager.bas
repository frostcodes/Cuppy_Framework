B4J=true
Group=Cuppy Framework\Cuppy\Cuppy Internals
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'Static code module
Private Sub Process_Globals
	 
	Private fx As JFX
	 
	Public DefaultFont As Font = SelectFont("Regular" , 12)
	Public AvailableThemes As CFThemes
	Public DefaultTheme As Map = AvailableThemes.ThemesList.Get("Blue") 'ignore
	Public ActiveControls As List
	ActiveControls.Initialize 'ignore : need this , bad pratice maybe so would find a fix later
	 
	  
	'Reference cuppy controls so it can be updated all when the style changes
	'allow setting of animation time...
End Sub

 'Return a list of available fonts for use
 Public Sub FontTypes As Map
 	
	Dim FTypes As Map
	FTypes.Initialize
	
	FTypes.Put("Black","Roboto-Black.ttf")
	FTypes.Put("BlackItalic","Roboto-BlackItalic.ttf")
	
	FTypes.Put("Bold","Roboto-Bold.ttf")
	FTypes.Put("BoldItalic","Roboto-BoldItalic.ttf")
	
	FTypes.Put("Italic","Roboto-Italic.ttf")
	FTypes.Put("Light","Roboto-Light.ttf")
	
	FTypes.Put("LightItalic","Roboto-LightItalic.ttf")
	FTypes.Put("Medium","Roboto-Medium.ttf")
	
	FTypes.Put("MediumItalic","Roboto-MediumItalic.ttf")
	FTypes.Put("Regular","Roboto-Regular.ttf")
	
	FTypes.Put("Thin","Roboto-Thin.ttf")
	FTypes.Put("ThinItalic","Roboto-ThinItalic.ttf")
	
	Return FTypes
	 
End Sub

'Returns an instance of a font that can be reused
Public Sub SelectFont(fontName As String,  FontSize As Double ) As Font
	 
	Return fx.LoadFont(File.DirAssets , FontTypes.Get(fontName), FontSize)
	
End Sub
 
'Changes the Default Theme used by Cuppy Framework
'For styling views and Components
'
'Note: The theme name is Case-Insensitive
Public Sub SelectTheme(theme As String)

#If Free
  
	LogDebug("To have access to all the inbuilt thems, You need to donate!")
	LogDebug("To have access to all the inbuilt thems, You need to donate!")
  

 #End
 
	
	theme = CFStringUtility.ucfirst(theme)
	 
	If AvailableThemes.ThemesList.ContainsKey(theme) Then
		
		DefaultTheme = AvailableThemes.ThemesList.Get(theme)
	
	Else
		
		LogError("Could not find the selected theme(" & theme & "). Please check the Theme name")
		ExitApplication
		
	End If
	 
End Sub

 #If Full
 
'Remove from Library if Free version
   
   
'Allows you to load your Theme from a file 
'This returns a map of your theme
'which you can reuse to set theme in your program
'
'NOTE: themes file are checked to validate that
' required key values are present
Public Sub LoadThemeFile(Dir As String, FileName As String) As Map
	
	'TODO: dynamic caching of themes and fonts when loaded
	'such that they would be in memomery and returned when dev
	'tries to reload this way, memory is safed
	 
	Dim mapx As Map = File.ReadMap(Dir ,FileName)
	
	Dim checklist As List
	checklist.Initialize
	 
	checklist.Add("primary")
	checklist.Add("primary_dark")
	
	checklist.Add("primary_light")
	checklist.Add("accent")
	
	checklist.Add("primary_text")
	checklist.Add("secondary_text")
	
	checklist.Add("icons")
	checklist.Add("divider")
	 
	For Each KeyX As String In checklist
		
		'If one key is missing, stop loading of theme...
		If Not(mapx.ContainsKey(KeyX)) Or CFStringUtility.isEmpty(mapx.Get(KeyX)) Then
			
			Dim ErrorStr As StringBuilder
			ErrorStr.Initialize
			
			ErrorStr.Append("Could not load theme file (" & FileName & ") ")
			ErrorStr.Append("because the theme key (" & KeyX & ") is missing ")
			ErrorStr.Append("or its value is empty!")
			 
			LogError(ErrorStr.ToString)
			 
			ExitApplication
			
		End If
		
	Next
	
	Return mapx
	 
End Sub

'Export a theme to a file
Public Sub ExportTheme(theme As String , Dir As String, FileName As String)
	 
	theme = CFStringUtility.ucfirst(theme)
	 
	If AvailableThemes.ThemesList.ContainsKey(theme) Then
		
		 File.WriteMap(Dir, FileName, AvailableThemes.ThemesList.Get(theme))
	
	Else
		
		LogError("Could not export theme(" & theme & "). Please check the Theme name!")
		ExitApplication
		
	End If
	
End Sub

'Export current theme to a file
Public Sub ExportCurrentTheme(Dir As String, FileName As String)
	
	File.WriteMap(Dir, FileName, DefaultTheme)
	
End Sub

#End if