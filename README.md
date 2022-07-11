# Demo application for gRCP

## How to start

1. Run `cd grcpdemocommon`
2. Run `mvn clean install`
3. Reload All Maven Projects (IntelliJ)
4. Start `grpcdemoserver`, `restdemoserver`, `grpcdemoclient`

## How to use gRPCurl

1. Download https://hub.docker.com/r/networld/grpcurl
2. `./grpcurl --plaintext host.docker.internal:9090 list`
3. `./grpcurl --plaintext host.docker.internal:9090 list com.reno.grpc.SimpleService`
4. `./grpcurl --plaintext host.docker.internal:9090 describe com.reno.grpc.SimpleService.getRequest`
5. `./grpcurl --plaintext host.docker.internal:9090 describe com.reno.grpc.SimpleRequest`
6. `./grpcurl --plaintext -d '{"message":"test"}'  host.docker.internal:9090 com.reno.grpc.SimpleService/getRequest`

## Setup Protoc compiler (Windows)

- Download from https://github.com/grpc/grpc/releases
- Put it into `C:\Tools\protoc-21.2-win64\bin` (or wherever you want)
- Set PROTO_HOME Environment Variable to `C:\Tools\protoc-21.2-win64`
- Add `%PROTO_HOME%\bin` to Path
- Test it with `protoc --version`

### Future parts

- Streaming: https://www.baeldung.com/java-grpc-streaming
- 
 
