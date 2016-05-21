#include <iostream>

class BaseClass {
  public:
  //en rajoutant virtual on active la liaison dynamique (= comme en java on execute d'abord les méthodes des classes dérivées et on remonte)
    virtual void method() {
      std::cout << "from Base" << std::endl;
    }
};

class DerivedClass : public BaseClass {
  public:
    void method() {
      std::cout << "from Derived" << std::endl;
    }
};

int main() {
  BaseClass* ptr = new DerivedClass();
  ptr->method();
}
