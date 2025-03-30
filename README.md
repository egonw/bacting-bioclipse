[![License](https://img.shields.io/badge/License-EPL%201.0-red.svg)](https://opensource.org/licenses/EPL-1.0)
![build](https://github.com/egonw/bacting-bioclipse/workflows/build/badge.svg)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.egonw.bacting/bioclipse.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.egonw.bacting%22%20AND%20a:%22bioclipse%22)

# Bacting - the Bioclipse bundles

Bacting := acting as the Bioclipse TNG (The Next Generation)

These are supporting libraries and not meant to be used directly.
Please read the documentation of [Bacting](https://github.com/egonw/bacting) instead.

## Making releases

Releases are created by the release manager and requires permission to submit the release to Maven Central
(using an approved Sonatype ([oss.sonatype.org](http://oss.sonatype.org/)) account).

Instructions to increase the version:

```shell
mvn versions:set -DnewVersion=2.8.1.5-SNAPSHOT
```

Deploy to Sonatype with the following commands, for snapshots and releases respectively:

```shell
mvn clean deploy
```

# Copyright and authors

All code in this repository contains Bioclipse 2 code and the headers of the individual
source code files describe who contributed to that code of that class, but unfortunately this code
ownership is not always clear. I refer to the various [Bioclipse code repositories](https://github.com/bioclipse)
for the git history for more information.

