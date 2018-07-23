﻿B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 
#Event: CheckedChanged(value as int)
 
 'TODO: make font adjust when resized
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
 
	Public SwitchBtn As Pane
	Public SwitchPane As Pane
	
	'Checkbox states
	Public CHECKED_STATE As Int = 0
	Public UNCHECKED_STATE As Int = 1
	Public INDETERMINATE_STATE As Int = 2
	  
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMaterialSwitchesUI")
	'set using theme...
	setCheckedColor(CFStyleManager.DefaultTheme.Get("primary"))
	
	'TODO: create a designer prorerty for this...
	setCheckState(UNCHECKED_STATE) 'set initial value
	 
	
	'TODO: add a shadow for SwitchBtn to make it like the intial google material type

	'ControlsUtils.setPaneEffect(SwitchBtn, "dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 )")
	
  
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	'we are not handling resizes here...
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( SwitchPane, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	CFControlsUtils.setPaneRotationX(SwitchPane, angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setPaneBorder(SwitchPane, color, width)

End Sub
 
Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setPaneBorderRadius(SwitchPane, radius)
	
End Sub
 
Public Sub setPaneEffect(effect As String)
	
	CFControlsUtils.setPaneEffect(SwitchPane, effect)
	
End Sub

Public Sub removeEffects()
	
	CFControlsUtils.removePaneEffect(SwitchPane)
	
End Sub

#End Region
  
Public Sub setCheckedColor(color As String)
  	
	CSSUtils.SetStyleProperty( SwitchBtn, "-fx-background-color", color)
	
End Sub
 
Public Sub setCheckState(value As Int)
	 
	If value = UNCHECKED_STATE Then
		
		 SwitchBtn.SetLayoutAnimated(200 , 10, SwitchBtn.Top, SwitchBtn.PrefWidth, SwitchBtn.PrefHeight)
		SwitchPane.SetAlphaAnimated(200, 1 )
		SetBg(CFStyleManager.DefaultTheme.Get("divider"))
		  
	Else if value = CHECKED_STATE Then
	
	'Fade effect
		SwitchPane.SetAlphaAnimated(200, 0.6 )
		SetBg(CFControlsUtils.getPaneBG(SwitchBtn))
		
		SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn.Top, SwitchBtn.PrefWidth, SwitchBtn.PrefWidth)
		
	Else
			
		 
		SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn.Top, SwitchBtn.PrefWidth, SwitchBtn.PrefWidth)
		SwitchPane.SetAlphaAnimated(200, 1 )
		SetBg(CFStyleManager.DefaultTheme.Get("divider"))
		  
	End If
	 
	'call callback for checked changed status
	CallSubDelayed2(mCallBack, mEventName & "_CheckedChanged" , value)
	 
End Sub

Public Sub checked As Boolean

	Return SwitchBtn.Left = 23
	 
End Sub

Public Sub IsIndeterminate As Boolean
	
	Return SwitchBtn.Alpha = "0.6"
	
End Sub
 
Private Sub SwitchPane_MousePressed (EventData As MouseEvent)
	 
	If Not(checked) Or IsIndeterminate Then
	
		setCheckState(CHECKED_STATE)
	
	Else
	
		setCheckState(UNCHECKED_STATE)
 
	End If
	
	
End Sub

Sub SwitchBtn_MousePressed (EventData As MouseEvent)
	
	CallSub2(Me , "SwitchPane_MousePressed", EventData)
	
End Sub