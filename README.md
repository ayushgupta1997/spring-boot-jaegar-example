# spring-boot-jaegar-example
Distributed Tracing Example
The project comprises of two spring boot apps:
  1. jaegar-client
  2. jaegar-server

Steps to Run Project
1. Run the jaegar-client app on port 8081
2. Run the jaegar-server app on port 8082
3. Run the jaegar UI using command : docker run -d --name jaeger \                                                                                                                              127 х │ 02:55:39
  -e COLLECTOR_ZIPKIN_HTTP_PORT=9411 \
  -p 5775:5775/udp \
  -p 6831:6831/udp \
  -p 6832:6832/udp \
  -p 5778:5778 \
  -p 16686:16686 \
  -p 14268:14268 \
  -p 9411:9411 \
  jaegertracing/all-in-one:1.6
4. Once the step 1, step 2, and step 3 are done. You can run the api calls from client side. As per the code, the jaegar-client makes a call to jaegar-server and jaegar-server makes a call to a 3rd party numbers api. The request and response of api's can be traced in jaeger Ui for tracing.

References:
https://www.jaegertracing.io/docs/1.22/
https://www.youtube.com/watch?v=lJ_XAol-OKM&t=920s&ab_channel=TechPrimers

**JAEGER UI:**
<img width="1440" alt="image" src="https://github.com/ayushgupta1997/spring-boot-jaegar-example/assets/39510321/2e99414e-af8d-4b5e-8760-a41294cf2169">

**Request from Jaegar-Client and Response from Jaeger-Server**
<img width="801" alt="image" src="https://github.com/ayushgupta1997/spring-boot-jaegar-example/assets/39510321/90a6e459-4040-476f-9284-e4a60c3874a0">


