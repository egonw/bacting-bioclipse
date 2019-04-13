# bacting

[![License](https://img.shields.io/badge/License-EPL%201.0-red.svg)](https://opensource.org/licenses/EPL-1.0)

Bacting := acting as the Bioclipse TNG

## How to cite

If you use this software, please cite the [Bioclipse 2 paper](https://bmcbioinformatics.biomedcentral.com/articles/10.1186/1471-2105-10-397).

# Install

First, you need a working [Maven installation](https://www.google.nl/search?q=install+maven) and then install this software:

```shell
mvn clean install
```

# Usage

It can be used in [Groovy](https://en.wikipedia.org/wiki/Apache_Groovy) by including the
Bacting managers you need:

```groovy
@Grab(group='net.bioclipse.managers', module='bioclipse-cdk', version='0.0.1-SNAPSHOT')

workspaceRoot = "."
def cdk = new net.bioclipse.managers.CDKManager(workspaceRoot);

println cdk.fromSMILES("COC")
```

## API Coverage

For the time being, the API is *incomplete*. Particularly, manager functionality around graphical UX
in the original Bioclipse may never be implemented. Each Bacting release will implement more APIs and
the release notes will mention which managers and which methods have been added.

For a description of the API, I refer to the book
[A lot of Bioclipse Scripting Language examples](https://bioclipse.github.io/bioclipse.scripting/) that
Jonathan and I compiled.

All Bacting scripts will be backwards compatible with Bioclipse. If you want to install Bioclipse
and see its wonderful UX in actions, [download Bioclipse 2.6.2 here](https://sourceforge.net/projects/bioclipse/files/bioclipse2/bioclipse2.6.2/).

## Using SNAPSHOT versions

You may need to occassionally delete the
modules cached by Groovy, by doing something like, to remove earlier SNAPSHOT versions:

```shell
\rm -Rf ~/.groovy/grapes/net.bioclipse.managers/
```

# Copyright and authors

All code in the `/bioclipse/` folder contains Bioclipse 2 code and the headers of the individual
source code files describe who contributed to that code of that class, but unfortunately this code
ownership is not always clear. I refer to the various [Bioclipse code repositories](https://github.com/bioclipse)
for the git history for more information.
