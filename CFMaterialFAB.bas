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
#Event: Resize (Width As Double, Height As Double)


#RaisesSynchronousEvents: MousePressed
#RaisesSynchronousEvents: MouseEntered
#RaisesSynchronousEvents: MouseExited
#RaisesSynchronousEvents: Resize


#Region Internal Segment

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
	mBase.LoadLayout("CFMaterialFABUI")
	
	'set using theme...
	SetBg(CFStyleManager.DefaultTheme.Get("accent"))
	FAB_Btn.MouseCursor = fx.Cursors.HAND
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	 
	'maintain aspect ratio
	FAB_Btn.PrefWidth = Width
	FAB_Btn.PrefHeight = Width
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects


Public Sub SetBg(color As String)
 
	CFControlsUtils.SetBG( FAB_Btn, color)
 
End Sub

Public Sub SetBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(FAB_Btn, color, width)

End Sub

Public Sub SetBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(FAB_Btn, radius)
	
End Sub


Public Sub SetPaneEffect(effect As String)
	
	CFControlsUtils.setEffect(FAB_Btn, effect)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.removeEffect(FAB_Btn)
	
End Sub
 
Public Sub SetRotationX(angle As Float)
	
	CFControlsUtils.setRotation(FAB_Btn, angle) 'rotate
	 
End Sub


#End Region

'hover effect
 'FAB_Btn.SetAlphaAnimated(300, 0.8)
 
Private Sub FAB_Btn_MousePressed (EventData As MouseEvent)
	
	FAB_Btn.RequestFocus 'set focus
	
	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData)  
	
End Sub

Private Sub FAB_Btn_MouseEntered (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MouseEntered", EventData)  
	
End Sub

Private Sub FAB_Btn_MouseExited (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MouseExited", EventData) 
	
End Sub
