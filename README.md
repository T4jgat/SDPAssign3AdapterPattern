# Adapter pattern

## A brief explanation
The Adapter design pattern allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code. Essentially, it acts as a bridge between two incompatible interfaces, enabling communication between them. This pattern is particularly useful when integrating new features or systems into an existing application, facilitating smooth interaction between different components.

## Real-world scenario
I used the "adapter" pattern to adapt mp3 and wav formats in a music player

## Code
### Main interface (Mp3Player)
```java
interface Mp3Player {
    void play();
    void pause();
    void next();
    void prev();
}
```
### Client interface (WavPlayer)
```java
interface WavPlayer {
    void playWav();
    void pauseWav();
    void nextWav();
    void prevWav();
}
```
### Adapter from mp3 to wav (PlayerAdapter)
```java
class PlayerAdapter implements WavPlayer {
    Mp3Player mp3Player;

    public PlayerAdapter(Mp3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void playWav() {
        mp3Player.play();
    }

    @Override
    public void pauseWav() {
        mp3Player.pause();
    }

    @Override
    public void nextWav() {
        mp3Player.next();
    }

    @Override
    public void prevWav() {
        mp3Player.prev();
    }
}
```

## Test cases and their outcomes
### Input view:
```shell
[1] Play
[2] Pause
[3] Next
[4] Prev
>> 
```
### Output view 
Play
```shell
Play music...
```
Pause
```shell
Pause music...
```
Next
```shell
Next track...
```
Prev
```shell
Previous track...
```
## Reflection

### Challenges

Increased complexity: The adapter pattern can add a layer of complexity to your code, as you need to create and maintain an adapter class for each incompatible interface.
Performance overhead: The adapter class may introduce some performance overhead, as it needs to mediate calls between the client and the adaptee.
Dependency on the adapter: If the adapter class fails or needs to be modified, it can impact the entire system.

### Benefits
Compatibility and integration: The adapter pattern allows you to integrate existing code or legacy systems with incompatible interfaces with the rest of your codebase.
Reusability: The adapter pattern promotes code reuse, as you can create an adapter class for an existing class and then reuse that adapter class in different parts of your codebase.
Flexibility and maintainability: The adapter pattern makes your code more flexible and maintainable, as you can easily change the implementation of the adapter class without having to modify the client code.

### Reflection
The adapter pattern is a powerful tool that can help you to write more flexible and maintainable code. However, it is important to be aware of the potential challenges associated with using this pattern, such as increased complexity and performance overhead.

When deciding whether to use the adapter pattern, it is important to weigh the benefits and challenges against the specific needs of your project. If you need to integrate two incompatible interfaces, or if you want to reuse code that is written for a different interface, then the adapter pattern is a good choice. However, if you are concerned about performance overhead or code complexity, then you may want to consider using a different approach.

## link to github:
```shell
https://github.com/T4jgat/SDPAssign3AdapterPattern
```