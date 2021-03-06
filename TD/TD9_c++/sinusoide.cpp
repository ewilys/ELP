#include <cmath>
#include <cstdio>
#include <iostream>

//attention il faut un constructeur sans paramètres pour pouvoir faire une déclaration seule (sans param)

class FonctionDeRDansR {
public:
  virtual double operator()(double x) = 0;//renomme la methode eval en operator()
};


class Sinusoide : public FonctionDeRDansR {
  private:
    double myA, myB;
  public:
    Sinusoide(double aA, double aB) : myA(aA), myB(aB) {}
    double operator () (double x) {
      return myA*std::sin(x) + myB*std::cos(x);
    }
};

//attention ne pas oublier de delete si on a fait des instanciation sur le tas avec des new : pas de garbage collector comme en java

double integration( double a, double b, int n,
                    FonctionDeRDansR* fPtr ) {//2 facon de faire : utiliser des pointeurs ou par référence(plus lisible)
  double delta = (b - a) / n;
  double sum = 0.0;
  int i;
  for (i = 0; i < n; ++i)
    sum += (*fPtr)(a + i*delta);
  return sum * delta;
}

int main (int argc,char* argv[]){

	double trueVal=sin(1.0);
	printf("%f\n",trueVal);
	Sinusoide cosinus(0,1); //instanciation sur la pile pas besoin de delete
	printf("%f\n",cosinus(0));
	
	FonctionDeRDansR* foncPtr= new Sinusoide(0,1);
	double res=integration(0.0,1.0,1000000,foncPtr);//limite ici on peut integrer seulement les fonctions dérivant de FonctionDeRDansR
	printf("%f (approche %f)\n",res,trueVal);
	delete(foncPtr);
	
	
	return 0;
}
