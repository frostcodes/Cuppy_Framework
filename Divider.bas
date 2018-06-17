Type=Class
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Custom View class
 
#DesignerProperty: Key: thickness, DisplayName: thickness, FieldType: Int, DefaultValue: 1, MinRange: 0, MaxRange: 20, Description: Set how thick the divider should be

#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Private line As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("DividerLayout")
	'set using theme...
	SetBg(StyleManager.DefaultTheme.Get("divider"))
	setThickness(Props.Get("thickness"))
	
	 
	Log("Thick:  " & Props.Get("thickness"))
	 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	line.PrefWidth = Width
	line.PrefHeight =  Height
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region
 

#Region Actions and Effects

Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( line, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setPaneRotationX(line, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	ControlsUtils.setPaneBorder(line, color, width)

End Sub


Sub setBorderRadius(radius As Int)
	
	ControlsUtils.setPaneBorderRadius(line, radius)
	
End Sub


Public Sub setPaneEffect(effect As String)
	
	ControlsUtils.setPaneEffect(line, effect)
	
End Sub

Public Sub removeEffects()
	
	ControlsUtils.removePaneEffect(line)
	
End Sub

#End Region

#Region Control Properties

Sub setThickness(size As Int)
	
	line.PrefHeight =  thickness
	mBase.PrefHeight = thickness
	 
End Sub

Sub thickness() As Int
	
	Return line.PrefHeight
	
End Sub

#End Region


