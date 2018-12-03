B4J=true
Group=Cuppy Framework\Cuppy\Cuppy Internals
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'Style Manager for Cuppy Framework UI
Private Sub Process_Globals
	 
	Private fx As JFX
	 
	Private AvailableThemes As CFThemes
	AvailableThemes.Initialize 'ignore
	
	Public DefaultTheme As Map
	
'	Public ActiveControls As List
'	ActiveControls.Initialize 'ignore : need this , bad pratice maybe so would find a fix later
'	 

	 
#Region Available Fonts
	  
	Public const FONT_BLACK As Font = SelectFont("Black", 12)
	Public const FONT_BLACK_ITALIC As Font = SelectFont("BlackItalic", 12)
	
	Public const FONT_BOLD As Font = SelectFont("Bold", 12)
	Public const FONT_BOLD_ITALIC As Font = SelectFont("BoldItalic", 12)
	 
	Public const FONT_LIGHT As Font = SelectFont("Light", 12)
	Public const FONT_LIGHT_ITALIC As Font = SelectFont("LightItalic", 12)
	
	Public const FONT_REGULAR As Font = SelectFont("Regular", 12)
	Public const FONT_ITALIC As Font = SelectFont("Italic", 12)
	 
	Public const FONT_MEDIUM As Font = SelectFont("Medium", 12)
	Public const FONT_MEDIUM_ITALIC As Font = SelectFont("MediumItalic", 12)
	 
	Public const FONT_THIN As Font = SelectFont("Thin", 12)
	Public const FONT_THIN_ITALIC As Font = SelectFont("ThinItalic", 12)
	 
 #End Region
	 
 #Region Available Themes
  
	Public const THEME_BLUE As String = "Blue"
	Public const THEME_TEAL As String = "Teal"
	
	#If Full
 
	'Remove from Library if Free version
	
	Public const THEME_GRAY As String = "Gray"
	Public const THEME_DARK As String = "Dark"
	Public const THEME_PURPLE As String = "Purple"
	Public const THEME_PINK As String = "Pink"
	Public const THEME_AMBER As String = "Amber"
	
	#End If

 #End Region 
 
 'Default Theme
	SelectTheme(THEME_BLUE) 'ignore
 
	  
	'Reference cuppy controls so it can be updated all when the style changes
	'allow setting of animation time...
	
End Sub

 'Return a list of available fonts for use
 Private Sub FontTypes As Map
 	
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

'Create a new font object from an existing font
Public Sub ScaleFont(FamilyName As String,Size As Double) As Font
	
	Return fx.CreateFont(FamilyName, Size, False, False)
	 
End Sub

'Create a new font object from an existing font
Public Sub ScaleFont2(FamilyName As String,Size As Double, Bold As Boolean, Italic As Boolean) As Font
	
	Return fx.CreateFont(FamilyName , Size, Bold, Italic)
	 
End Sub
 
'Changes the Default Theme used by Cuppy Framework
'For styling views and Components
'
'Note: The theme name is Case-Insensitive
Public Sub SelectTheme(Theme As String)

#If Free
  
	'Advice developers to donate to have access to all themes
  
	LogDebug($"To have access to all the inbuilt themes,
You need to donate! Donation link: ${CRLF}
${CFConfigs.DonationLink}"$)
  
#End if
  
	Theme = CFStringUtility.ucfirst(Theme)
	 
	If AvailableThemes.ThemesList.ContainsKey(Theme) Then
		
		DefaultTheme = AvailableThemes.ThemesList.Get(Theme)
	
	Else
		
		LogError("Could not find the selected theme(" & Theme & "). Please check the Theme name")
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

