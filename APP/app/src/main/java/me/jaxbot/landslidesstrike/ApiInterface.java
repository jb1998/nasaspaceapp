package me.jaxbot.landslidesstrike;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pc on 4/29/2017.
 */

public interface ApiInterface {
    @GET("resource/tfkf-kniw.json")
    Call<ArrayList<Webclass>> getcourses();
}
