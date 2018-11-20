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
'TODO: make orientation property: horizontal/vertical..using rotate 
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
	SetBg(CFStyleManager.DefaultTheme.Get("divider"))
	
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

Public Sub setBg(color As String)
 
	CFControlsUtils.SetBG(line, color)
 
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
 