# Minimal Vert.x project with Maven running in Eclipse

To set up:
* git clone to your workspace
* File | Import | Maven | Existing Maven Projects 
* Create new Debug/Run Configuration:
** Java Application
** Main class: org.vertx.java.deploy.impl.cli.Starter
** Program arguments: run ${java_type_name} -conf ${project_loc}/mod.json -cp ${project_loc}/target/classes"
