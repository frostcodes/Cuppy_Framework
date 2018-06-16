Type=Class
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Custom View class
Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public InnerButton As Button
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("MaterialButtonLayout")
	'set using theme...
	SetBg(StyleManager.DefaultTheme.Get("accent"))
	InnerButton.Font = StyleManager.DefaultFont
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	
'	Private ScaleFactor As Int =  Width * 0.2 'retain ratio
	 
	InnerButton.PrefWidth = Width
	InnerButton.PrefHeight =  Height
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( InnerButton, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setRotationX(InnerButton, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	ControlsUtils.setBorder(InnerButton, color, width)

End Sub