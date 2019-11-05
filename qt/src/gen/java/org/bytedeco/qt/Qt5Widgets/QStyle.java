// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qstyle.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QStyle extends QObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QStyle(Pointer p) { super(p); }


    public native void polish(QWidget widget);
    public native void unpolish(QWidget widget);

    public native void polish(QApplication application);
    public native void unpolish(QApplication application);

    /** enum QStyle::StateFlag */
    public static final int
        State_None =                0x00000000,
        State_Enabled =             0x00000001,
        State_Raised =              0x00000002,
        State_Sunken =              0x00000004,
        State_Off =                 0x00000008,
        State_NoChange =            0x00000010,
        State_On =                  0x00000020,
        State_DownArrow =           0x00000040,
        State_Horizontal =          0x00000080,
        State_HasFocus =            0x00000100,
        State_Top =                 0x00000200,
        State_Bottom =              0x00000400,
        State_FocusAtBorder =       0x00000800,
        State_AutoRaise =           0x00001000,
        State_MouseOver =           0x00002000,
        State_UpArrow =             0x00004000,
        State_Selected =            0x00008000,
        State_Active =              0x00010000,
        State_Window =              0x00020000,
        State_Open =                0x00040000,
        State_Children =            0x00080000,
        State_Item =                0x00100000,
        State_Sibling =             0x00200000,
        State_Editing =             0x00400000,
        State_KeyboardFocusChange = 0x00800000,
// #ifdef QT_KEYPAD_NAVIGATION
// #endif
        State_ReadOnly =            0x02000000,
        State_Small =               0x04000000,
        State_Mini =                0x08000000;
    
//     #define Q_DECLARE_FLAGS(arg0, arg1)(State, StateFlag)


    /** enum QStyle::PrimitiveElement */
    public static final int
        PE_Frame = 0,
        PE_FrameDefaultButton = 1,
        PE_FrameDockWidget = 2,
        PE_FrameFocusRect = 3,
        PE_FrameGroupBox = 4,
        PE_FrameLineEdit = 5,
        PE_FrameMenu = 6,
        PE_FrameStatusBarItem = 7,
// #if QT_DEPRECATED_SINCE(5, 13) // ### Qt 6: remove
// #endif
        PE_FrameTabWidget = 8,
        PE_FrameWindow = 9,
        PE_FrameButtonBevel = 10,
        PE_FrameButtonTool = 11,
        PE_FrameTabBarBase = 12,

        PE_PanelButtonCommand = 13,
        PE_PanelButtonBevel = 14,
        PE_PanelButtonTool = 15,
        PE_PanelMenuBar = 16,
        PE_PanelToolBar = 17,
        PE_PanelLineEdit = 18,

        PE_IndicatorArrowDown = 19,
        PE_IndicatorArrowLeft = 20,
        PE_IndicatorArrowRight = 21,
        PE_IndicatorArrowUp = 22,
        PE_IndicatorBranch = 23,
        PE_IndicatorButtonDropDown = 24,
        PE_IndicatorItemViewItemCheck = 25,
