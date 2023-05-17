package com.parimatch.bettingipl.pari.match

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView

var sportsSearch = arrayListOf(
    "ESPN: The ESPN app is a must-have for sports fans. It provides up-to-date scores, news, and analysis for all major sports leagues, as well as video highlights and live streaming.",
    "NBA: The NBA app is perfect for basketball fans. It provides real-time scores, stats, and news, as well as access to live games and replays.",
    "NFL: The NFL app is the ultimate resource for football fans. It provides live scores, stats, and news, as well as access to live games and exclusive content.",
    "MLB: The MLB app is the go-to app for baseball fans. It provides live scores, stats, and news, as well as access to live games and exclusive content.",
    "NHL: The NHL app is perfect for hockey fans. It provides real-time scores, stats, and news, as well as access to live games and replays.",
    "Yahoo Sports: Yahoo Sports is a great all-around sports app. It provides scores, news, and analysis for all major sports leagues, as well as access to live games and replays.",
    "CBS Sports: CBS Sports is another great all-around sports app. It provides scores, news, and analysis for all major sports leagues, as well as access to live games and replays.",
    "FOX Sports: FOX Sports is a comprehensive sports app that provides scores, news, and analysis for all major sports leagues, as well as access to live games and replays.",
    "Bleacher Report: Bleacher Report is a great app for sports news and analysis. It provides breaking news, analysis, and commentary for all major sports leagues.",
    "Sports Illustrated: Sports Illustrated is a classic sports app that provides news, analysis, and commentary for all major sports leagues.",
    "The Athletic: The Athletic is a premium sports app that provides in-depth reporting, analysis, and commentary for all major sports leagues.",
    "365Scores: 365Scores is a comprehensive sports app that provides live scores, news, and analysis for all major sports leagues, as well as access to live games and replays.",
    "ScoreStream: ScoreStream is a great app for high school and college sports fans. It provides real-time scores and updates for local and national games.",
    "SportsEngine: SportsEngine is a great app for youth sports leagues. It provides schedules, scores, and updates for local and national games.",
    "Strava: Strava is a great app for runners and cyclists. It provides GPS tracking, route planning, and social features for tracking and sharing workouts.",
    "MyFitnessPal: MyFitnessPal is a great app for tracking nutrition and fitness goals. It provides a database of foods and exercises, as well as tools for setting and tracking goals.",
    "Nike Training Club: Nike Training Club is a great app for at-home workouts. It provides video tutorials and personalized workout plans for all fitness levels.",
    "Peloton: Peloton is a great app for at-home workouts. It provides live and on-demand classes for cycling, running, and other workouts.",
    "Zwift: Zwift is a great app for indoor cycling. It provides virtual routes and races, as well as social features for connecting with other cyclists.",
    "GolfNow: GolfNow is a great app for golfers. It provides tee time reservations and course information for golf courses around the world."
)

class SearchAdapter() : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
            return ViewHolder(view)
        }

    fun setData(list: ArrayList<String>){
        sportsSearch = list
    }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = sportsSearch[position]
            holder.colorHexTextView.text = item
            holder.ivhertempty.isVisible = false

        }

        override fun getItemCount(): Int = sportsSearch.size

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val colorHexTextView: TextView = itemView.findViewById(R.id.TVtext)
            val ivhertempty: ImageView = itemView.findViewById(R.id.ivheatempty)

        }
    }

