


interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

class cat implements Animal {
  public void animalSound() {
    System.out.println("The cat says: meong");
  }
  public void sleep() {
    System.out.println("Zzz");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    cat mycat = new cat();
    mycat.animalSound();
    mycat.sleep();
  }
}