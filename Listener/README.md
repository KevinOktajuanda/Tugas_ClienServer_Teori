

### Menambah Listener
* Beberapa Event di Spring Boot Application Event di trigger bahkan sebelum Spring membuat Application Context
* Oleh karena itu, jika kita buat menggunakan bean, bisa saja beberapa listener tidak akan dipanggil, karena bean nya belum dibuat
* Agar lebih aman, kita bisa menambahkan listener ketika membuat SpringApplication 

* Kode : Contoh Listener

![Img 1](image/appstarting1.PNG)
  
* Kode : Menambah Listener

![Img 1](image/appstarting2.PNG)
 