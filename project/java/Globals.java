/*
    SDL - Simple DirectMedia Layer
    Copyright (C) 1997-2011 Sam Lantinga
    Java source code (C) 2009-2011 Sergii Pylypenko

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.
*/

package net.sourceforge.clonekeenplus;

import android.app.Activity;
import android.content.Context;
import java.util.Vector;
import android.view.KeyEvent;

class Globals {
	// These config options are modified by ChangeAppsettings.sh script - see the detailed descriptions there
	public static String ApplicationName = "CommanderGenius";
	public static String AppLibraries[] = { "sdl-1.2", };
	public static final boolean Using_SDL_1_3 = false;
	public static String DataDownloadUrl = "Data files are 2 Mb|https://sourceforge.net/projects/libsdl-android/files/CommanderGenius/commandergenius-data.zip/download^High-quality GFX and music - 40 Mb|https://sourceforge.net/projects/libsdl-android/files/CommanderGenius/commandergenius-hqp.zip/download";
	public static boolean NeedDepthBuffer = false;
	public static boolean SwVideoMode = false;
	public static boolean HorizontalOrientation = true;
	public static boolean InhibitSuspend = false;
	public static String ReadmeText = "^You may press \"Home\" now - the data will be downloaded in background".replace("^","\n");
	public static String CommandLine = "";
	public static boolean AppUsesMouse = false;
	public static boolean AppNeedsTwoButtonMouse = false;
	public static boolean AppNeedsArrowKeys = true;
	public static boolean AppNeedsTextInput = true;
	public static boolean AppUsesJoystick = false;
	public static boolean AppHandlesJoystickSensitivity = false;
	public static boolean AppUsesMultitouch = false;
	public static boolean NonBlockingSwapBuffers = false;
	public static int AppTouchscreenKeyboardKeysAmount = 4;
	public static int AppTouchscreenKeyboardKeysAmountAutoFire = 1;
	public static int StartupMenuButtonTimeout = 3000;
	public static Settings.Menu HiddenMenuOptions [] = {};
	// Not configurable yet through ChangeAppSettings.sh
	public static Settings.Menu FirstStartMenuOptions [] = { (AppUsesMouse ? new Settings.DisplaySizeConfig(true) : new Settings.DummyMenu()), new Settings.OptionalDownloadConfig(true) };

	// Phone-specific config, modified by user in "Change phone config" startup dialog, TODO: move this to settings
	public static boolean DownloadToSdcard = true;
	public static boolean PhoneHasTrackball = false;
	public static boolean PhoneHasArrowKeys = false;
	public static boolean UseAccelerometerAsArrowKeys = false;
	public static boolean UseTouchscreenKeyboard = true;
	public static int TouchscreenKeyboardSize = 1;
	public static int TouchscreenKeyboardTheme = 2;
	public static int TouchscreenKeyboardTransparency = 2;
	public static int AccelerometerSensitivity = 2;
	public static int AccelerometerCenterPos = 2;
	public static int TrackballDampening = 0;
	public static int AudioBufferConfig = 0;
	public static boolean OptionalDataDownload[] = null;
	public static int LeftClickMethod = AppNeedsTwoButtonMouse ? Mouse.LEFT_CLICK_WITH_TAP_OR_TIMEOUT : Mouse.LEFT_CLICK_NORMAL;
	public static int LeftClickKey = KeyEvent.KEYCODE_DPAD_CENTER;
	public static int LeftClickTimeout = 3;
	public static int RightClickTimeout = 4;
	public static int RightClickMethod = AppNeedsTwoButtonMouse ? Mouse.RIGHT_CLICK_WITH_MULTITOUCH : Mouse.RIGHT_CLICK_NONE;
	public static int RightClickKey = KeyEvent.KEYCODE_MENU;
	public static boolean MoveMouseWithJoystick = false;
	public static int MoveMouseWithJoystickSpeed = 0;
	public static int MoveMouseWithJoystickAccel = 0;
	public static boolean ClickMouseWithDpad = false;
	public static boolean RelativeMouseMovement = AppNeedsTwoButtonMouse; // Laptop touchpad mode
	public static int RelativeMouseMovementSpeed = 2;
	public static int RelativeMouseMovementAccel = 0;
	public static boolean ShowScreenUnderFinger = false;
	public static boolean KeepAspectRatio = false;
	public static int ClickScreenPressure = 0;
	public static int ClickScreenTouchspotSize = 0;
	public static int RemapHwKeycode[] = new int[SDL_Keys.JAVA_KEYCODE_LAST];
	public static int RemapScreenKbKeycode[] = new int[6];
	public static boolean ScreenKbControlsShown[] = new boolean[8]; /* Also joystick and text input button added */
	public static int ScreenKbControlsLayout[][] = new int[8][4];
	public static int RemapMultitouchGestureKeycode[] = new int[4];
	public static boolean MultitouchGesturesUsed[] = new boolean[4];
	public static int MultitouchGestureSensitivity = 1;
	public static int TouchscreenCalibration[] = new int[4];
	public static String DataDir = new String("");
	public static boolean SmoothVideo = false;
	public static boolean MultiThreadedVideo = false;
}
