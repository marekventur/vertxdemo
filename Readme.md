# Minimal Vert.x project with Maven running in Eclipse

To set up:
* git clone to your workspace
* File | Import | Maven | Existing Maven Projects 

Create new Debug/Run Configuration:
* "Java Application"
* Main class: `org.vertx.java.deploy.impl.cli.Starter`
* Program arguments: `run ${java_type_name} -repo vert-x.github.io -conf ${project_loc}/mod.json -cp ${project_loc}/target/classes"`

Go to `MainVerticle` or `HttpHelloWorldVerticle` and use the debug/run configuration. There should be some console output and <http://localhost:8080> should show Hello World
