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

2021-11-14 15:12:43.762  INFO 37071 --- [           main] c.example.coding.app.CodingApplication   : Starting CodingApplication using Java 17.0.1 on Jorges-Mac-mini.home with PID 37071 (/Users/jorgealvarez/delete/coding-exercise/build/classes/java/main started by jorgealvarez in /Users/jorgealvarez/delete/coding-exercise)
2021-11-14 15:12:43.763  INFO 37071 --- [           main] c.example.coding.app.CodingApplication   : No active profile set, falling back to default profiles: default
2021-11-14 15:12:44.196  INFO 37071 --- [           main] c.example.coding.app.CodingApplication   : Initiating Coding Application
2021-11-14 15:12:44.292  INFO 37071 --- [           main] c.example.coding.app.CodingApplication   : Started CodingApplication in 0.899 seconds (JVM running for 1.269)
2021-11-14 15:12:44.505  INFO 37071 --- [           main] c.example.coding.app.CodingApplication   :  9998 Valid Files
2021-11-14 15:12:44.528  INFO 37071 --- [           main] c.example.coding.app.CodingApplication   : Final List {dif=200, psd=177, =2100, bmp=169, aiff=205, gif=180, csv=196, mid=174, psp=187, fm3=184, mac=170, hqx=202, tif=172, exe=173, bat=176, mov=184, avi=204, mtb=177, qxd=198, map=176, class=209, wk3=199, wks=187, sit=177, htm=196, zip=164, jpg=173, cvs=182, tar=152, rtf=178, png=190, eps=201, dbf=187, mdb=175, wav=169, p65=187, ra=199, txt=177, t65=169, pdf=182, au=198, ppt=193, doc=195, xls=155}

BUILD SUCCESSFUL in 3s
4 actionable tasks: 2 executed, 2 up-to-date
```
