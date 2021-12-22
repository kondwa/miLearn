package co.milesoft.milearn

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import co.milesoft.milearn.models.Course
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.course_item.view.*

class CoursesAdapter(val context: Context, val courses: List<Course>) : RecyclerView.Adapter<CoursesAdapter.CourseViewHolder>() {

    inner class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView:ImageView = itemView.imageView
        var textView:TextView = itemView.textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view:View = LayoutInflater.from(context).inflate(R.layout.course_item,null)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.textView.text = courses[position].title
        Picasso.with(context).load(courses[position].image240x135).into(holder.imageView)
        holder.itemView.setOnClickListener {
            val intent = Intent(context,CourseDetailsActivity::class.java)
            intent.putExtra("id", courses[position].id)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = courses.size
}