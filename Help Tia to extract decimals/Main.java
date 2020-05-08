#include<iostream>
#include<string>
int main() 
{ 
	std::string fnum;
	//Type your code here
  	std::cin>>fnum;
  	int i=0,flag=0;
  	std::cout<<"Floating part is : ";
  	while(fnum[i]!='\0'){
      if(flag==1){
        std::cout<<fnum[i];
      }
      if(fnum[i]=='.'){
        flag=1;
      }
      i++;
    }
}