// In file: app/src/main/java/com/codepath/nationalparks/NationalParksRecyclerViewAdapter.kt

package com.codepath.nationalparks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NationalParksRecyclerViewAdapter(
    private val parks: List<NationalPark>,
    private val mListener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<NationalParksRecyclerViewAdapter.ParkViewHolder>() {

    // Step 4a: Create the ViewHolder and find all the views
    inner class ParkViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: NationalPark? = null
        val mParkName: TextView = mView.findViewById<View>(R.id.park_name) as TextView
        val mParkLocation: TextView = mView.findViewById<View>(R.id.park_location) as TextView
        val mParkDescription: TextView = mView.findViewById<View>(R.id.park_description) as TextView
        val mParkImage: ImageView = mView.findViewById<View>(R.id.park_image) as ImageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_national_park, parent, false)
        return ParkViewHolder(view)
    }

    // Step 4b & 4c: Populate the views with park data and load the image with Glide
    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {
        val park = parks[position]
        holder.mItem = park

        // Set the text for the name, location, and description
        holder.mParkName.text = park.name
        holder.mParkLocation.text = park.location
        holder.mParkDescription.text = park.description

        // Use Glide to load the image from the URL
        Glide.with(holder.mView)
            .load(park.imageUrl)
            .centerCrop() // Use centerCrop to fill the ImageView
            .into(holder.mParkImage)

        holder.mView.setOnClickListener {
            holder.mItem?.let { park ->
                mListener?.onItemClick(park)
            }
        }
    }

    override fun getItemCount(): Int {
        return parks.size
    }
}
