Submitted by: Eleni Mekonnen

Park Explorer is a simple Android app that allows users to scroll through a list of beautiful National Parks and learn more about each one.

Time spent: 3 hours spent in total

Required Features
The following required functionality is completed:

[x] Make a request to the National Parks API to get a list of parks.

[x] Parse through JSON data and implement a RecyclerView to display all parks.

For each park, the user can see its name, location, and description.

[x] Use Glide to load and display park images from URLs.

Optional Features
The following optional features are implemented:

[ ] Improve and customize the user interface through styling and coloring

[ ] Implement orientation responsivity

App should neatly arrange data in both landscape and portrait mode

[ ] Implement Glide to display placeholder graphics during loading

Note: this feature is difficult to capture in a GIF without throttling internet speeds. Instead, include an additional screencap of your Glide code implementing the feature. (<10 lines of code)

Additional Features
[ ] List anything else that you can get done to improve the app functionality!

Video Walkthrough
Here's a walkthrough of implemented user stories:

https://imgur.com/a/Av9W2Dd
GIF created with ...

Notes
Describe any challenges encountered while building the app, such as:

Dealing with the structure of the National Parks API response (e.g., nested JSON objects for images or locations).

Correctly setting up the RecyclerView.Adapter and ViewHolder to bind the park data to the views.

Handling potential network errors or permissions.

Configuring Glide to load images efficiently and manage the image lifecycle within the RecyclerView (e.g., preventing image flickering or loading the wrong image when views are recycled).

License
Copyright [2025] [Eleni Mekonnen]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    [http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
