(defproject carlzhc/lein-tar "3.3.0.1"
  :url "https://github.com/carlzhc/lein-tar"
  :license "Eclipse Public License 1.0"
  :description "Create a tarball of your Leiningen projects."
  :eval-in-leiningen true
  :dependencies [[org.apache.ant/ant "1.10.5"]
                 [lein-ring "0.12.5"]]
  :min-lein-version "2.0.0"
  :tar {:jar-path "/libexec/lein-tar"})
