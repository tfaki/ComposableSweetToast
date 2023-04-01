

# Composable Sweet Toast 
[![](https://jitpack.io/v/TalhaFaki/ComposableSweetToast.svg)](https://jitpack.io/#TalhaFaki/ComposableSweetToast)
[![](https://img.shields.io/badge/Android%20Arsenal-ComposableSweetToast-green.svg?style=flat)](https://android-arsenal.com/details/1/8260)

A library that you can use in 4 different types(Success, Error, Warning, Info) written with Jetpack Compose. You can use this toast easy.

## Tech Stack:
* Kotlin 
* Jetpack Compose
* Material Design
* Solid Principles
* Custom View from Toast

## How to install ? 
You can add the library to your project using jitpack.io.

Add the code below to your project's settings.gradle file.

```
 allprojects {
        repositories {
            jcenter()
            maven { url "https://jitpack.io" }
        }
   }
```


Add the code below to your app's gradle file.
```
implementation 'com.github.tfaki:ComposableSweetToast:$latest_version'
```
## Usage

For Sweet Success with Short Duration, Top Padding and Aligment : 
```
SweetSuccess(message = "Success Text!", duration = Toast.LENGTH_SHORT, padding = PaddingValues(top = 16.dp), contentAlignment = Alignment.TopCenter)
```
<p align="center">
  <img src="https://github.com/TalhaFaki/ComposableSweetToast/blob/master/success.gif" alt="animated" />
</p>
  
For Sweet Error :
```
SweetError(message = "Error Text!")
```
<p align="center">
  <img src="https://github.com/TalhaFaki/ComposableSweetToast/blob/master/error.gif" alt="animated" />
</p>

For Sweet Warning : 
```
SweetWarning(message = "Warning Text!")
```
<p align="center">
  <img src="https://github.com/TalhaFaki/ComposableSweetToast/blob/master/warning.gif" alt="animated" />
</p>

For Sweet Info : 
```
SweetInfo(message = "Info Text!")
```
<p align="center">
  <img src="https://github.com/TalhaFaki/ComposableSweetToast/blob/master/info.gif" alt="animated" />
</p>

## Sample App: 
[Click here for MainScreen](https://github.com/TalhaFaki/ComposableSweetToast/blob/master/app/src/main/java/com/android/composablesweettoast/MainScreen.kt)

``` xml

MIT License

Copyright (c) 2021 Talha Fakıoğlu

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