// #if QT_DEPRECATED_SINCE(5, 13) // ### Qt 6: remove
// #endif
        PE_IndicatorCheckBox = 26,
        PE_IndicatorDockWidgetResizeHandle = 27,
        PE_IndicatorHeaderArrow = 28,
        PE_IndicatorMenuCheckMark = 29,
        PE_IndicatorProgressChunk = 30,
        PE_IndicatorRadioButton = 31,
        PE_IndicatorSpinDown = 32,
        PE_IndicatorSpinMinus = 33,
        PE_IndicatorSpinPlus = 34,
        PE_IndicatorSpinUp = 35,
        PE_IndicatorToolBarHandle = 36,
        PE_IndicatorToolBarSeparator = 37,
        PE_PanelTipLabel = 38,
        PE_IndicatorTabTear = 39,
        PE_IndicatorTabTearLeft = PE_IndicatorTabTear,
        PE_PanelScrollAreaCorner = PE_IndicatorTabTear + 1,

        PE_Widget = PE_IndicatorTabTear + 2,

        PE_IndicatorColumnViewArrow = PE_IndicatorTabTear + 3,
        PE_IndicatorItemViewItemDrop = PE_IndicatorTabTear + 4,

        PE_PanelItemViewItem = PE_IndicatorTabTear + 5,
        PE_PanelItemViewRow = PE_IndicatorTabTear + 6, // ### Qt 6: remove

        PE_PanelStatusBar = PE_IndicatorTabTear + 7,

        PE_IndicatorTabClose = PE_IndicatorTabTear + 8,
        PE_PanelMenu = PE_IndicatorTabTear + 9,

        PE_IndicatorTabTearRight = PE_IndicatorTabTear + 10,

        // do not add any values below/greater this
        PE_CustomBase = 0xf000000;
    
    /** enum QStyle::ControlElement */
    public static final int
        CE_PushButton = 0,
        CE_PushButtonBevel = 1,
        CE_PushButtonLabel = 2,

        CE_CheckBox = 3,
        CE_CheckBoxLabel = 4,

        CE_RadioButton = 5,
        CE_RadioButtonLabel = 6,

        CE_TabBarTab = 7,
        CE_TabBarTabShape = 8,
        CE_TabBarTabLabel = 9,

        CE_ProgressBar = 10,
        CE_ProgressBarGroove = 11,
        CE_ProgressBarContents = 12,
        CE_ProgressBarLabel = 13,

        CE_MenuItem = 14,
        CE_MenuScroller = 15,
        CE_MenuVMargin = 16,
        CE_MenuHMargin = 17,
        CE_MenuTearoff = 18,
        CE_MenuEmptyArea = 19,

        CE_MenuBarItem = 20,
        CE_MenuBarEmptyArea = 21,

        CE_ToolButtonLabel = 22,

        CE_Header = 23,
        CE_HeaderSection = 24,
        CE_HeaderLabel = 25,

        CE_ToolBoxTab = 26,
        CE_SizeGrip = 27,
        CE_Splitter = 28,
        CE_RubberBand = 29,
        CE_DockWidgetTitle = 30,

        CE_ScrollBarAddLine = 31,
        CE_ScrollBarSubLine = 32,
        CE_ScrollBarAddPage = 33,
        CE_ScrollBarSubPage = 34,
        CE_ScrollBarSlider = 35,
        CE_ScrollBarFirst = 36,
        CE_ScrollBarLast = 37,

        CE_FocusFrame = 38,
        CE_ComboBoxLabel = 39,

        CE_ToolBar = 40,
        CE_ToolBoxTabShape = 41,
        CE_ToolBoxTabLabel = 42,
        CE_HeaderEmptyArea = 43,

        CE_ColumnViewGrip = 44,

        CE_ItemViewItem = 45,

        CE_ShapedFrame = 46,

        // do not add any values below/greater than this
        CE_CustomBase = 0xf0000000;
    

    /** enum QStyle::SubElement */
    public static final int
        SE_PushButtonContents = 0,
        SE_PushButtonFocusRect = 1,

        SE_CheckBoxIndicator = 2,
        SE_CheckBoxContents = 3,
        SE_CheckBoxFocusRect = 4,
        SE_CheckBoxClickRect = 5,

        SE_RadioButtonIndicator = 6,
        SE_RadioButtonContents = 7,
        SE_RadioButtonFocusRect = 8,
        SE_RadioButtonClickRect = 9,

        SE_ComboBoxFocusRect = 10,

        SE_SliderFocusRect = 11,

        SE_ProgressBarGroove = 12,
        SE_ProgressBarContents = 13,
        SE_ProgressBarLabel = 14,

        SE_ToolBoxTabContents = 15,

        SE_HeaderLabel = 16,
        SE_HeaderArrow = 17,

        SE_TabWidgetTabBar = 18,
        SE_TabWidgetTabPane = 19,
        SE_TabWidgetTabContents = 20,
        SE_TabWidgetLeftCorner = 21,
        SE_TabWidgetRightCorner = 22,

        SE_ItemViewItemCheckIndicator = 23,
