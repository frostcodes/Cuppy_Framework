B4J=true
Group=Cuppy Framework\Cuppy
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
	'Public DefaultTheme As Map = AvailableThemes.ThemesList.Get("Teal") 'ignore
	 
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
	'tODO: handdle missing font..maybe
 
	Return  fx.LoadFont(File.DirAssets , FontTypes.Get(fontName), FontSize)
	
End Sub
 
'Changes the Default Theme used by Cuppy Framework
'For styling views and Components
'
'Note: The theme name is Case-Insensitive
Public Sub SelectTheme(theme As String)
	
	theme = CFStringUtility.ucfirst(theme)
	 
	If AvailableThemes.ThemesList.ContainsKey(theme) Then
		
		 DefaultTheme = AvailableThemes.ThemesList.Get(theme)
	
	Else
		
		LogError("Could not find the selected theme(" & theme & "). Please check the Theme name")
		ExitApplication
		
	End If
	 
End Sub