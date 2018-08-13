B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 
#Event: MousePressed (EventData As MouseEvent)
#Event: MouseEntered (EventData As MouseEvent)
#Event: MouseExited (EventData As MouseEvent)

#RaisesSynchronousEvents: MousePressed
#RaisesSynchronousEvents: MouseEntered
#RaisesSynchronousEvents: MouseExited

#Region Internal Segment

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
CFStyleManager.ActiveControls.add(Me)
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	
	mBase = Base
	mBase.LoadLayout("CFMaterialButtonUI")
	'set using theme...
	SetBg(CFStyleManager.DefaultTheme.Get("accent"))
	InnerButton.Font = CFStyleManager.DefaultFont
	InnerButton.MouseCursor = fx.Cursors.HAND
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	InnerButton.PrefWidth = Width
	InnerButton.PrefHeight =  Height
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects
 
Public Sub SetBg(color As String)
 
	CFControlsUtils.SetBG( InnerButton, color)
 
End Sub

Public Sub SetRotationX(angle As Float)
	
	CFControlsUtils.setRotationX(InnerButton, angle) 'rotate
	 
End Sub
  
Public Sub SetBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(InnerButton, color, width)

End Sub


Public Sub SetBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(InnerButton, radius)
	
End Sub


Public Sub SetEffect(effect As String)
	
	CFControlsUtils.setEffect(InnerButton, effect)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.removeEffect(InnerButton)
	
End Sub

#End Region


Private Sub InnerButton_MousePressed (EventData As MouseEvent)
	  
	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData)
	 
End Sub
 
Private Sub InnerButton_MouseEntered (EventData As MouseEvent)
	  
	CallSubDelayed2(mCallBack, mEventName & "_MouseEntered", EventData)
	 
End Sub

Private Sub InnerButton_MouseExited (EventData As MouseEvent)
	  
	CallSubDelayed2(mCallBack, mEventName & "_MouseExited", EventData)
	 
End Sub