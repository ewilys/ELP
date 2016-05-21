#include <algorithm>
#include <cmath>
#include <iostream>



int main(){
	std::cout << std::min(5, 2) << std::endl;
	std::cout << std::min(5.9, 2.1) << std::endl;
	std::cout << std::min('a', 'b') << std::endl;
	
	std::cout << std::min<std::string>("bonjour", "au revoir") << std::endl;// min inférieur strict est def pour les string = ordre alphabétique
	std::cout << std::min<double>(5, 2.1) << std::endl;
	
	//std::min( Sinusoide(1.0, 0.0), Sinusoide(0.0, 1.0) ); ici l'opérateur < n'est pas def pour sinusoide donc ca marche .
	return 0;
}
