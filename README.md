## React Native Android Tactics Creator
  This is a test inHouse component. For now....

## Getting started

There are many ways to do this, here's the way I do it:

2. Do `npm install git+https://github.com/flaviotobi/react-native-tactics-creator.git --save` in your main project.


3. Link the library:
    Automatic: `react-native link react-native-tactics-creator`
    Manual:
    * Add the following to `android/settings.gradle`:
        ```
        include ':react-native-tactics-creator'
        project(':react-native-tactics-creator').projectDir = new File(settingsDir, '../node_modules/react-native-tactics-creator/android')
        ```

    * Add the following to `android/app/build.gradle`:
        ```xml
        ...

        dependencies {
            ...
            compile project(':react-native-tactics-creator')
        }
        ```
    * Add the following to `android/app/src/main/java/**/MainApplication.java`:
        ```java

        import com.tactical.creator.Package; // add this for react-native-android-library-boilerplate

        public class MainApplication extends Application implements ReactApplication {

            @Override
            protected List<ReactPackage> getPackages() {
                return Arrays.<ReactPackage>asList(
                    new MainReactPackage(),
                    new Package()     // add this for react-native-android-library-boilerplate
                );
            }
        }
        ```
4. Simply `import/require` it by the name defined in your library's `package.json`:

    ```javascript
    import TacticsCreator from 'react-native-tactics-creator'
    TacticsCreator.show('TacticsCreator runs fine', TacticsCreator.LONG)
    ```
