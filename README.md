# Weather Application

- A weather forecast app that makes it easy to get information about current and future weather conditions using weatherapi.
- Access a 3-day weather forecast to plan ahead.
- Get weather updates for a variety of cities, allowing you to stay informed about conditions worldwide.

</br>
Built with Kotlin

## Description

* Weather forecast is updated every 15 minutes
* When entering the application, it is checked whether GPS is enabled and the appropriate permission is requested
* Initially and when updating by clicking on the corresponding button, the weather forecast for the user’s current location is always shown
* The interface contains a description of the weather and is accompanied by a corresponding picture
* Weather forecast by day is characterized by maximum and minimum temperatures
* It is possible to select any other city in the world to view the weather forecast there

#### The weather forecast is divided into hourly and daily
![WeatherAppDesc_01](https://github.com/DivisionCom/weather-app/assets/107028454/7558c8a0-c273-4d93-9095-771bfb69af00)

#### When you click on the corresponding day, the hourly weather forecast for the selected day is shown
![WeatherAppDesc_02](https://github.com/DivisionCom/weather-app/assets/107028454/c08e783e-1cd9-490e-b3d7-69c32402d0e9)

#### To select another city, you need to click on the search icon and enter the name in English
![WeatherAppDesc_03](https://github.com/DivisionCom/weather-app/assets/107028454/50ceea36-afcc-4d56-b5ce-117497f032d0)

#### To return to a city by location or reset previous actions, you need to click on the refresh icon
![WeatherAppDesc_04](https://github.com/DivisionCom/weather-app/assets/107028454/fb12422d-c2b7-40de-88c4-af38809ee151)

#### If you run the application with GPS turned off (or turn it off during use), the user will be prompted to turn on GPS; if he agrees, he will be sent to the settings for activation
![WeatherAppDesc_05](https://github.com/DivisionCom/weather-app/assets/107028454/f956e307-49dc-4ab0-87ea-c2979e6d4e73)



## Getting Started

### Dependencies

* Mobile Application that supports <b>Android</b> platform

### Installing

* Type this in Git Bash:
```
$ git clone https://github.com/DivisionCom/weather-app.git
```
* Also you can download <b>APK</b> file from [here](https://www.dropbox.com/scl/fi/fgfdm58a2uqnk7t2dtneo/WeatherApp.apk?rlkey=qb3cf1xzt83splp2w9b8oi2af&dl=0)

### Executing program

* Get your API key from [https://www.weatherapi.com/](https://www.weatherapi.com/)
* Go for: app/src/main/java/com/example/weatherapp/fragments/MainFragment.kt and change
```kotlin
const val API_KEY = "YOUR API KEY"
```

## Help

Use only <b>English</b> when using the application, for example, when specifying a city for a weather forecast.

## Authors

Evgenii Fedin </br>
[@GitHub](https://github.com/DivisionCom) </br>
[@HeadHunter](https://spb.hh.ru/resume/80d9b2d3ff09d8ea370039ed1f6e463471544a) </br>
[@Telegram](https://t.me/DivisionCommander) </br>
