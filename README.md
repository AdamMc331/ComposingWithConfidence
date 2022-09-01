# Composing With Confidence

This is the sample repository for the Composing With Confidence presentation from [Droidcon NYC](https://nyc.droidcon.com) in 2022. If you run the sample app, you won't see much other than a basic login form that requires filling out a username and password before navigating into a basic home screen. 

The main benefit of this repo is to run and explore different testing options in Jetpack Compose. The main points of interest are the following:

1. The [PrimaryButtonTest](designsystem/src/androidTest/java/com/adammcneilly/composingwithconfidence/designsystem/PrimaryButtonTest.kt) file shows how we can test an individual component by itself. 
2. The [PrimaryButtonPaparazziTest](designsystem/src/test/java/com/adammcneilly/composingwithconfidence/designsystem/components/PrimaryButtonPaparazziTest.kt) shows how we can use the [Paparazzi](https://github.com/cashapp/paparazzi) library to screenshot test on the JVM.
3. The [MainActivityTest](app/src/androidTest/kotlin/com/adammcneilly/composingwithconfidence/MainActivityTest.kt) shows how we can write a full integration test to verify a screen's behavior including navigation.

If you'd like to view the slides from this presentation, you can find them in the [presentation](Presentation/ComposingWithConfidence.pdf) folder.