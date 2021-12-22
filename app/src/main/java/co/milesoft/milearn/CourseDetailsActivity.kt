package co.milesoft.milearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import co.milesoft.milearn.models.Course
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_course_details.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CourseDetailsActivity : AppCompatActivity() {
    lateinit var course: Course
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_details)
        val courseId = intent.getIntExtra("id",0)
        if(courseId != 0) {
            UdemyAPI.getService().getCourse(courseId).enqueue(object : Callback<Course> {
                override fun onResponse(call: Call<Course>, response: Response<Course>) {
                    if (response.isSuccessful) {
                        course = response.body()!!
                        displayCourseDetails()
                    } else {
                        Toast.makeText(
                            this@CourseDetailsActivity,
                            response.message(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                override fun onFailure(call: Call<Course>, t: Throwable) {
                    Toast.makeText(
                        this@CourseDetailsActivity,
                        t.toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
        }
    }

    private fun displayCourseDetails() {
        Picasso.with(this).load(course.image480x270).into(courseImageView)
        courseTitle.text = courseTitle.text.toString() + course.title
        coursePrice.text = coursePrice.text.toString() + course.price
        courseInstructor.text = courseInstructor.text.toString() + course.visibleInstructors.first().displayName
        courseInstructorJob.text = courseInstructorJob.text.toString() + course.visibleInstructors.first().jobTitle
    }

}