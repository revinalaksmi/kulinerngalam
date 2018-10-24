Kelompok 14:
Alfinda Rahmadiarni (1631710050)
Revina Laksmi Permata Hati (1631710117)

Aplikasi : Kuliner Ngalam
Merupakan aplikasi berbasis android tentang review kuliner di Malang. Pada aplikasi ini user dapat login, menambah, mengedit, dan menghapus data , serta dapat logout.

Requirement: API 27: Android 8.1 (Oreo)

List Class :
1. MainActiviy : Class yang berisi method-method untuk login, dan shared preferences.
2. HomeActivity : Class untuk activity home yang mengatur tampilan recycler view, alert dialog untuk menu crud, dan logout.
3. MenuHelper: Class yang mengextends SQLiteOpenHelper yang berisi method create table, update dan drop table.
4. MenuAdapter: Class yang mengatur data di tampilan recyclerview.
5. MenuModel : Class yang berisi method untuk mereturn value masing-masing kolom.
6. InsertMenu : Class yang mengatur activity insert data .
7. EditMenu : Class yang mengatur activity update data.
8. ViewMenu : Class yang mengaur activity detail data.
9. RecyclerTouchListener : Class untuk mengeset inputan saat touch data di recycler view.
10. ClickListenner : Class yang berisi interface ClickListenner untuk mendefinisikan onclick.
