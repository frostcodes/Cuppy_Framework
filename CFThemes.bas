B4J=true
Group=Cuppy Framework\Cuppy
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Cascading styles and theming for Metro UI
'This defines all the themes available 
Sub Class_Globals
	 
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize

End Sub

Public Sub ThemesList() As Map
	
	'returns a map of available themes ...
	
	Private AvailableThemes As Map
	AvailableThemes.Initialize
	
	AvailableThemes.Put("Blue", BlueTheme)
	AvailableThemes.Put("Teal", TealTheme)
	 
	Return AvailableThemes
	
End Sub

Public Sub BlueTheme As Map
	
	Private Colors As Map 'use to store the colors we need 
	Colors.Initialize
	
	'add colors
	Colors.Put("primary","#2196F3")
	Colors.Put("primary_dark","#1976D2")
	
	Colors.Put("primary_light","#BBDEFB")
	Colors.Put("accent","#FF4081")
	
	Colors.Put("primary_text","#212121")
	Colors.Put("secondary_text","#757575")
	
	Colors.Put("icons","#FFFFFF")
	Colors.Put("divider","#BDBDBD")
	 
	Return Colors
	 
End Sub
 
Public Sub TealTheme As Map
	
	Private Colors As Map 'use to store the colors we need 
	Colors.Initialize
	
	'add colors
	Colors.Put("primary","#009688")
	Colors.Put("primary_dark","#00796B")
	
	Colors.Put("primary_light","#B2DFDB")
	Colors.Put("accent","#FF5722")
	
	Colors.Put("primary_text","#212121")
	Colors.Put("secondary_text","#757575")
	
	Colors.Put("icons","#FFFFFF")
	Colors.Put("divider","#BDBDBD")
	 
	Return Colors
	 
End Sub
 
Public Sub GrayTheme As Map
	
	Private Colors As Map 'use to store the colors we need 
	Colors.Initialize
	
	'add colors
	Colors.Put("primary","#7f8c8d")
	Colors.Put("primary_dark","#5c6566")
	
	Colors.Put("primary_light","#a9a9a9")
	Colors.Put("accent","#536DFE")
	
	Colors.Put("primary_text","#212121")
	Colors.Put("secondary_text","#757575")
	
	Colors.Put("icons","#FFFFFF")
	Colors.Put("divider","#BDBDBD")
	 
	Return Colors
	 
End Sub
 
Public Sub DarkTheme As Map
	
	Private Colors As Map 'use to store the colors we need 
	Colors.Initialize
	
	'add colors
	Colors.Put("primary","#2c3e50")
	Colors.Put("primary_dark","#1b2732")
	
	Colors.Put("primary_light","#68696a")
	Colors.Put("accent","#95a5a6")
	
	Colors.Put("primary_text","#212121")
	Colors.Put("secondary_text","#757575")
	
	Colors.Put("icons","#FFFFFF")
	Colors.Put("divider","#BDBDBD")
	 
	Return Colors
	 
End Sub
 
Public Sub SelectTheme(theme As String)
	 
	CFStyleManager.DefaultTheme = ThemesList.Get(theme)
	
End Sub


