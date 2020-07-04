
# WheelView  
  
  
  
```  
     wheelView.titles = listOf("Android", "IOS", "Mac", "Windows")  
```  
  
  
# BlobBackgroundLayout  
Android Layout Library with animated Blob Background  
  
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0) [![Release](https://jitpack.io/v/psuzn/WheelView.svg)] (https://jitpack.io/#psuzn/WheelView) [![API](https://img.shields.io/badge/API-19%2B-blue.svg?style=flat)](https://source.android.com/setup/start/build-numbers)  
  <br>
<img id="mode" src="https://drive.google.com/uc?export=view&id=11CQKcX7M9PBXxUKBkYdWBRzF3Fi1oZ2J" width="200" />&ensp;&ensp;&ensp;&ensp;&ensp;<img src="https://drive.google.com/uc?export=view&id=1L_65uTto-5kjRTL3zTqP4trumCrMvlWh" width="200" />  
ANIMATE_TO_ANCHOR   &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;  STATIC
## Usage  
#### Set up the dependency  
1. Add the JitPack repository to your root build.gradle at the end of repositories:  
```  
allprojects {  
   repositories {  
      ...  
      maven { url 'https://jitpack.io' }  
   }  
}  
```  
2. Add  dependency in the build.gradle:  
```  
implementation 'com.github.psuzn:WheelView:0.1.0'  
```  
  
#### Use a `WheelView`  in your layout.  
```  
<me.sujanpoudel.wheelview.WheelView
    android:id="@+id/wheel_view"
    android:layout_width="match_parent"
    android:layout_height="0dp"
    android:layout_margin="16dp"
    app:anchorAngle="270"
    app:centerIconPadding="16dp"
    app:centerIconTint="#FFF"
    app:mode="ANIMATE_TO_ANCHOR"
    app:selectedArcBackgroundColor="#FE6447"
    app:startAngle="315"
    app:textSize="16sp" />
```  
  
#### Setup arc titles
```  
...
setContentView(R.layout.activity_main)  
val wheelView = findViewById<WheelView>(R.id.wheel_view)  
wheelView.titles = listOf("First", "Second", "Third", "Fourth")
...
```  
## Customization
You can customize following properties:

<img src="https://drive.google.com/uc?export=view&id=1wxtKGuB-gYE7oRshBvlgbmtyR-gA82Wj" width="1000" />
<br />
<br />

```xml
<me.sujanpoudel.wheelview.WheelView  
  android:id="@+id/wheel_view"  
  android:layout_width="match_parent"  
  android:layout_height="match_parent"  
  android:layout_margin="16dp"  
  
  app:dividerStrokeWidth="16dp"  
  app:arcBackgroundColor="#F7F8FB"  
  app:selectedArcBackgroundColor="#FE6447"  
  app:centerIcon="@drawable/ic_baseline_add_24"  
  app:centerIconPadding="16dp"  
  app:centerIconTint="@color/white"  
  app:anchorAngle="45"  
  app:startAngle="315"  
  app:textSize="16sp"  
  app:selectedTextColor="#FFF"  
  app:textColor="#000000"  
  app:animationDuration="500"  
  app:mode="ANIMATE_TO_ANCHOR|STATIC"  
  />
```
##### 1.  Wheel Mode

The `WheelView` has  two [modes](#mode)
  ```kotlin
  enum class Mode {  
	  ANIMATE_TO_ANCHOR,  // the selected arc segment animates and moves to anchor angle like  
	  STATIC  // only the selected 
}
  
  ```
##### 1.  Arc Segment Divider Stroke Width 
```xml
<me.sujanpoudel.wheelview.WheelView
    app:dividerStrokeWidth="16dp" 
    ...
   ```
##### 2.  Arc Segment Background Color
```xml
<me.sujanpoudel.wheelview.WheelView
  app:arcBackgroundColor="#F7F8FB"  
  app:selectedArcBackgroundColor="#FE6447"  
  ...
   ```
##### 3. Center Icon  
```xml
<me.sujanpoudel.wheelview.WheelView
  app:centerIcon="@drawable/ic_baseline_add_24"  
  app:centerIconPadding="16dp"  
  app:centerIconTint="@color/white"  
  ...
   ```

##### 4. Mode, Angle and Animation 
```xml
<me.sujanpoudel.wheelview.WheelView
  app:anchorAngle="45"  
  app:startAngle="315"   
  app:mode="ANIMATE_TO_ANCHOR|STATIC" 
  app:animationDuration="500"   
  ...
   ```
##### 4. Text 
```xml
<me.sujanpoudel.wheelview.WheelView
 app:textSize="16sp"  
 app:selectedTextColor="#FFF"  
 app:textColor="#000000"    
  ...
   ```


## Bugs and Feedback  
For bugs, questions and discussions please use the [Github Issues](https://github.com/psuzn/WheelView/issues/new).  
  
## License  
```  
GPL V3 License  
  
Copyright (c) 2019 psuzn 
  
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>. 
```