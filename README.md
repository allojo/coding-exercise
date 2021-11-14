# coding-exercise

# Coding Challenge 

### Reference Documentation

For further reference, please consider the following sections:

JSON format:

```

ts:  timestamp

pt:  processing time

si:  session ID

uu:  user UUID

bg:  business UUID

sha: sha256 of the file

nm:  file name

ph:  path

dp:  disposition (valid values: MALICIOUS (1), CLEAN (2), UNKNOWN (3))

```
### For execution (in the root directory)
``` 
./gradlew bootRun 
```

### Output example
```
   .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.6)

2021-11-14 15:25:26.899  INFO 37277 --- [           main] c.example.coding.app.CodingApplication   : Starting CodingApplication using Java 1.8.0_312 on Jorges-Mac-mini.home with PID 37277 (/Users/jorgealvarez/IdeaProjects/Coding/build/classes/java/main started by jorgealvarez in /Users/jorgealvarez/IdeaProjects/Coding)
2021-11-14 15:25:26.900  INFO 37277 --- [           main] c.example.coding.app.CodingApplication   : No active profile set, falling back to default profiles: default
2021-11-14 15:25:27.097  INFO 37277 --- [           main] c.example.coding.app.CodingApplication   : Initiating Coding Application
2021-11-14 15:25:27.136  INFO 37277 --- [           main] c.example.coding.app.CodingApplication   : Started CodingApplication in 0.396 seconds (JVM running for 0.59)
2021-11-14 15:25:27.284  INFO 37277 --- [           main] c.example.coding.app.CodingApplication   :  9998 Valid Files
2021-11-14 15:25:27.289  INFO 37277 --- [           main] c.example.coding.app.CodingApplication   : Final List {dif=200, psd=177, =2100, bmp=169, aiff=205, gif=180, csv=196, mid=174, psp=187, fm3=184, mac=170, hqx=202, tif=172, exe=173, bat=176, mov=184, avi=204, mtb=177, qxd=198, map=176, class=209, wk3=199, wks=187, sit=177, htm=196, zip=164, jpg=173, cvs=182, tar=152, rtf=178, png=190, eps=201, dbf=187, mdb=175, wav=169, p65=187, ra=199, txt=177, t65=169, pdf=182, au=198, ppt=193, doc=195, xls=155}

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.2/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 953ms
3 actionable tasks: 1 executed, 2 up-to-date
3:25:27 PM: Task execution finished ':CodingApplication.main()'.
```
