/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.kondeelai.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.bkoumtak.JokeFactory;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.myapplication.kondeelai.example.com",
    ownerName = "backend.myapplication.kondeelai.example.com",
    packagePath=""
  )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "getRandomJoke")
    public JokeFactory getRandomJoke() {
        JokeFactory jokeFactory = new JokeFactory();


        return jokeFactory;
    }

}
