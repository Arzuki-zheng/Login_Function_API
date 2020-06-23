### API_NAME:ApiOfUser.java     
### 預設port為8800，可自行更改。      。     
## 1. POST : 新增資料。   
於postman選擇POST，路徑： http:localhost:8800/data   
於body打上欲新增資料之JSON格式，send。           
如果BODY跟資料庫內有對應資料
即傳回 0 SUCCESS 和該筆資料之ID NAME PASSWORD
