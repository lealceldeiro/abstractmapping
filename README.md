# abstractmapping
A demo Java Code for Showing how to implement Jackson deserialization with abstracts.

- Run locally the project (i.e.: `./mvnw spring-boot:run`)
- For getting instances of class `B` do the following request: `{ "x": "some value for x here", "y": "some value for y here", "type": "B" }`
- For getting instances of class `C` do the following request: `{ "x": "some value for x here", "z": "some value for z here", "type": "C" }`

The previous requests can be performed using any commonly used tools with such purpose such as [Postman](https://www.postman.com/) or [cURL](https://en.wikipedia.org/wiki/CURL).

Example in cURL:
```shell
curl -X POST --location "http://localhost:8080/demo" \
    -H "Content-Type: application/json" \
    -d "{ \"x\": \"some value for x here\", \"y\": \"some value for y here\", \"type\": \"B\" }"
```
and
```shell
curl -X POST --location "http://localhost:8080/demo" \
    -H "Content-Type: application/json" \
    -d "{ \"x\": \"some value for x here\", \"y\": \"some value for y here\", \"type\": \"C\" }"
```
