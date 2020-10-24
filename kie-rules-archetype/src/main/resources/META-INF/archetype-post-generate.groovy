def moduleDir = new File(request.getOutputDirectory() + "/" + request.getArtifactId());
def gitignore = new File(moduleDir, ".gitignore")
def content = """
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

def writeDotGitIgnore() {
    gitignore.setText(content, "UTF-8")
}

writeDotGitIgnore()