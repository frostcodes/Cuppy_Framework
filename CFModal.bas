B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class

 #If Free
 
'Remove from Library if Free version
 
#ExcludeFromLibrary: True
Sub Class_Globals

End Sub

 #Else
 
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
	mBase.Initialize(mEventName)
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFModalUI")
	  
	setTag(Lbl.Tag)
	setAlpha(Lbl.Alpha)
	
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
 
Public Sub setBackgroundColor(color As String)
 
	CFControlsUtils.SetBackgroundColor( ModalPane, color)
 
End Sub

Public Sub getBackgroundColor As String
  	
	Return CFControlsUtils.GetBackgroundColor(ModalPane)
	
End Sub
  
Public Sub setRotation(angle As Float)
	
	CFControlsUtils.setRotation(ModalPane, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(ModalPane, color, width)

End Sub


Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(ModalPane, radius)
	
End Sub

Public Sub getBorderColor As String
	
	Return CFControlsUtils.GetBorderColor(ModalPane)
	
End Sub

Public Sub getBorderWidth As Int
	
	Return CFControlsUtils.GetBorderWidth(ModalPane)
	
End Sub

Public Sub getBorderRadius As Int
	
	Return CFControlsUtils.GetBorderRadius(ModalPane)
	
End Sub

Public Sub setEffect(effect As String)
	
	CFControlsUtils.setEffect(ModalPane, effect)
	
End Sub
 
Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(ModalPane)
	
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
	
'	ModalBgPane.Enabled = False
'	ModalPane.Enabled = False

End Sub

#End Region

#Region General Functions and Properties

'Get or set whether Node is Enabled?
Public Sub getEnabled As Boolean
	
	Return mBase.Enabled
	
End Sub

Public Sub setEnabled(Enabled As Boolean)
	
	mBase.Enabled = Enabled

End Sub
 
'Get or set whether Node is Visible?
Public Sub getVisible As Boolean
	
	Return mBase.Visible
	
End Sub

Public Sub setVisible(Visible As Boolean)
	
	mBase.Visible = Visible

End Sub
 
'Get or set the Node Alpha level: 0 - transparent, 1 - Fully Opaque
Public Sub getAlpha As Double
	
	Return mBase.Alpha
	
End Sub

Public Sub setAlpha(Alpha As Double)
	
	mBase.Alpha = Alpha

End Sub
 
'Get the Node Height
Public Sub getHeight As Double
	
	Return mBase.PrefHeight
	
End Sub
  
'Get the Node Width
Public Sub getWidth As Double
	
	Return mBase.PrefWidth
	
End Sub
 
'Get the top property of the Node (related to its parent)
Public Sub getTop As Double
	
	Return mBase.Top
	
End Sub
  
'Get the Node Parent
Public Sub getParent As Node
	
	Return mBase.Parent
	 
End Sub
  
'Get or set the Node tag.
'This is placeholder for any object you need to tie to the node
Public Sub getTag As Object
	
	Return mBase.Tag
	
End Sub

Public Sub setTag(Tag As Object)
	
	mBase.Tag = Tag

End Sub
 
'Get the Left property of the Node (related to its parent)
Public Sub getLeft As Double
	
	Return mBase.Left
	
End Sub
   
'FUNCTIONS

'Removes the node from its parent
Public Sub RemoveNodeFromParent
	
	mBase.RemoveNodeFromParent
	
End Sub

'Captures the node appearance and returns the rendered image
Public Sub Snapshot As Image
	
	Return mBase.Snapshot
	
End Sub
 
'Similar to Snapshot. Allow you to set the background color
Public Sub Snapshot2(BackgroundColor As Paint) As Image
	
	Return mBase.Snapshot2(BackgroundColor)
	
End Sub
  
'tooltip
'	

'#End Region
 
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

#End if
