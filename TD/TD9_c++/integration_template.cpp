#include <cmath>
#include <cstdio>
#include <iostream>




//ici plus besoin d'héritage.
class Sinusoide {
  private:
    double myA, myB;
  public:
    Sinusoide(double aA, double aB) : myA(aA), myB(aB) {}
    double operator () (double x) {
      return myA*std::sin(x) + myB*std::cos(x);
    }
};


template <class F>
double integration( double a, double b, int n,F f ) {//par référence(plus lisible)
  double delta = (b - a) / n;
  double sum = 0.0;
  int i;
  for (i = 0; i < n; ++i)
    sum += f(a + i*delta);
  return sum * delta;
}

int main (int argc,char* argv[]){

	double trueVal=sin(1.0);
	printf("%f\n",trueVal);
	Sinusoide cosinus(0,1); 
	printf("%f\n",cosinus(0));
	double res=integration(0.0,1.0,1000000,cosinus);
	printf("%f (approche %f)\n",res,trueVal);
	
	double (*f) (double);
	f=cos;
	double res2=integration(0.0,1.0,1000000,cos);
	printf("%f (approche %f)\n",res2,trueVal);
	
	return 0;
}
