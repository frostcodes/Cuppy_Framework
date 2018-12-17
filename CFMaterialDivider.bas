B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 
#Event: Resize (Width As Double, Height As Double)

#RaisesSynchronousEvents: Resize

'#DesignerProperty: Key: DividerOrientation, DisplayName: Orientation, FieldType: String, DefaultValue: Horizontal, List: Horizontal|Vertical

#Region Internal Segment

 
Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public line As Pane
	
'	Private DividerOrientation As String 'Orientation of the divider
'	
'	Public HORIZONTAL_ORIENTATION As String = "HORIZONTAL"
'	Public VERTICAL_ORIENTATION As String = "VERTICAL"
'	
End Sub
'
Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMaterialDividerUI")
	
	'set using theme...
	setBackgroundColor(CFStyleManager.DefaultTheme.Get("divider"))
	setTag(Lbl.Tag)
	setAlpha(Lbl.Alpha)
'	setOrientation(Props.Get("DividerOrientation"))
	 
End  Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
		line.PrefWidth = Width
		line.PrefHeight = Height
	
		CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
  
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region
 

#Region Actions and Effects

Public Sub setBackgroundColor(color As String)
 
	CFControlsUtils.setBackgroundColor(line, color)
 
End Sub

Public Sub getBackgroundColor As String
  	
	Return CFControlsUtils.GetBackgroundColor(line)
	
End Sub

'Public Sub setRotation(angle As Float)
'	
'	CFControlsUtils.SetRotation(line, angle) 'rotate
'	CFControlsUtils.SetRotation(GetBase, angle) 'rotate
'	
'End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.SetBorder(line, color, width)

End Sub

Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.SetBorderRadius(line, radius)
	
End Sub

Public Sub setEffect(effect As String)
	
	CFControlsUtils.SetEffect(line, effect)
	 
End Sub
 
Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(line)
	
End Sub
 
Public Sub RemoveEffects()
	
	CFControlsUtils.RemoveEffect(line)
	 
End Sub

#End Region

#Region Control Properties

Public Sub setThickness(size As Double)
	
'	line.PrefHeight =  size
	mBase.PrefHeight =  size
	  
End Sub

Public Sub getThickness() As Double
	
	Return line.PrefHeight
	
End Sub
' 
' 'Get or Set Orientation of the divider...
' 'Either: horizontal or vertical
'Public Sub setOrientation(Orientation As String)
'	 
'	DividerOrientation = Orientation.ToUpperCase
'	
'	If DividerOrientation = HORIZONTAL_ORIENTATION Then
'		
'		setRotation(0)
'		Log("zero:")
'		
'	Else If DividerOrientation = VERTICAL_ORIENTATION Then
'	
'		setRotation(270)
'		
'		Else
'			
'		LogError("Material Divider cannot have an Orientation of value: " & Orientation & " in " & mEventName)
'	
'	End If
'	
'	Log(DividerOrientation)
' 
'End Sub
'
'Public Sub getOrientation() As String
'	
'	Return DividerOrientation
'	
'End Sub

#End Region

'TODO: make vertical divider
 
 
 
 
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






'TODO: make orientation property: horizontal/vertical..using rotate 