// #if QT_DEPRECATED_SINCE(5, 13) // ### Qt 6: remove
// #endif
        SE_TabBarTearIndicator = 24,
        SE_TabBarTearIndicatorLeft = SE_TabBarTearIndicator,

        SE_TreeViewDisclosureItem = SE_TabBarTearIndicator + 1,

        SE_LineEditContents = SE_TabBarTearIndicator + 2,
        SE_FrameContents = SE_TabBarTearIndicator + 3,

        SE_DockWidgetCloseButton = SE_TabBarTearIndicator + 4,
        SE_DockWidgetFloatButton = SE_TabBarTearIndicator + 5,
        SE_DockWidgetTitleBarText = SE_TabBarTearIndicator + 6,
        SE_DockWidgetIcon = SE_TabBarTearIndicator + 7,

        SE_CheckBoxLayoutItem = SE_TabBarTearIndicator + 8,
        SE_ComboBoxLayoutItem = SE_TabBarTearIndicator + 9,
        SE_DateTimeEditLayoutItem = SE_TabBarTearIndicator + 10,
        SE_DialogButtonBoxLayoutItem = SE_TabBarTearIndicator + 11, // ### Qt 6: remove
        SE_LabelLayoutItem = SE_TabBarTearIndicator + 12,
        SE_ProgressBarLayoutItem = SE_TabBarTearIndicator + 13,
        SE_PushButtonLayoutItem = SE_TabBarTearIndicator + 14,
        SE_RadioButtonLayoutItem = SE_TabBarTearIndicator + 15,
        SE_SliderLayoutItem = SE_TabBarTearIndicator + 16,
        SE_SpinBoxLayoutItem = SE_TabBarTearIndicator + 17,
        SE_ToolButtonLayoutItem = SE_TabBarTearIndicator + 18,

        SE_FrameLayoutItem = SE_TabBarTearIndicator + 19,
        SE_GroupBoxLayoutItem = SE_TabBarTearIndicator + 20,
        SE_TabWidgetLayoutItem = SE_TabBarTearIndicator + 21,

        SE_ItemViewItemDecoration = SE_TabBarTearIndicator + 22,
        SE_ItemViewItemText = SE_TabBarTearIndicator + 23,
        SE_ItemViewItemFocusRect = SE_TabBarTearIndicator + 24,

        SE_TabBarTabLeftButton = SE_TabBarTearIndicator + 25,
        SE_TabBarTabRightButton = SE_TabBarTearIndicator + 26,
        SE_TabBarTabText = SE_TabBarTearIndicator + 27,

        SE_ShapedFrameContents = SE_TabBarTearIndicator + 28,

        SE_ToolBarHandle = SE_TabBarTearIndicator + 29,

        SE_TabBarScrollLeftButton = SE_TabBarTearIndicator + 30,
        SE_TabBarScrollRightButton = SE_TabBarTearIndicator + 31,
        SE_TabBarTearIndicatorRight = SE_TabBarTearIndicator + 32,

        // do not add any values below/greater than this
        SE_CustomBase = 0xf0000000;
    


    /** enum QStyle::ComplexControl */
    public static final int
        CC_SpinBox = 0,
        CC_ComboBox = 1,
        CC_ScrollBar = 2,
        CC_Slider = 3,
        CC_ToolButton = 4,
        CC_TitleBar = 5,
        CC_Dial = 6,
        CC_GroupBox = 7,
        CC_MdiControls = 8,

        // do not add any values below/greater than this
        CC_CustomBase = 0xf0000000;
    

    /** enum QStyle::SubControl */
    public static final int
        SC_None =                  0x00000000,

        SC_ScrollBarAddLine =      0x00000001,
        SC_ScrollBarSubLine =      0x00000002,
        SC_ScrollBarAddPage =      0x00000004,
        SC_ScrollBarSubPage =      0x00000008,
        SC_ScrollBarFirst =        0x00000010,
        SC_ScrollBarLast =         0x00000020,
        SC_ScrollBarSlider =       0x00000040,
        SC_ScrollBarGroove =       0x00000080,

        SC_SpinBoxUp =             0x00000001,
        SC_SpinBoxDown =           0x00000002,
        SC_SpinBoxFrame =          0x00000004,
        SC_SpinBoxEditField =      0x00000008,

        SC_ComboBoxFrame =         0x00000001,
        SC_ComboBoxEditField =     0x00000002,
        SC_ComboBoxArrow =         0x00000004,
        SC_ComboBoxListBoxPopup =  0x00000008,

        SC_SliderGroove =          0x00000001,
        SC_SliderHandle =          0x00000002,
        SC_SliderTickmarks =       0x00000004,

        SC_ToolButton =            0x00000001,
        SC_ToolButtonMenu =        0x00000002,

        SC_TitleBarSysMenu =       0x00000001,
        SC_TitleBarMinButton =     0x00000002,
        SC_TitleBarMaxButton =     0x00000004,
        SC_TitleBarCloseButton =   0x00000008,
        SC_TitleBarNormalButton =  0x00000010,
        SC_TitleBarShadeButton =   0x00000020,
        SC_TitleBarUnshadeButton = 0x00000040,
        SC_TitleBarContextHelpButton = 0x00000080,
        SC_TitleBarLabel =         0x00000100,

        SC_DialGroove =            0x00000001,
        SC_DialHandle =            0x00000002,
        SC_DialTickmarks =         0x00000004,

        SC_GroupBoxCheckBox =      0x00000001,
        SC_GroupBoxLabel =         0x00000002,
        SC_GroupBoxContents =      0x00000004,
        SC_GroupBoxFrame =         0x00000008,

        SC_MdiMinButton     =      0x00000001,
        SC_MdiNormalButton  =      0x00000002,
        SC_MdiCloseButton   =      0x00000004,

        SC_CustomBase =            0xf0000000,
        SC_All =                   0xffffffff;
    
