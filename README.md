# Overlap2dDataStructure
Model the data structure of an [Overlap2d](http://overlap2d.com/) project.

#Project setup
The main objective of this project is to load a scene produced with the Overlap 2D editor for a Libgdx game. In this way, if you want to use this project with an existing Ligdx game, you just have to perform the following steps:

* Download or clone the repo and rename it: overlap2dstructure
* Put the repo to the root of your Libgdx project (next to the core, desktop, html, etc. forlders)
* Open the ***settings.gradle*** file of your Libgdx project and add the string: ***'overlap2dstructure'***. The file content should look like the following example: 
```gradle
include 'desktop', 'html', 'core', 'overlap2dstructure'
```
The content may vary depending on the type of Libgdx game that you are producing. In the previous example, I don't have any projects for the mobile platforms that you maybe have.

* Add a compile depency on ***overlap2dstructure*** in the ***core*** project dependencies of your game. Example: 

```gradle
project(":core") {
    apply plugin: "java"

    dependencies {
        compile project(":overlap2dstructure")
        compile "com.badlogicgames.gdx:gdx:$gdxVersion"
    }
}
```

#How to use it
## Load an Overlap2d project
If you want to load a ***Project*** data structure of an Overlap2d project, use the following lines:
```java
Json json = new Json();
Project project = json.fromJson(Project.class, Gdx.files.local(
	"project.dt"
	));
```
Of course, the path in the example needs to be changed to match your needs. 

## Load an Overlap2d scene
If you want to load a ***Scene*** data structure of an Overlap2d project, use this:
```java
Json json = new Json();
        Scene scene = json.fromJson(Scene.class, Gdx.files.local(
                "scenes/MainMenuScreen.dt"
        ));
```
Same for the path here, it needs to be changed. 

