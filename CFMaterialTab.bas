B4J=true
Group=unfinished
ModulesStructureVersion=1
Type=Class
Version=6.51
@EndOfDesignText@
#ExcludeFromLibrary: True
'Custom View class

#Event: ExampleEvent (Value As Int)
#DesignerProperty: Key: BooleanExample, DisplayName: Boolean Example, FieldType: Boolean, DefaultValue: True, Description: Example of a boolean property.
#DesignerProperty: Key: IntExample, DisplayName: Int Example, FieldType: Int, DefaultValue: 10, MinRange: 0, MaxRange: 100, Description: Note that MinRange and MaxRange are optional.
#DesignerProperty: Key: StringWithListExample, DisplayName: String With List, FieldType: String, DefaultValue: Sunday, List: Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday
#DesignerProperty: Key: StringExample, DisplayName: String Example, FieldType: String, DefaultValue: Text
#DesignerProperty: Key: ColorExample, DisplayName: Color Example, FieldType: Color, DefaultValue: 0xFFCFDCDC, Description: You can use the built-in color picker to find the color values.
#DesignerProperty: Key: DefaultColorExample, DisplayName: Default Color Example, FieldType: Color, DefaultValue: Null, Description: Setting the default value to Null means that a nullable field will be displayed.
Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Private Tabs As List
	
	Private SelectedDivider As Label
	Private TabTitleWidth As Int = 100
	Private TabTitleHeight As Int = 35
	
	Private DipTabTitleWidth, DipTabTitleHeight As Double
'	Private TabDividerHeight As Int = 2
	Private TabsPane As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	Tabs.Initialize
	TabsPane.Initialize("TabsPane")
	
	SelectedDivider.Initialize("SelectedDivider")
	SelectedDivider.Text = ""
'	SelectedDivider.Visible = False
	CFControlsUtils.SetBackgroundColor(SelectedDivider, "red")
 
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	

'	mBase.AddNode(SelectedDivider, 0,  10 ,  TabTitleWidth ,  TabDividerHeight)
	 
	
	DipTabTitleWidth = DipToCurrent(TabTitleWidth)
	DipTabTitleHeight = DipToCurrent(TabTitleHeight)
	
	mBase.AddNode(TabsPane, 0,0, DipTabTitleHeight, mBase.PrefWidth)
	
End Sub

	
public Sub Addtab()
	
	Dim TabTitle As Label
	TabTitle.Initialize("TabTitle")
	TabTitle.Text = CFDataGeneratorUtility.Rand_Job_Title
	Sleep(0)
	CSSUtils.SetStyleProperty(TabTitle, "-fx-padding", "12px, 16px")
'	CFControlsUtils.SetBG(TabTitle, "teal")
	CFControlsUtils.SetBackgroundColor(TabTitle, "rgb(" & Rnd(100, 255) & "," &Rnd(100, 255) & "," &Rnd(100, 255) & ")" )
	TabTitle.TextColor =  fx.Colors.White
	TabTitle.Font = CFStyleManager.ScaleFont(CFStyleManager.FONT_BOLD.FamilyName, 14)
	TabTitle.Alignment = "CENTER"


	
	
	
	
'	Dim TM As TextMetric = CFControlsUtils.MeasureText(TabTitle.Text, fx.DefaultFont(14) )
	TabsPane.AddNode(TabTitle, (TabsPane.NumberOfNodes - 1) * DipTabTitleWidth,  0, DipTabTitleWidth , DipTabTitleHeight)
	
	SetSelectedTab((TabsPane.NumberOfNodes -1) *  DipTabTitleWidth)
			
 
End Sub

Private Sub SetSelectedTab(LeftPosition As Double)
	
	SelectedDivider.Visible = True
	SelectedDivider.RemoveNodeFromParent
'	mBase.AddNode(SelectedDivider, 0,  DipToCurrent(TabTitleHeight -TabDividerHeight) ,  TabTitleWidth ,  TabDividerHeight)
	
	SelectedDivider.Left =  LeftPosition
	
	
End Sub


Private Sub Base_Resize (Width As Double, Height As Double)
	
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub
 
' 
''Brings a Node To the front
''From: https://www.b4x.com/android/forum/threads/pane-bringtofront.70149/
'Sub BringNodeToFront(n As Node)
'	
'	Dim parent As Pane = n.Parent
'	n.RemoveNodeFromParent
'	parent.AddNode(n, n.Left, n.Top, n.PrefWidth, n.PrefHeight)
'	
'End Sub
'
' 