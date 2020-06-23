### API_NAME:ApiOfUser.java     
### 預設port為8800，可自行更改。
### 預設username="TEST_USER"
### 預設password="00000000"
## 1. POST : 新增資料。   
於postman選擇POST，路徑： http:localhost:8800/data   
於body打上欲新增資料之JSON格式，send。           
格式{
    "username":"name_Input",
    "password":"password_Input"
}
#Example of SUCCESS
![image](https://github.com/Arzuki-zheng/Login_Function_API/blob/master/ExampleSuccess.jpg)


#Example of FAILURE
![image](https://github.com/Arzuki-zheng/Login_Function_API/blob/master/ExampleFailure.jpg)
