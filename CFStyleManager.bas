B4J=true
Group=Cuppy\Extra Components
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

'returns an instance of a font that can be reused
Public Sub SelectFont(font As String,  FontSize As Double ) As Font
	'tODO: handdle missing font..maybe
 
	Return  fx.LoadFont(CFConfigs.RobotoFontsPath , FontTypes.Get(font), FontSize)
	
End Sub