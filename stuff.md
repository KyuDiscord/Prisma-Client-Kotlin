# Stuff

Hello, this file is for storing all the Prisma Engine/Client research I've done, mainly to keep myself from forgetting
everything but to maybe help others...

Don't expect a lot from this document since I'm quite literally learning about Prisma as I write this.

## Different methods of communicating with the Query Engine

Some of the different methods the JS client uses to communicate with the Query Engine are as follows:

> **Binary/HTTP**  
> The JS client execute the binary in a child process, which in return starts an HTTP server listening to a default port 
> of `4466`, this HTTP server is used to execute queries and transactions. It also writes errors/logs to stderr/stdout.  

> **Node-API Library**  
> Pretty self-explanatory. This is the default engine type that the JS client uses, it's also the fastest since there's
> no process spawning and HTTP overhead. 

## Getting the Query Engine Binary

I couldn't really find anything on how to acquire the query engine binary, a lot of the client code that I've looked at
is really confusing.

The URL where the binaries reside is   
`https://binaries.prisma.sh/all_commits/{commit_hash}/{platform}/{query/inspection/migration}-engine.{exe.gz/gz}`

> For example, the URL I use for the Windows Binary is:  
> https://binaries.prisma.sh/all_commits/{commit_hash}/Windows_NT/query-engine.exe.gz

##  
