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
 
#Event: CheckedChanged(state as int)
#Event: MouseEntered(EventData As MouseEvent)
#Event: MouseExited(EventData As MouseEvent)
#Event: Resize (Width As Double, Height As Double)

#RaisesSynchronousEvents: CheckedChanged
#RaisesSynchronousEvents: MouseEntered
#RaisesSynchronousEvents: MouseExited
#RaisesSynchronousEvents: Resize
 
#DesignerProperty: Key: CheckedState, DisplayName: Checked State, FieldType: String, DefaultValue: UNCHECKED, List: UNCHECKED|CHECKED|INDETERMINATE
 
 'TODO: make font adjust when resized
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
 
	Public CheckedLabel As Label
	Public CheckboxPane As Pane
	
	'Checkbox states
	Public UNCHECKED_STATE As Int = 0
	Public CHECKED_STATE As Int = 1
	Public INDETERMINATE_STATE As Int = 2
	
	'This prevents raising checked event when setting designer checked property
	Private FirstTimeSetted As Boolean = False
	Private PrivateCheckState As Int
	 
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMaterialCheckboxUI")
	'set using theme...
	setBorder(CFStyleManager.DefaultTheme.Get("divider"), 2)
	setCheckedColor(CFStyleManager.DefaultTheme.Get("primary"))
	
'	Set checked state
	Dim checkedState As String = Props.Get("CheckedState")
	
	'set initial value
	
	If checkedState = "UNCHECKED" Then
		
		setCheckState(UNCHECKED_STATE)
	
	else If checkedState = "CHECKED" Then
		
		setCheckState(CHECKED_STATE)
		
	else If checkedState = "INDETERMINATE" Then
		
		setCheckState(INDETERMINATE_STATE)
	 
	End If
	
	setTag(Lbl.Tag)
	setAlpha(Lbl.Alpha)
	 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	CheckboxPane.PrefWidth = Width
	CheckedLabel.PrefWidth = Width
	
	CheckboxPane.PrefHeight = Height
	CheckedLabel.PrefHeight = Height
	
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub setBackgroundColor(color As String)
 
	CFControlsUtils.SetBackgroundColor( CheckboxPane, color)
 
End Sub

Public Sub getBackgroundColor As String
  	
	Return CFControlsUtils.GetBackgroundColor(CheckboxPane)
	
End Sub

Public Sub setRotation(angle As Float)
	
	CFControlsUtils.SetRotation(CheckboxPane, angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.SetBorder(CheckboxPane, color, width)

End Sub
 
Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.SetBorderRadius(CheckboxPane, radius)
	
End Sub
 
Public Sub setEffect(effect As String)
	
	CFControlsUtils.SetEffect(CheckboxPane, effect)
	
End Sub

Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(CheckboxPane)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.RemoveEffect(CheckboxPane)
	
End Sub

#End Region
  
Public Sub setCheckedColor(color As String)
  	
	 CFControlsUtils.SetBackgroundColor(CheckedLabel, color)
	
End Sub

'Get/set the check state
Public Sub setCheckState(state As Int)
	 
		If state = UNCHECKED_STATE Then
		
			CheckedLabel.Visible = False
			CheckedLabel.SetAlphaAnimated(300, 0 )
		 
		Else if state = CHECKED_STATE Then
	
			CheckedLabel.Visible = True
			CheckedLabel.SetAlphaAnimated(300, 1 )
		 
		Else
			
			CheckedLabel.SetAlphaAnimated(300, 0.6 )
			CheckedLabel.Visible = True
		 	
		End If
	 
		If FirstTimeSetted Then
		
			'call callback for checked changed status
			CallSubDelayed2(mCallBack, mEventName & "_CheckedChanged" , state)

		Else
			
			FirstTimeSetted = True
		
		End If
		
	PrivateCheckState = state
	
End Sub

Public Sub getCheckState As Int
	
	Return PrivateCheckState
	
End Sub

Public Sub Checked As Boolean

	Return CheckedLabel.Visible
	 
End Sub

Public Sub IsIndeterminate As Boolean
	
	Return CheckedLabel.Alpha = "0.6"
	
End Sub

'TODO: allow setting icon from designer


Public Sub setIcon(iconCode As Int)
	
	CheckedLabel.Text = Chr(iconCode)
	
End Sub

'Adds to a parent
Public Sub AddToParent(Parent As Pane, Left As Int, Top As Int, Width As Int, Height As Int)
	
	mBase.Initialize("mBase")
	Parent.AddNode(mBase, Left, Top, Width, Height)

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

   
Private Sub CheckboxPane_MousePressed (EventData As MouseEvent)
	
	CheckboxPane.RequestFocus 'set focus
	
	If Not(Checked) Or IsIndeterminate Then
	
		setCheckState(CHECKED_STATE)
	
	Else
	
		setCheckState(UNCHECKED_STATE)
		   
	End If
	 
End Sub

Private Sub CheckboxPane_MouseEntered (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MouseEntered" , EventData)
	
End Sub

Private Sub CheckboxPane_MouseExited (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MouseExited" , EventData)
	
End Sub

#End if

#Region Control Binders
 
'Control Event Name
Public Sub getEventName As String
	
	Return mEventName
	
End Sub

'Control Call Back
Public Sub getCallBack As Object
	
	Return mCallBack
	
End Sub
 

#End Region