//     #define Q_DECLARE_FLAGS(arg0, arg1)(SubControls, SubControl)

    /** enum QStyle::PixelMetric */
    public static final int
        PM_ButtonMargin = 0,
        PM_ButtonDefaultIndicator = 1,
        PM_MenuButtonIndicator = 2,
        PM_ButtonShiftHorizontal = 3,
        PM_ButtonShiftVertical = 4,

        PM_DefaultFrameWidth = 5,
        PM_SpinBoxFrameWidth = 6,
        PM_ComboBoxFrameWidth = 7,

        PM_MaximumDragDistance = 8,

        PM_ScrollBarExtent = 9,
        PM_ScrollBarSliderMin = 10,

        PM_SliderThickness = 11,             // total slider thickness
        PM_SliderControlThickness = 12,      // thickness of the business part
        PM_SliderLength = 13,                // total length of slider
        PM_SliderTickmarkOffset = 14,        //
        PM_SliderSpaceAvailable = 15,        // available space for slider to move

        PM_DockWidgetSeparatorExtent = 16,
        PM_DockWidgetHandleExtent = 17,
        PM_DockWidgetFrameWidth = 18,

        PM_TabBarTabOverlap = 19,
        PM_TabBarTabHSpace = 20,
        PM_TabBarTabVSpace = 21,
        PM_TabBarBaseHeight = 22,
        PM_TabBarBaseOverlap = 23,

        PM_ProgressBarChunkWidth = 24,

        PM_SplitterWidth = 25,
        PM_TitleBarHeight = 26,

        PM_MenuScrollerHeight = 27,
        PM_MenuHMargin = 28,
        PM_MenuVMargin = 29,
        PM_MenuPanelWidth = 30,
        PM_MenuTearoffHeight = 31,
        PM_MenuDesktopFrameWidth = 32,

        PM_MenuBarPanelWidth = 33,
        PM_MenuBarItemSpacing = 34,
        PM_MenuBarVMargin = 35,
        PM_MenuBarHMargin = 36,

        PM_IndicatorWidth = 37,
        PM_IndicatorHeight = 38,
        PM_ExclusiveIndicatorWidth = 39,
        PM_ExclusiveIndicatorHeight = 40,

        PM_DialogButtonsSeparator = 41,
        PM_DialogButtonsButtonWidth = 42,
        PM_DialogButtonsButtonHeight = 43,

        PM_MdiSubWindowFrameWidth = 44,
        PM_MdiSubWindowMinimizedWidth = 45,
