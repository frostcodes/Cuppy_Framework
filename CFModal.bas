﻿B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 
#Event: ModalBGPressed (EventData As MouseEvent)
#Event: ModalPressed (EventData As MouseEvent)

#RaisesSynchronousEvents: ModalBGPressed
#RaisesSynchronousEvents: ModalPressed

#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public ModalPane As Pane
	Public ModalBgPane As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFModalUI")
	'set using theme...
 
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	ModalBgPane.PrefWidth = Width
	ModalBgPane.PrefHeight =  Height
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects
 
Public Sub SetBg(color As String)
 
	CFControlsUtils.setPaneBG( ModalPane, color)
 
End Sub
  
Public Sub setRotationX(angle As Float)
	
	CFControlsUtils.setPaneRotationX(ModalPane, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setPaneBorder(ModalPane, color, width)

End Sub


Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setPaneBorderRadius(ModalPane, radius)
	
End Sub


Public Sub setEffect(effect As String)
	
	CFControlsUtils.setPaneEffect(ModalPane, effect)
	
End Sub

Public Sub removeEffects()
	
	CFControlsUtils.removePaneEffect(ModalPane)
	
End Sub

#End Region

#Region Extra Functions

Public Sub show
	 
	Dim Parent As Pane = GetBase.Parent
	
	ModalBgPane.Visible = True
	ModalPane.Visible = True
	
	mBase.SetLayoutAnimated(300, 0 , 0,  Parent.Width, Parent.Height)
	  
End Sub

#End Region
 
Sub ModalBgPane_MousePressed (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_ModalBGPressed", EventData) 'ignore
	
End Sub

Sub ModalPane_MousePressed (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_ModalPressed", EventData) 'ignore
	
End Sub