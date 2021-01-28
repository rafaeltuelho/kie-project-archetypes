def writeDotGitIgnore() {
    content = """
.classpath
.project
.settings
.factorypath
.vscode
.DS_Store
*.iml
.~lock*
/bin/
/target/
    """;
    moduleDir = new File(request.getOutputDirectory() + "/" + request.getArtifactId());
    gitignore = new File(moduleDir, ".gitignore")
    gitignore.setText(content, "UTF-8")
}

writeDotGitIgnore()