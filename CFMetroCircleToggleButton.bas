B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=6.3
@EndOfDesignText@
'Custom View class
 
#Event: CheckedChanged(value as int)
#Event: Resize (Width As Double, Height As Double)

#RaisesSynchronousEvents: CheckedChanged
#RaisesSynchronousEvents: Resize

#DesignerProperty: Key: CheckedState, DisplayName: Checked State, FieldType: String, DefaultValue: UNCHECKED, List: UNCHECKED|CHECKED
 
 'TODO: make font adjust when resized
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
  
	'Checkbox states
	Public CHECKED_STATE As Int = 1
	Public UNCHECKED_STATE As Int = 0
	 
	Private CheckedStatus As Boolean = False
	Public ToggleButton As Label
	
	'This prevents raising checked event when setting designer checked property
	Private FirstTime As Boolean = False
	 
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMetroCircleToggleButtonUI")
	  
	
'	Set checked state
	Dim checkedState As String = Props.Get("CheckedState")
	
	'set initial value
	
	If checkedState = "UNCHECKED" Then
		
		setCheckState(UNCHECKED_STATE)
	
	else If checkedState = "CHECKED" Then
		
		setCheckState(CHECKED_STATE)
		 
	End If
	
	setTag(Lbl.Tag)
	setAlpha(Lbl.Alpha)
	 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
	ToggleButton.PrefHeight = Width
	ToggleButton.PrefWidth = Width
	
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub setBackgroundColor(color As String)
 
	CFControlsUtils.setBackgroundColor(ToggleButton, color)
 
End Sub

Public Sub getBackgroundColor As String
  	
	Return CFControlsUtils.GetBackgroundColor(ToggleButton)
	
End Sub

Public Sub setRotation(angle As Float)
	
	CFControlsUtils.setRotation(ToggleButton, angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(ToggleButton, color, width)

End Sub
 
Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(ToggleButton, radius)
	
End Sub
 
Public Sub setEffect(effect As String)
	
	CFControlsUtils.setEffect(ToggleButton, effect)
	
End Sub
 
Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(ToggleButton)
	
End Sub
 
Public Sub RemoveEffects()
	
	CFControlsUtils.removeEffect(ToggleButton)
	
End Sub

#End Region
   
Public Sub setCheckState(value As Int)
	 
	If value = UNCHECKED_STATE Then
		 
		setBackgroundColor("white")
		setBorder("#D6D6D6", 2)
		
		ToggleButton.TextColor = fx.Colors.RGB(91, 91, 91)
		  
		CheckedStatus = False
		  
	Else if value = CHECKED_STATE Then
	 
		
		setBorder("#2EA9DE", 2)
		setBackgroundColor("rgb(65, 177, 225 )")
		
		ToggleButton.TextColor = fx.Colors.White
		 
		CheckedStatus = True
		 
	End If
	 
	If FirstTime Then
		
		'call callback for checked changed status
		CallSubDelayed2(mCallBack, mEventName & "_CheckedChanged" , value)

	Else
			
		FirstTime = True
		
	End If
	
End Sub

Public Sub Checked As Boolean

	Return CheckedStatus
	 
End Sub

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

#End Region

Private Sub ToggleButton_MousePressed (EventData As MouseEvent)
	
	ToggleButton.RequestFocus 'set focus
	 
	If Not(Checked) Then
	
		setCheckState(CHECKED_STATE)
	
	Else
	
		setCheckState(UNCHECKED_STATE)
 
	End If
	
End Sub
