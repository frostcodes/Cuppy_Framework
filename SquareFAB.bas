﻿Type=Class
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
	Public FAB_Btn As Label
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("SquareFABLayout")
	'set using theme...
	SetBg(StyleManager.DefaultTheme.Get("accent"))
	setRotationX(135) 'rotate by default
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	 'maintain aspect ratio
	FAB_Btn.PrefWidth = Width
	FAB_Btn.PrefHeight = Width
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( FAB_Btn, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setRotationX(FAB_Btn, angle) 'rotate 
	 
End Sub
  