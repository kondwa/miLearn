package co.milesoft.milearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import co.milesoft.milearn.models.Course
import co.milesoft.milearn.models.GetCoursesResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var courses:List<Course>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        UdemyAPI.getService().getCourses().enqueue(object: Callback<GetCoursesResponse>{
            override fun onResponse(call: Call<GetCoursesResponse>, response: Response<GetCoursesResponse>
            ) {
                if (response.isSuccessful){
                    val data = response.body()
                    courses = data!!.results
                    setDataInRecyclerView()
                }else{
                    Toast.makeText(this@MainActivity,response.message(),Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<GetCoursesResponse>, t: Throwable) {
                Toast.makeText(this@MainActivity,t.toString(),Toast.LENGTH_SHORT).show()
            }
        })
    }
    fun setDataInRecyclerView(){
        coursesRecyclerView.layoutManager = LinearLayoutManager(this)
        coursesRecyclerView.adapter = CoursesAdapter(this, courses)
    }
}