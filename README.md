[![](https://jitpack.io/v/buratinoapps/WebViewSettings.svg)](https://jitpack.io/#buratinoapps/WebViewSettings)

The essence of the library is to help write WebView applications. Reduces the work of writing code for the network settings of the built-in web browser. This is version 1.0.1 of the library, it's still worth working on!

# WebSettings

Add it in your root build.gradle at the end of repositories:
# build.gradle

```
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}

```
or

# gradle.settings

```
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
rootProject.name = "WebSetting"
include ':app'
```

Add the dependency
```
implementation 'com.github.buratinoapps:WebSettings:1.0'
```
