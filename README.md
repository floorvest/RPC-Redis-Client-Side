# RPC Redis Client Side Implementation

This is repository for Redisson RPC implementation with Spring Boot. In this example we take **User Management** try to get license from module **License Management**.

This repository contain code for **User Management**.

## Get Service from Remote Service

To get service from redisson instance Remote Service, simply Get the registered instance from Remote Service by indicate which service you want to take.

```    
RRemoteService remoteService = redisson.getRemoteService();

SomeService service = remoteService.get(SomeService.class);

service.doStuff();
```

## Testing

you can access the rest api to test it.

` http://localhost:8081/user/license `
to get one license.

` http://localhost:8081/user/licenses ` to get 10000 licenses. you can use this to test performance on large collection.