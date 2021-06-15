PImage maping = loadImage("https://api.mapbox.com/styles/v1/mapbox/streets-v11/static/-73.9388,40.7187,10.2,0/1200x800?access_token=pk.eyJ1IjoiZXJpYzQxNCIsImEiOiJja3B4enZhdW4wNDlyMm9wa29mM3BjaXFuIn0.KbAYMYohLgKq9sXNYUzf2w", "png");
float clon = -73.9388; 
float clat = 40.7187;
float zoom = 10.2;

void setup(){
  size(1200,800);
  translate(width/2, height/2);
  imageMode(CENTER);
  image(maping,0,0);
  
  float cx = mercX(clon);
  float cy = mercY(clat);
  
  JSONArray complaints = loadJSONArray("https://data.cityofnewyork.us/resource/h9gi-nx95.json");
  for(int i = 0; i< complaints.size(); i++){
    JSONObject complaint = complaints.getJSONObject(i);
    
    if(complaint.getString("longitude") != null && complaint.getString("borough") != null){
      //if(complaint.getString("borough").equals("BROOKLYN")){
        float lon = Float.parseFloat(complaint.getString("longitude"));
        float lat = Float.parseFloat(complaint.getString("latitude"));
        float x = mercX(lon) - cx;
        float y = mercY(lat) - cy;
      
        fill(255, 0, 0);
        noStroke();
        ellipse(x, y, 3, 3);
      //}
    }
  }
}
float mercX(float lon){
  lon = radians(lon);
  float a = (256 / PI) * pow(2.0,zoom);
  float b = lon + PI;
  return a * b;
}

float mercY(float lat){
  lat = radians(lat);
  float a = (256 / PI) * pow(2.0,zoom);
  float b = tan(PI/4 + lat/2);
  float c = PI - log(b);
  return a * c;
}
