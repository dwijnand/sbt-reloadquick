# [sbt-reloadquick][] [![travis-badge][]][travis] [![gitter-badge][]][gitter]

[sbt-reloadquick]:    https://github.com/dwijnand/sbt-reloadquick
[travis]:          https://travis-ci.org/dwijnand/sbt-reloadquick
[travis-badge]:    https://travis-ci.org/dwijnand/sbt-reloadquick.svg?branch=master
[gitter]:              https://gitter.im/dwijnand/sbt-reloadquick
[gitter-badge]: https://badges.gitter.im/dwijnand/sbt-reloadquick.svg

`sbt-reloadquick` is an [sbt](http://www.scala-sbt.org/) plugin to cache `reload` to make it quick.

## Setup

`sbt-reloadquick` is a plugin for interactive sbt sessions and typically not a requirement of any build.

Therefore it is recommended to install it as a [global plugin][Global plugins] so that it's available for any
build.

[Global plugins]: https://www.scala-sbt.org/1.x/docs/Using-Plugins.html#Global+plugins

To do so, add it to `~/.sbt/1.0/plugins/plugins.sbt` (create the
file if necessary) as such:

    addSbtPlugin("com.dwijnand" % "sbt-reloadquick" % "1.0.0")

As `sbt-reloadquick` is an auto plugin that is all that is required.

## Commands

* `reloadQuick`: Reloads the build, if its source files have changed.

## Licence

Copyright 2018 Dale Wijnand

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
