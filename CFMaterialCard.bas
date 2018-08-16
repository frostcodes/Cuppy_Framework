B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 
#Event: Touch (Action As Int, Points as Map)
#Event: MouseClicked (EventData As MouseEvent)
#Event: MouseEntered (EventData As MouseEvent)
#Event: MouseExited (EventData As MouseEvent)
#Event: Resize (Width As Double, Height As Double)

#RaisesSynchronousEvents: Touch
#RaisesSynchronousEvents: MouseClicked
#RaisesSynchronousEvents: MouseEntered
#RaisesSynchronousEvents: MouseExited
#RaisesSynchronousEvents: Resize
 
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public InnerCard As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMaterialCardUI")
	'set using theme...
	SetBorder(CFStyleManager.DefaultTheme.Get("divider"), 1)
	 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
	InnerCard.PrefWidth = Width
	InnerCard.PrefHeight = Height
	 
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub SetBg(color As String)
 
	CFControlsUtils.SetPaneBG( InnerCard, color)
 
End Sub

Public Sub SetRotationX(angle As Float)
	
	CFControlsUtils.setPaneRotationX(InnerCard, angle) 'rotate
	 
End Sub
 
Public Sub SetBorder(color As String , width As Int)
	
	CFControlsUtils.setPaneBorder(InnerCard, color, width)

End Sub
  
Public Sub SetBorderRadius(radius As Int)
	
	CFControlsUtils.setPaneBorderRadius(InnerCard, radius)
	
End Sub

Public Sub SetPaneEffect(effect As String)
	
	CFControlsUtils.setPaneEffect(InnerCard, effect)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.removePaneEffect(InnerCard)
	
End Sub

#End Region
 
Private Sub InnerCard_Touch (Action As Int, X As Float, Y As Float)
	
	Dim Points As Map
	Points.Initialize
	Points.Put("X", X )
	Points.Put("Y", Y )
	 
	CallSubDelayed3( mCallBack, mEventName & "_Touch",  Action, Points)
	
End Sub
 
Private Sub InnerCard_MouseEntered (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MouseEntered", EventData)
	
End Sub

Private Sub InnerCard_MouseExited (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MouseExited", EventData)
	
End Sub
 
Private Sub InnerCard_MouseClicked (EventData As MouseEvent)
	
	InnerCard.RequestFocus 'set focus
	CallSubDelayed2(mCallBack, mEventName & "_MouseClicked", EventData)
	
End Sub