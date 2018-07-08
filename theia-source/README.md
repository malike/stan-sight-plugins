# Theia Plugin : Theia Source


Source for getting data from Theia hardware. This is the main entry point for Project Theia to
communicate to the software world.

It uses an MQTT protocol by which it recieves streams of data from
the [Theia Hardware](). This can then be _routed_ over [Apache Kafka]()
[RabbitMQ]() or [Redis]() channels using [Spring Data Flow]() to other end points from sending 
[notifications]() when a face is identified in the stream or streaming the video to [YouTube]().

I've built sample plugins based on this flow to show how it works end to end.


### Getting Started

Once you've connected your hardware as described in the Theia hardware project,
configure it to send it's data to the _theia-source_.

The configurations required by theia-source are :

i. `username` :

ii. `password` :

iii. `connectionURL` :

iv. `port` :

v. `topic` :

vi. `waiTime` :
 
vii. `qos` : 


### Installation 

i. Spring Data Flow UI 

[image of theia source in use over UI]


ii. Shell Data Flow Shell

[image of theia source in use over shell]

### How-TO





### Contribution

   
