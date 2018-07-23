﻿B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class

'TODO: implement indeterminate progress bar 
'TODO: circular progress bar
'https://material.io/design/components/progress-indicators.html#circular-progress-indicators

#Event: ProgressFinished
 
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public ProgressBar As Pane
	Public ProgressPane As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMaterialLinearProgressBarUI")
	'set using theme...
	SetBg(CFStyleManager.DefaultTheme.Get("divider"))
	setProgressColor(CFStyleManager.DefaultTheme.Get("primary"))
	progress(30) 'set initial value
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	ProgressPane.PrefWidth = Width
	ProgressPane.PrefHeight = Height
	ProgressBar.PrefHeight = Height
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( ProgressPane, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	CFControlsUtils.setPaneRotationX(ProgressPane, angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setPaneBorder(ProgressPane, color, width)

End Sub
 
Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setPaneBorderRadius(ProgressPane, radius)
	
End Sub
 
Public Sub setPaneEffect(effect As String)
	
	CFControlsUtils.setPaneEffect(ProgressPane, effect)
	
End Sub

Public Sub removeEffects()
	
	CFControlsUtils.removePaneEffect(ProgressPane)
	
End Sub

#End Region
  
Public Sub setProgressColor(color As String)
  	
	CSSUtils.SetStyleProperty( ProgressBar, "-fx-background-color", color)
	
End Sub

Public Sub progress(value As Int)
	
	If value >= 100 Then
		value = 100
		
		'call callback for progress finished...
		CallSub(mCallBack, mEventName & "_ProgressFinished")  
		
	End If
	
	ProgressBar.SetLayoutAnimated(400, 0 ,0 ,(value / 100) * mBase.PrefWidth , mBase.PrefHeight)
	
End Sub