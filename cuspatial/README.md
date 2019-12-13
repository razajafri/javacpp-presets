JavaCPP Presets for cuspatial
=============================

Introduction
------------
This directory contains the JavaCPP Presets module for:

 * cuspatial 1.0  https://github.com/bytedeco/cuspatial

Please refer to the parent README.md file for more detailed information about the JavaCPP Presets.


Documentation
-------------
Java API documentation is available here:

 * http://bytedeco.org/javacpp-presets/cuspatial/apidocs/


Sample Usage
------------
Here is a simple example of cuspatial ported to Java from this C source file:

 * https://github.com/bytedeco/cuspatial/#example

We can use [Maven 3](http://maven.apache.org/) to download and install automatically all the class files as well as the native binaries. To run this sample code, after creating the `pom.xml` and `cuSpatialTest.java` source files below, simply execute on the command line:
```bash
 $ mvn compile exec:java
```

### The `pom.xml` build file
```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>org.bytedeco.cuspatial</groupId>
    <artifactId>cuspatial-test</artifactId>
    <version>1.5.3-SNAPSHOT</version>
    <properties>
        <exec.mainClass>cuSpatialTest</exec.mainClass>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.bytedeco</groupId>
            <artifactId>cuspatial-platform</artifactId>
            <version>1.0-1.5.3-SNAPSHOT</version>
        </dependency>
    </dependencies>
    <build>
        <sourceDirectory>.</sourceDirectory>
    </build>
</project>
```

### The `cuSpatialTest.java` source file
```java
import org.bytedeco.cuspatial.*;
import org.bytedeco.javacpp.*;
import static org.bytedeco.cuspatial.global.cuspatial.*;

public class cuSpatialTest {

    public static void main(String[] args) {
        System.out.println("TBD: ADD TEST HERE!");
    }
}
```

