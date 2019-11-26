// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ale.global;

import org.bytedeco.ale.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class ale extends org.bytedeco.ale.presets.ale {
    static { Loader.load(); }

// Parsed from emucore/m6502/src/bspf/src/bspf.hxx

//============================================================================
//
//  BBBBB    SSSS   PPPPP   FFFFFF 
//  BB  BB  SS  SS  PP  PP  FF
//  BB  BB  SS      PP  PP  FF
//  BBBBB    SSSS   PPPPP   FFFF    --  "Brad's Simple Portability Framework"
//  BB  BB      SS  PP      FF
//  BB  BB  SS  SS  PP      FF
//  BBBBB    SSSS   PP      FF
//
// Copyright (c) 1997-1998 by Bradford W. Mott
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: bspf.hxx,v 1.17 2007/07/31 15:46:21 stephena Exp $
//============================================================================

// #ifndef BSPF_HXX
// #define BSPF_HXX

/**
  This file defines various basic data types and preprocessor variables
  that need to be defined for different operating systems.
  <p>
  @author Bradford W. Mott
  @version $Id: bspf.hxx,v 1.17 2007/07/31 15:46:21 stephena Exp $
*/

// Types for 8-bit signed and unsigned integers

// Types for 16-bit signed and unsigned integers

// Types for 32-bit signed and unsigned integers

// The following code should provide access to the standard C++ objects and
// types: cerr, cerr, string, ostream, istream, etc.
// #ifdef BSPF_OLD_STYLE_CXX_HEADERS
//   #include <iostream.h>
//   #include <iomanip.h>
//   #include <string.h>
// #else
//   #include <iostream>
//   #include <iomanip>
//   #include <string>
// #endif
	
// #ifdef HAVE_INTTYPES
//   #include <inttypes.h>
// #endif

// Defines to help with path handling
//ALE  #if defined BSPF_UNIX
public static final String BSPF_PATH_SEPARATOR =  "/";
//ALE  #elif (defined(BSPF_DOS) || defined(BSPF_WIN32) || defined(BSPF_OS2))
//ALE    #define BSPF_PATH_SEPARATOR  "\\"
//ALE  #elif defined BSPF_MAC_OSX
//ALE    #define BSPF_PATH_SEPARATOR  "/"
//ALE  #elif defined BSPF_GP2X
//ALE      #define BSPF_PATH_SEPARATOR  "/"
//ALE  #endif

// I wish Windows had a complete POSIX layer
// #ifdef BSPF_WIN32
//   #define BSPF_strcasecmp stricmp
//   #define BSPF_strncasecmp strnicmp
//   #define BSPF_isblank(c) ((c == ' ') || (c == '\t'))
//   #define BSPF_snprintf _snprintf
//   #define BSPF_vsnprintf _vsnprintf
// #else
//   #define BSPF_strcasecmp strcasecmp
//   #define BSPF_strncasecmp strncasecmp
//   #define BSPF_isblank(c) isblank(c)
//   #define BSPF_snprintf snprintf
//   #define BSPF_vsnprintf vsnprintf
// #endif

// Some convenience functions

// #ifdef _WIN32_WCE
//   #include "missing.h"
// #endif

// #endif


// Parsed from emucore/m6502/src/Device.hxx

//============================================================================
//
// MM     MM  6666  555555  0000   2222
// MMMM MMMM 66  66 55     00  00 22  22
// MM MMM MM 66     55     00  00     22
// MM  M  MM 66666  55555  00  00  22222  --  "A 6502 Microprocessor Emulator"
// MM     MM 66  66     55 00  00 22
// MM     MM 66  66 55  55 00  00 22
// MM     MM  6666   5555   0000  222222
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: Device.hxx,v 1.6 2007/01/14 16:17:57 stephena Exp $
//============================================================================

// #ifndef DEVICE_HXX
// #define DEVICE_HXX
// Targeting ../System.java


// Targeting ../Serializer.java


// Targeting ../Deserializer.java



// #include "bspf/src/bspf.hxx"
// Targeting ../Device.java



// #endif


// Parsed from emucore/Control.hxx

//============================================================================
//
//   SSSS    tt          lll  lll       
//  SS  SS   tt           ll   ll        
//  SS     tttttt  eeee   ll   ll   aaaa 
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: Control.hxx,v 1.9 2007/02/22 02:15:46 stephena Exp $
//============================================================================

// #ifndef CONTROLLER_HXX
// #define CONTROLLER_HXX

// #include "m6502/src/bspf/src/bspf.hxx"
// Targeting ../Controller.java



// #endif


// Parsed from emucore/Event.hxx

//============================================================================
//
//   SSSS    tt          lll  lll       
//  SS  SS   tt           ll   ll        
//  SS     tttttt  eeee   ll   ll   aaaa 
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: Event.hxx,v 1.28 2007/01/30 17:13:07 stephena Exp $
//============================================================================

// #ifndef EVENT_HXX
// #define EVENT_HXX

// #include "m6502/src/bspf/src/bspf.hxx"
// Targeting ../Event.java



// #endif


// Parsed from emucore/Random.hxx

//============================================================================
//
//   SSSS    tt          lll  lll
//  SS  SS   tt           ll   ll
//  SS     tttttt  eeee   ll   ll   aaaa
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: Random.hxx,v 1.4 2007/01/01 18:04:49 stephena Exp $
//============================================================================

// #ifndef RANDOM_HXX
// #define RANDOM_HXX

// #include "m6502/src/bspf/src/bspf.hxx"
// Targeting ../Random.java


// #endif



// Parsed from common/Constants.h

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  common_constants.h
 *
 *  Defines a set of constants used by various parts of the player agent code
 *
 **************************************************************************** */

// #ifndef __CONSTANTS_H__
// #define __CONSTANTS_H__

// #include <cassert>
// #include <vector>
// #include <valarray>
// #include <cstdlib>
// #include "../emucore/m6502/src/bspf/src/bspf.hxx"


// Define actions
/** enum Action */
public static final int
    PLAYER_A_NOOP           = 0,
    PLAYER_A_FIRE           = 1,
    PLAYER_A_UP             = 2,
    PLAYER_A_RIGHT          = 3,
    PLAYER_A_LEFT           = 4,
    PLAYER_A_DOWN           = 5,
    PLAYER_A_UPRIGHT        = 6,
    PLAYER_A_UPLEFT         = 7,
    PLAYER_A_DOWNRIGHT      = 8,
    PLAYER_A_DOWNLEFT       = 9,
    PLAYER_A_UPFIRE         = 10,
    PLAYER_A_RIGHTFIRE      = 11,
    PLAYER_A_LEFTFIRE       = 12,
    PLAYER_A_DOWNFIRE       = 13,
    PLAYER_A_UPRIGHTFIRE    = 14,
    PLAYER_A_UPLEFTFIRE     = 15,
    PLAYER_A_DOWNRIGHTFIRE  = 16,
    PLAYER_A_DOWNLEFTFIRE   = 17,
    PLAYER_B_NOOP           = 18,
    PLAYER_B_FIRE           = 19,
    PLAYER_B_UP             = 20,
    PLAYER_B_RIGHT          = 21,
    PLAYER_B_LEFT           = 22,
    PLAYER_B_DOWN           = 23,
    PLAYER_B_UPRIGHT        = 24,
    PLAYER_B_UPLEFT         = 25,
    PLAYER_B_DOWNRIGHT      = 26,
    PLAYER_B_DOWNLEFT       = 27,
    PLAYER_B_UPFIRE         = 28,
    PLAYER_B_RIGHTFIRE      = 29,
    PLAYER_B_LEFTFIRE       = 30,
    PLAYER_B_DOWNFIRE       = 31,
    PLAYER_B_UPRIGHTFIRE    = 32,
    PLAYER_B_UPLEFTFIRE     = 33,
    PLAYER_B_DOWNRIGHTFIRE  = 34,
    PLAYER_B_DOWNLEFTFIRE   = 35,
    RESET                   = 40, // MGB: Use SYSTEM_RESET to reset the environment. 
    UNDEFINED               = 41,
    RANDOM                  = 42,
    SAVE_STATE              = 43,
    LOAD_STATE              = 44,
    SYSTEM_RESET            = 45,
    LAST_ACTION_INDEX       = 50;

public static final int PLAYER_A_MAX = (18);
public static final int PLAYER_B_MAX = (36);

public static native @StdString BytePointer action_to_string(@Cast("Action") int a);

//  Define datatypes

// mode type

// difficulty type

// reward type for RL interface

// Other constant values
public static final int RAM_LENGTH = 128;

// #endif // __CONSTANTS_H__



// Parsed from common/Array.hxx

//============================================================================
//
//   SSSS    tt          lll  lll       
//  SS  SS   tt           ll   ll        
//  SS     tttttt  eeee   ll   ll   aaaa 
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: Array.hxx,v 1.4 2007/01/01 18:04:39 stephena Exp $
//
//   Based on code from ScummVM - Scumm Interpreter
//   Copyright (C) 2002-2004 The ScummVM project
//============================================================================

// #ifndef ARRAY_HXX
// #define ARRAY_HXX

// #include <assert.h>

// #include "../emucore/m6502/src/bspf/src/bspf.hxx"
// Targeting ../ResolutionList.java



  // Namespace GUI

// #endif


// Parsed from common/display_screen.h

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare, 
 *   Matthew Hausknecht, and the Reinforcement Learning and Artificial Intelligence 
 *   Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  diplay_screen.cpp 
 *
 *  Supports displaying the screen via SDL. 
 **************************************************************************** */

// #ifndef DISPLAY_SCREEN_H
// #define DISPLAY_SCREEN_H

// #include <stdio.h>
// #include <stdlib.h>

// #include "Constants.h"
// #include "ColourPalette.hpp"
// #include "../emucore/MediaSrc.hxx"

// #ifdef __USE_SDL
// #include "SDL.h"
// Targeting ../DisplayScreen.java


// #else
/** A dummy class that simply ignores display events. */
// #endif // __USE_SDL

// #endif // DISPLAY_SCREEN


// Parsed from emucore/M6532.hxx

//============================================================================
//
//   SSSS    tt          lll  lll       
//  SS  SS   tt           ll   ll        
//  SS     tttttt  eeee   ll   ll   aaaa 
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: M6532.hxx,v 1.5 2007/01/01 18:04:48 stephena Exp $
//============================================================================

// #ifndef M6532_HXX
// #define M6532_HXX

// #include "m6502/src/bspf/src/bspf.hxx"
// #include "m6502/src/Device.hxx"
// #include "Random.hxx"
// Targeting ../M6532.java


// #endif



// Parsed from emucore/Cart.hxx

//============================================================================
//
//   SSSS    tt          lll  lll       
//  SS  SS   tt           ll   ll        
//  SS     tttttt  eeee   ll   ll   aaaa 
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: Cart.hxx,v 1.19 2007/06/14 13:47:50 stephena Exp $
//============================================================================

// #ifndef CARTRIDGE_HXX
// #define CARTRIDGE_HXX

// #include <fstream>
// #include "m6502/src/bspf/src/bspf.hxx"
// #include "m6502/src/Device.hxx"
// #include "../common/Log.hpp"
// Targeting ../Cartridge.java



// #endif


// Parsed from emucore/Console.hxx

//============================================================================
//
//   SSSS    tt          lll  lll       
//  SS  SS   tt           ll   ll        
//  SS     tttttt  eeee   ll   ll   aaaa 
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: Console.hxx,v 1.61 2007/07/27 13:49:16 stephena Exp $
//============================================================================

// #ifndef CONSOLE_HXX
// #define CONSOLE_HXX
// Targeting ../MediaSource.java


// Targeting ../Switches.java



// #include "m6502/src/bspf/src/bspf.hxx"
// #include "Control.hxx"
// #include "Props.hxx"
// #include "TIA.hxx"
// #include "Cart.hxx"
// #include "M6532.hxx"
// #include "AtariVox.hxx"
// Targeting ../Console.java



// #endif


// Parsed from emucore/Sound.hxx

//============================================================================
//
//   SSSS    tt          lll  lll       
//  SS  SS   tt           ll   ll        
//  SS     tttttt  eeee   ll   ll   aaaa 
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: Sound.hxx,v 1.23 2007/01/01 18:04:50 stephena Exp $
//============================================================================

// #ifndef SOUND_HXX
// #define SOUND_HXX

// #include "m6502/src/bspf/src/bspf.hxx"
// Targeting ../Sound.java



// #endif


// Parsed from emucore/Settings.hxx

//============================================================================
//
//   SSSS    tt          lll  lll       
//  SS  SS   tt           ll   ll        
//  SS     tttttt  eeee   ll   ll   aaaa 
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: Settings.hxx,v 1.33 2007/07/27 13:49:16 stephena Exp $
//============================================================================

// #ifndef SETTINGS_HXX
// #define SETTINGS_HXX

// #include <map>
// #include <stdexcept>

// #include "../common/Array.hxx"
// #include "m6502/src/bspf/src/bspf.hxx"
// Targeting ../Settings.java



// #endif


// Parsed from emucore/OSystem.hxx

//============================================================================
//
//   SSSS    tt          lll  lll       
//  SS  SS   tt           ll   ll        
//  SS     tttttt  eeee   ll   ll   aaaa 
//   SSSS    tt   ee  ee  ll   ll      aa
//      SS   tt   eeeeee  ll   ll   aaaaa  --  "An Atari 2600 VCS Emulator"
//  SS  SS   tt   ee      ll   ll  aa  aa
//   SSSS     ttt  eeeee llll llll  aaaaa
//
// Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
//
// See the file "license" for information on usage and redistribution of
// this file, and for a DISCLAIMER OF ALL WARRANTIES.
//
// $Id: OSystem.hxx,v 1.55 2007/08/12 23:05:12 stephena Exp $
//============================================================================

// #ifndef OSYSTEM_HXX
// #define OSYSTEM_HXX
// #include "../common/Array.hxx"
//ALE  #include "EventHandler.hxx"
//ALE  #include "FrameBuffer.hxx"
// #include "Sound.hxx"
// #include "../common/SoundNull.hxx"
// #include "Settings.hxx"
// #include "Console.hxx"
// #include "Event.hxx"  //ALE 
//ALE  #include "Font.hxx"
// #include "m6502/src/bspf/src/bspf.hxx"
// #include "../common/display_screen.h" 
// #include "../common/ColourPalette.hpp"
// #include "../common/ScreenExporter.hpp"
// #include "../common/Log.hpp"
// Targeting ../Resolution.java


// Targeting ../OSystem.java



// #endif


// Parsed from common/ColourPalette.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ColourPalette.hpp 
 *
 *  Enables conversion from NTSC/SECAM/PAL to RGB via the OSystem's palette.
 **************************************************************************** */

// #ifndef __COLOUR_PALETTE_HPP__
// #define __COLOUR_PALETTE_HPP__ 

// #include <vector>
// #include <string>
// Include obscure header file for uInt32 definition
// #include "../emucore/m6502/src/bspf/src/bspf.hxx"
// Targeting ../ColourPalette.java



// #endif // __COLOUR_PALETTE_HPP__ 




// Parsed from common/ScreenExporter.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ScreenExporter.hpp 
 *
 *  A class for exporting Atari 2600 frames as PNGs.
 *
 **************************************************************************** */

// #ifndef __SCREEN_EXPORTER_HPP__
// #define __SCREEN_EXPORTER_HPP__ 

// #include <string>
// #include "display_screen.h"
// #include "../environment/ale_screen.hpp"
// Targeting ../ScreenExporter.java



// #endif // __SCREEN_EXPORTER_HPP__ 





// Parsed from environment/ale_ram.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ale_ram.hpp
 *
 *  A class that encapsulates the Atari 2600 RAM. Code is provided inline for
 *   efficiency reasonss.
 *  
 **************************************************************************** */

// #ifndef __ALE_RAM_HPP__
// #define __ALE_RAM_HPP__

// #include <string.h>

public static final int RAM_SIZE = (128);
// Targeting ../ALERAM.java











// Byte accessors 




// #endif // __ALE_RAM_HPP__



// Parsed from environment/ale_screen.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ale_screen.hpp
 *
 *  A class that encapsulates an Atari 2600 screen. Code is provided inline for
 *   efficiency reasons.
 *  
 **************************************************************************** */

// #ifndef __ALE_SCREEN_HPP__
// #define __ALE_SCREEN_HPP__

// #include <cassert>
// #include <cstring>
// #include <memory>
// #include <vector>
// Targeting ../ALEScreen.java











// pixel accessors, (row, column)-ordered




// Access a whole row



// #endif // __ALE_SCREEN_HPP__



// Parsed from environment/ale_state.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ale_state.hpp
 *
 *  A class that stores a copy of the current ALE state. We use one to keep track
 *   of paddle resistance and in search trees.
 *  
 **************************************************************************** */

// #ifndef __ALE_STATE_HPP__ 
// #define __ALE_STATE_HPP__

// #include "../emucore/OSystem.hxx"
// #include "../emucore/Event.hxx"
// #include <string>
// #include "../common/Log.hpp"
// Targeting ../RomSettings.java



public static final int PADDLE_DELTA = 23000;
// MGB Values taken from Paddles.cxx (Stella 3.3) - 1400000 * [5,235] / 255
public static final int PADDLE_MIN = 27450;
// MGB - was 1290196; updated to 790196... seems to be fine for breakout and pong; 
//  avoids pong paddle going off screen
public static final int PADDLE_MAX = 790196; 
public static final int PADDLE_DEFAULT_VALUE = (((PADDLE_MAX - PADDLE_MIN) / 2) + PADDLE_MIN);
// Targeting ../ALEState.java



// #endif // __ALE_STATE_HPP__



// Parsed from environment/stella_environment_wrapper.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  stella_environment_wrapper.hpp
 *
 * Method wrapper for StellaEnvironment.
 *  
 **************************************************************************** */

// #ifndef __STELLA_ENVIRONMENT_WRAPPER_HPP__ 
// #define __STELLA_ENVIRONMENT_WRAPPER_HPP__

// #include "../common/Constants.h"
// Targeting ../StellaEnvironmentWrapper.java



// #endif // __STELLA_ENVIRONMENT_WRAPPER_HPP__



// Parsed from environment/stella_environment.hpp

/* *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  stella_environment.hpp
 *
 *  A class that wraps around the Stella core to provide users with a typical
 *  reinforcement learning environment interface.
 *  
 **************************************************************************** */

// #ifndef __STELLA_ENVIRONMENT_HPP__ 
// #define __STELLA_ENVIRONMENT_HPP__

// #include "ale_ram.hpp"
// #include "ale_screen.hpp"
// #include "ale_state.hpp"
// #include "phosphor_blend.hpp"
// #include "stella_environment_wrapper.hpp"
// #include "../emucore/Event.hxx"
// #include "../emucore/OSystem.hxx"
// #include "../games/RomSettings.hpp"
// #include "../common/Constants.h"
// #include "../common/Log.hpp"
// #include "../common/ScreenExporter.hpp"

// #include <stack>
// #include <memory>
// Targeting ../StellaEnvironment.java



// #endif // __STELLA_ENVIRONMENT_HPP__


// Parsed from ale_interface.hpp

/* *****************************************************************************
 * The line 99 is based on Xitari's code, from Google Inc.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License version 2
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 * *****************************************************************************
 * A.L.E (Arcade Learning Environment)
 * Copyright (c) 2009-2013 by Yavar Naddaf, Joel Veness, Marc G. Bellemare and 
 *   the Reinforcement Learning and Artificial Intelligence Laboratory
 * Released under the GNU General Public License; see License.txt for details. 
 *
 * Based on: Stella  --  "An Atari 2600 VCS Emulator"
 * Copyright (c) 1995-2007 by Bradford W. Mott and the Stella team
 *
 * *****************************************************************************
 *  ale_interface.hpp
 *
 *  The shared library interface.
 **************************************************************************** */
// #ifndef __ALE_INTERFACE_HPP__
// #define __ALE_INTERFACE_HPP__

// #include "emucore/FSNode.hxx"
// #include "emucore/OSystem.hxx"
// #include "os_dependent/SettingsWin32.hxx"
// #include "os_dependent/OSystemWin32.hxx"
// #include "os_dependent/SettingsUNIX.hxx"
// #include "os_dependent/OSystemUNIX.hxx"
// #include "games/Roms.hpp"
// #include "common/display_screen.h"
// #include "environment/stella_environment.hpp"
// #include "common/ScreenExporter.hpp"
// #include "common/Log.hpp"

// #include <string>
// #include <memory>

@MemberGetter public static native @StdString BytePointer Version();
// Targeting ../ALEInterface.java



// #endif


}