// #if QT_DEPRECATED_SINCE(5, 13) // ### Qt 6: remove
// #endif

        PM_HeaderMargin = 46,
        PM_HeaderMarkSize = 47,
        PM_HeaderGripMargin = 48,
        PM_TabBarTabShiftHorizontal = 49,
        PM_TabBarTabShiftVertical = 50,
        PM_TabBarScrollButtonWidth = 51,

        PM_ToolBarFrameWidth = 52,
        PM_ToolBarHandleExtent = 53,
        PM_ToolBarItemSpacing = 54,
        PM_ToolBarItemMargin = 55,
        PM_ToolBarSeparatorExtent = 56,
        PM_ToolBarExtensionExtent = 57,

        PM_SpinBoxSliderHeight = 58,

        PM_DefaultTopLevelMargin = 59, // ### Qt 6: remove
        PM_DefaultChildMargin = 60,    // ### Qt 6: remove
        PM_DefaultLayoutSpacing = 61,  // ### Qt 6: remove

        PM_ToolBarIconSize = 62,
        PM_ListViewIconSize = 63,
        PM_IconViewIconSize = 64,
        PM_SmallIconSize = 65,
        PM_LargeIconSize = 66,

        PM_FocusFrameVMargin = 67,
        PM_FocusFrameHMargin = 68,

        PM_ToolTipLabelFrameWidth = 69,
        PM_CheckBoxLabelSpacing = 70,
        PM_TabBarIconSize = 71,
        PM_SizeGripSize = 72,
        PM_DockWidgetTitleMargin = 73,
        PM_MessageBoxIconSize = 74,
        PM_ButtonIconSize = 75,

        PM_DockWidgetTitleBarButtonMargin = 76,

        PM_RadioButtonLabelSpacing = 77,
        PM_LayoutLeftMargin = 78,
        PM_LayoutTopMargin = 79,
        PM_LayoutRightMargin = 80,
        PM_LayoutBottomMargin = 81,
        PM_LayoutHorizontalSpacing = 82,
        PM_LayoutVerticalSpacing = 83,
        PM_TabBar_ScrollButtonOverlap = 84,

        PM_TextCursorWidth = 85,

        PM_TabCloseIndicatorWidth = 86,
        PM_TabCloseIndicatorHeight = 87,

        PM_ScrollView_ScrollBarSpacing = 88,
        PM_ScrollView_ScrollBarOverlap = 89,
        PM_SubMenuOverlap = 90,
        PM_TreeViewIndentation = 91,

        PM_HeaderDefaultSectionSizeHorizontal = 92,
        PM_HeaderDefaultSectionSizeVertical = 93,

        PM_TitleBarButtonIconSize = 94,
        PM_TitleBarButtonSize = 95,

        // do not add any values below/greater than this
        PM_CustomBase = 0xf0000000;
    

    public native int pixelMetric(@Cast("QStyle::PixelMetric") int metric);

    /** enum QStyle::ContentsType */
    public static final int
        CT_PushButton = 0,
        CT_CheckBox = 1,
        CT_RadioButton = 2,
        CT_ToolButton = 3,
        CT_ComboBox = 4,
        CT_Splitter = 5,
        CT_ProgressBar = 6,
        CT_MenuItem = 7,
        CT_MenuBarItem = 8,
        CT_MenuBar = 9,
        CT_Menu = 10,
        CT_TabBarTab = 11,
        CT_Slider = 12,
        CT_ScrollBar = 13,
        CT_LineEdit = 14,
        CT_SpinBox = 15,
        CT_SizeGrip = 16,
        CT_TabWidget = 17,
        CT_DialogButtons = 18,
        CT_HeaderSection = 19,
        CT_GroupBox = 20,
        CT_MdiControls = 21,
        CT_ItemViewItem = 22,
        // do not add any values below/greater than this
        CT_CustomBase = 0xf0000000;
    

    /** enum QStyle::RequestSoftwareInputPanel */
    public static final int
        RSIP_OnMouseClickAndAlreadyFocused = 0,
        RSIP_OnMouseClick = 1;
    

    /** enum QStyle::StyleHint */
    public static final int
        SH_EtchDisabledText = 0,
        SH_DitherDisabledText = 1,
        SH_ScrollBar_MiddleClickAbsolutePosition = 2,
        SH_ScrollBar_ScrollWhenPointerLeavesControl = 3,
        SH_TabBar_SelectMouseType = 4,
        SH_TabBar_Alignment = 5,
        SH_Header_ArrowAlignment = 6,
        SH_Slider_SnapToValue = 7,
        SH_Slider_SloppyKeyEvents = 8,
        SH_ProgressDialog_CenterCancelButton = 9,
        SH_ProgressDialog_TextLabelAlignment = 10,
        SH_PrintDialog_RightAlignButtons = 11,
        SH_MainWindow_SpaceBelowMenuBar = 12,
        SH_FontDialog_SelectAssociatedText = 13,
        SH_Menu_AllowActiveAndDisabled = 14,
        SH_Menu_SpaceActivatesItem = 15,
        SH_Menu_SubMenuPopupDelay = 16,
        SH_ScrollView_FrameOnlyAroundContents = 17,
        SH_MenuBar_AltKeyNavigation = 18,
        SH_ComboBox_ListMouseTracking = 19,
        SH_Menu_MouseTracking = 20,
        SH_MenuBar_MouseTracking = 21,
        SH_ItemView_ChangeHighlightOnFocus = 22,
        SH_Widget_ShareActivation = 23,
        SH_Workspace_FillSpaceOnMaximize = 24,
        SH_ComboBox_Popup = 25,
        SH_TitleBar_NoBorder = 26,
        SH_Slider_StopMouseOverSlider = 27,
