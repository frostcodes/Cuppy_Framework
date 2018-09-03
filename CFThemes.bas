B4J=true
Group=Cuppy Framework\Cuppy\Cuppy Internals
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Cascading styles and theming for Material UI
'This defines all the themes available 
Sub Class_Globals
	 
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize

End Sub
	
'Return a map of available themes ...

Public Sub ThemesList() As Map
	
	Private AvailableThemes As Map
	AvailableThemes.Initialize
	
	AvailableThemes.Put("Blue", BlueTheme)
	AvailableThemes.Put("Teal", TealTheme)
	
	
#If Full
 
	'Remove from Library if Free version
   
	AvailableThemes.Put("Gray", GrayTheme)
	AvailableThemes.Put("Dark", DarkTheme)
	
	AvailableThemes.Put("Purple", PurpleTheme)
	AvailableThemes.Put("Pink", PinkTheme)
	
	AvailableThemes.Put("Amber", AmberTheme)
	
#End if
	 
	Return AvailableThemes
	
End Sub

#Region Themes Mappings

Private Sub BlueTheme As Map
	
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
 
Private Sub TealTheme As Map
	
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

 #If Full
 
'Remove from Library if Free version
   
Private Sub GrayTheme As Map
	
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
 
Private Sub DarkTheme As Map
	
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

Private Sub PurpleTheme As Map
	
	Private Colors As Map 'use to store the colors we need 
	Colors.Initialize
	
	'add colors
	Colors.Put("primary","#673AB7")
	Colors.Put("primary_dark","#512DA8")
	
	Colors.Put("primary_light","#D1C4E9")
	Colors.Put("accent","#536DFE")
	
	Colors.Put("primary_text","#212121")
	Colors.Put("secondary_text","#757575")
	
	Colors.Put("icons","#FFFFFF")
	Colors.Put("divider","#BDBDBD")
	 
	Return Colors
	 
End Sub
 
Private Sub PinkTheme As Map
	
	Private Colors As Map 'use to store the colors we need 
	Colors.Initialize
	
	'add colors
	Colors.Put("primary","#E91E63")
	Colors.Put("primary_dark","#C2185B")
	
	Colors.Put("primary_light","#F8BBD0")
	Colors.Put("accent","#FF9800")
	
	Colors.Put("primary_text","#212121")
	Colors.Put("secondary_text","#757575")
	
	Colors.Put("icons","#FFFFFF")
	Colors.Put("divider","#BDBDBD")
	 
	Return Colors
	 
End Sub
 
Private Sub AmberTheme As Map
	
	Private Colors As Map 'use to store the colors we need 
	Colors.Initialize
	
	'add colors
	Colors.Put("primary","#FFC107")
	Colors.Put("primary_dark","#FFA000")
	
	Colors.Put("primary_light","#FFECB3")
	Colors.Put("accent","#03A9F4")
	
	Colors.Put("primary_text","#212121")
	Colors.Put("secondary_text","#757575")
	
	Colors.Put("icons","#FFFFFF")
	Colors.Put("divider","#BDBDBD")
	 
	Return Colors
	 
End Sub

 
#End Region 

#End If

