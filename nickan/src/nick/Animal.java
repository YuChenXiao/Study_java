package nick;

public class Animal {
 public String say ="我是動物";
 public String name;
 public Animal(String name){
  this.name = name;

 }

 public String run() {
  return "一起跑"+say;
 }

}