// #if QT_DEPRECATED_SINCE(5, 13) // ### Qt 6: remove
// #endif
        SH_BlinkCursorWhenTextSelected = 28,
        SH_RichText_FullWidthSelection = 29,
        SH_Menu_Scrollable = 30,
        SH_GroupBox_TextLabelVerticalAlignment = 31,
        SH_GroupBox_TextLabelColor = 32,
        SH_Menu_SloppySubMenus = 33,
        SH_Table_GridLineColor = 34,
        SH_LineEdit_PasswordCharacter = 35,
        SH_DialogButtons_DefaultButton = 36,
        SH_ToolBox_SelectedPageTitleBold = 37,
        SH_TabBar_PreferNoArrows = 38,
        SH_ScrollBar_LeftClickAbsolutePosition = 39,
        SH_ListViewExpand_SelectMouseType = 40,
        SH_UnderlineShortcut = 41,
        SH_SpinBox_AnimateButton = 42,
        SH_SpinBox_KeyPressAutoRepeatRate = 43,
        SH_SpinBox_ClickAutoRepeatRate = 44,
        SH_Menu_FillScreenWithScroll = 45,
        SH_ToolTipLabel_Opacity = 46,
        SH_DrawMenuBarSeparator = 47,
        SH_TitleBar_ModifyNotification = 48,
        SH_Button_FocusPolicy = 49,
        SH_MessageBox_UseBorderForButtonSpacing = 50,
        SH_TitleBar_AutoRaise = 51,
        SH_ToolButton_PopupDelay = 52,
        SH_FocusFrame_Mask = 53,
        SH_RubberBand_Mask = 54,
        SH_WindowFrame_Mask = 55,
        SH_SpinControls_DisableOnBounds = 56,
        SH_Dial_BackgroundRole = 57,
        SH_ComboBox_LayoutDirection = 58,
        SH_ItemView_EllipsisLocation = 59,
        SH_ItemView_ShowDecorationSelected = 60,
        SH_ItemView_ActivateItemOnSingleClick = 61,
        SH_ScrollBar_ContextMenu = 62,
        SH_ScrollBar_RollBetweenButtons = 63,
        SH_Slider_AbsoluteSetButtons = 64,
        SH_Slider_PageSetButtons = 65,
        SH_Menu_KeyboardSearch = 66,
        SH_TabBar_ElideMode = 67,
        SH_DialogButtonLayout = 68,
        SH_ComboBox_PopupFrameStyle = 69,
        SH_MessageBox_TextInteractionFlags = 70,
        SH_DialogButtonBox_ButtonsHaveIcons = 71,
        SH_SpellCheckUnderlineStyle = 72,
        SH_MessageBox_CenterButtons = 73,
        SH_Menu_SelectionWrap = 74,
        SH_ItemView_MovementWithoutUpdatingSelection = 75,
        SH_ToolTip_Mask = 76,
        SH_FocusFrame_AboveWidget = 77,
        SH_TextControl_FocusIndicatorTextCharFormat = 78,
        SH_WizardStyle = 79,
        SH_ItemView_ArrowKeysNavigateIntoChildren = 80,
        SH_Menu_Mask = 81,
        SH_Menu_FlashTriggeredItem = 82,
        SH_Menu_FadeOutOnHide = 83,
        SH_SpinBox_ClickAutoRepeatThreshold = 84,
        SH_ItemView_PaintAlternatingRowColorsForEmptyArea = 85,
        SH_FormLayoutWrapPolicy = 86,
        SH_TabWidget_DefaultTabPosition = 87,
        SH_ToolBar_Movable = 88,
        SH_FormLayoutFieldGrowthPolicy = 89,
        SH_FormLayoutFormAlignment = 90,
        SH_FormLayoutLabelAlignment = 91,
        SH_ItemView_DrawDelegateFrame = 92,
        SH_TabBar_CloseButtonPosition = 93,
        SH_DockWidget_ButtonsHaveFrame = 94,
        SH_ToolButtonStyle = 95,
        SH_RequestSoftwareInputPanel = 96,
        SH_ScrollBar_Transient = 97,
        SH_Menu_SupportsSections = 98,
        SH_ToolTip_WakeUpDelay = 99,
        SH_ToolTip_FallAsleepDelay = 100,
        SH_Widget_Animate = 101,
        SH_Splitter_OpaqueResize = 102,
        // Whether we should use a native popup.
        // Only supported for non-editable combo boxes on Mac OS X so far.
        SH_ComboBox_UseNativePopup = 103,
        SH_LineEdit_PasswordMaskDelay = 104,
        SH_TabBar_ChangeCurrentDelay = 105,
        SH_Menu_SubMenuUniDirection = 106,
        SH_Menu_SubMenuUniDirectionFailCount = 107,
        SH_Menu_SubMenuSloppySelectOtherActions = 108,
        SH_Menu_SubMenuSloppyCloseTimeout = 109,
        SH_Menu_SubMenuResetWhenReenteringParent = 110,
        SH_Menu_SubMenuDontStartSloppyOnLeave = 111,
        SH_ItemView_ScrollMode = 112,
        SH_TitleBar_ShowToolTipsOnButtons = 113,
        SH_Widget_Animation_Duration = 114,
        SH_ComboBox_AllowWheelScrolling = 115,
        SH_SpinBox_ButtonsInsideFrame = 116,
        SH_SpinBox_StepModifier = 117,
        // Add new style hint values here

        SH_CustomBase = 0xf0000000;
    

    public native int styleHint(@Cast("QStyle::StyleHint") int stylehint);

    /** enum QStyle::StandardPixmap */
    public static final int
        SP_TitleBarMenuButton = 0,
        SP_TitleBarMinButton = 1,
        SP_TitleBarMaxButton = 2,
        SP_TitleBarCloseButton = 3,
        SP_TitleBarNormalButton = 4,
        SP_TitleBarShadeButton = 5,
        SP_TitleBarUnshadeButton = 6,
        SP_TitleBarContextHelpButton = 7,
        SP_DockWidgetCloseButton = 8,
        SP_MessageBoxInformation = 9,
        SP_MessageBoxWarning = 10,
        SP_MessageBoxCritical = 11,
        SP_MessageBoxQuestion = 12,
        SP_DesktopIcon = 13,
        SP_TrashIcon = 14,
        SP_ComputerIcon = 15,
        SP_DriveFDIcon = 16,
        SP_DriveHDIcon = 17,
        SP_DriveCDIcon = 18,
        SP_DriveDVDIcon = 19,
        SP_DriveNetIcon = 20,
        SP_DirOpenIcon = 21,
        SP_DirClosedIcon = 22,
        SP_DirLinkIcon = 23,
        SP_DirLinkOpenIcon = 24,
        SP_FileIcon = 25,
        SP_FileLinkIcon = 26,
        SP_ToolBarHorizontalExtensionButton = 27,
        SP_ToolBarVerticalExtensionButton = 28,
        SP_FileDialogStart = 29,
        SP_FileDialogEnd = 30,
        SP_FileDialogToParent = 31,
        SP_FileDialogNewFolder = 32,
        SP_FileDialogDetailedView = 33,
        SP_FileDialogInfoView = 34,
        SP_FileDialogContentsView = 35,
        SP_FileDialogListView = 36,
        SP_FileDialogBack = 37,
        SP_DirIcon = 38,
        SP_DialogOkButton = 39,
        SP_DialogCancelButton = 40,
        SP_DialogHelpButton = 41,
        SP_DialogOpenButton = 42,
        SP_DialogSaveButton = 43,
        SP_DialogCloseButton = 44,
        SP_DialogApplyButton = 45,
        SP_DialogResetButton = 46,
        SP_DialogDiscardButton = 47,
        SP_DialogYesButton = 48,
        SP_DialogNoButton = 49,
        SP_ArrowUp = 50,
        SP_ArrowDown = 51,
        SP_ArrowLeft = 52,
        SP_ArrowRight = 53,
        SP_ArrowBack = 54,
        SP_ArrowForward = 55,
        SP_DirHomeIcon = 56,
        SP_CommandLink = 57,
        SP_VistaShield = 58,
        SP_BrowserReload = 59,
        SP_BrowserStop = 60,
        SP_MediaPlay = 61,
        SP_MediaStop = 62,
        SP_MediaPause = 63,
        SP_MediaSkipForward = 64,
        SP_MediaSkipBackward = 65,
        SP_MediaSeekForward = 66,
        SP_MediaSeekBackward = 67,
        SP_MediaVolume = 68,
        SP_MediaVolumeMuted = 69,
        SP_LineEditClearButton = 70,
        // do not add any values below/greater than this
        SP_CustomBase = 0xf0000000;
    

    public native @ByVal QIcon standardIcon(@Cast("QStyle::StandardPixmap") int standardIcon);
    public static native int sliderPositionFromValue(int min, int max, int val, int space,
                                           @Cast("bool") boolean upsideDown/*=false*/);
    public static native int sliderPositionFromValue(int min, int max, int val, int space);
    public static native int sliderValueFromPosition(int min, int max, int pos, int space,
                                           @Cast("bool") boolean upsideDown/*=false*/);
    public static native int sliderValueFromPosition(int min, int max, int pos, int space);
    public static native @ByVal @Cast("Qt::Alignment") int visualAlignment(@Cast("Qt::LayoutDirection") int direction, @ByVal @Cast("Qt::Alignment") int alignment);

    public native int layoutSpacing(QSizePolicy.ControlType control1,
                                  QSizePolicy.ControlType control2, Orientation orientation);

    public native @Const QStyle proxy();
}
