project_name = "name"
repo = "git@github.com:fqj/test_jenkins.git"
repo_name = "name"

pipelineJob(project_name) {
    definition {
        triggers {
            scm('H/5 * * * *')
        }
        cpsScm {
            scm {
                git {
                    remote {
                        name(repo_name)
                        url(repo)
                    }
                }
                scriptPath("Jenkinsfile")
            }
        }
    }
}