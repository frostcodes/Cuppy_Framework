Type=Class
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Custom View class

#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
 
	Public InnerButtonPane As Pane
	Public InnerLabel As Label
	Public InnerPane As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("ChipsLayout")
	'set using theme...
	SetBg(StyleManager.DefaultTheme.Get("accent"))
	InnerLabel.Font = StyleManager.SelectFont("Thin", 12)
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	InnerPane.PrefWidth = Width
	InnerPane.PrefHeight =  Height
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( InnerPane, "-fx-background-color", color)
 
End Sub

#End Region

#Region Actions and Effects

Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setPaneRotationX(InnerPane, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	ControlsUtils.setPaneBorder(InnerPane, color, width)

End Sub


Sub setBorderRadius(radius As Int)
	
	ControlsUtils.setPaneBorderRadius(InnerPane, radius)
	
End Sub


Public Sub setPaneEffect(effect As String)
	
	ControlsUtils.setPaneEffect(InnerPane, effect)
	
End Sub

Public Sub removeEffects()
	
	ControlsUtils.removePaneEffect(InnerPane)
	
End Sub

#End Region
