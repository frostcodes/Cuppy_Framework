B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 
#Event: ModalBGPressed (EventData As MouseEvent)
#Event: ModalPressed (EventData As MouseEvent)
#Event: Resize (Width As Double, Height As Double)
#Event: ModalPaneResize (Width As Double, Height As Double)
#Event: ModalBgPaneResize (Width As Double, Height As Double)
 
#RaisesSynchronousEvents: ModalBGPressed
#RaisesSynchronousEvents: ModalPressed
#RaisesSynchronousEvents: Resize
#RaisesSynchronousEvents: ModalPaneResize
#RaisesSynchronousEvents: ModalBgPaneResize
  
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
	 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	ModalBgPane.PrefWidth = Width
	ModalBgPane.PrefHeight =  Height
	
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects
 
Public Sub SetBg(color As String)
 
	CFControlsUtils.setBG( ModalPane, color)
 
End Sub
  
Public Sub setRotation(angle As Float)
	
	CFControlsUtils.setRotation(ModalPane, angle) 'rotate
	 
End Sub
  
Public Sub SetBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(ModalPane, color, width)

End Sub


Public Sub SetBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(ModalPane, radius)
	
End Sub


Public Sub SetEffect(effect As String)
	
	CFControlsUtils.setEffect(ModalPane, effect)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.RemoveEffect(ModalPane)
	
End Sub

#End Region

#Region Extra Functions

Public Sub Show
	 
	Dim Parent As Pane = GetBase.Parent
	
	mBase.Enabled = True
	mBase.Alpha = 1
	
	ModalBgPane.Visible = True
	ModalPane.Visible = True
	
	mBase.SetLayoutAnimated(300, 0 , 0,  Parent.Width, Parent.Height)
	  
End Sub

Public Sub Hide
	 
	mBase.SetAlphaAnimated(300, 0)
	 
	Wait For mBase_AnimationCompleted

	ModalBgPane.Visible = False
	ModalPane.Visible = False
	
	mBase.SetSize(0, 0)
	mBase.Enabled = False
	  
End Sub

#End Region
 
Private Sub ModalBgPane_MousePressed (EventData As MouseEvent)
	
	ModalPane.RequestFocus 'set focus
	
	CallSubDelayed2(mCallBack, mEventName & "_ModalBGPressed", EventData)  
	
End Sub

Private Sub ModalPane_MousePressed (EventData As MouseEvent)
	
	ModalPane.RequestFocus 'set focus
	
	CallSubDelayed2(mCallBack, mEventName & "_ModalPressed", EventData)  
	
End Sub

Sub ModalPane_Resize (Width As Double, Height As Double)
	
	CallSubDelayed3(mCallBack, mEventName & "_ModalPaneResize", Width, Height)
	
End Sub

Sub ModalBgPane_Resize (Width As Double, Height As Double)
	
	CallSubDelayed3(mCallBack, mEventName & "_ModalBgPaneResize", Width, Height)
	
End Sub