#include <iostream>
#include <cstdlib>
#include <ctime>
#include <windows.h>


using namespace std;

double PCFreq = 0.0;
__int64 CounterStart = 0;
void StartCounter()
{
    LARGE_INTEGER li;
    if(!QueryPerformanceFrequency(&li))
    cout << "QueryPerformanceFrequency failed!\n";

    PCFreq = double(li.QuadPart);

    QueryPerformanceCounter(&li);
    CounterStart = li.QuadPart;
}
double GetCounter()
{
    LARGE_INTEGER li;
    QueryPerformanceCounter(&li);
    return double(li.QuadPart-CounterStart)/PCFreq;
}

void Burbuja()
{
	StartCounter();//Inicia a contabilizar el tiempo
	int arr[10000];
	int aux;
	int arr_length = sizeof(arr)/sizeof(int);//Obtiene el tamaño del arreglo
	for(int i=1;i<=arr_length;i++){ //Asigna un numero aleatorio a cada posicion del arreglo
		arr[i] = rand() % 10000;
		arr[i] += 1 ;
	}
	
	for(int l=1;l<=arr_length;l++){//Iterador que ordena los numeros del arreglo
		for(int j=0;j<=arr_length-1;j++){
			if(arr[j+1]<arr[j]){
				aux = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=aux;
			}
		}
		
	}
	for(int k=1;k<=arr_length;k++){
		cout<< arr[k] <<endl;
	}
	cout<<"Tiempo de ejecucion: "<<GetCounter(); //Imprime el tiempo de ejecucion del algoritmo
}

void binario(int n){
	StartCounter();//Inicia a contabilizar el tiempo
	string r,binario;
    while (n != 0){ //Conversion a binario
        r += ( n % 2 == 0 ? "0" : "1" );
        n /= 2;
    }
    for (int i=r.length();i>=0;i--){//Invierte cadena string
    	binario += r.substr(i,1);
	}
	cout<<"Numero binario: "<<binario<<endl;
    cout<<"Tiempo de ejecucion: "<<GetCounter(); //Imprime el tiempo de ejecucion del algoritmo
}

int main(){
	int decimal;
	cout<<"Ingrese numero a convertir en binario: ";
	cin>> decimal;
	binario(decimal);
	
	return 0; 	
}
