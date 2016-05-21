#include <stdlib.h>
#include <stdio.h>
#include <math.h>

typedef double (*FonctionDeRDansR)(double);

 
double integration( double a, double b, int n,
                    FonctionDeRDansR f ) {
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
	FonctionDeRDansR fonc=cos;
	double res=integration(0.0,1.0,1000000,fonc);
	printf("%f (approche %f)\n",res,trueVal);
	return 0;
}
