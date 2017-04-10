package tech.meteoriteliu.tvmazeclient;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import tech.meteoriteliu.tvmazeclient.exception.ResourceNotFoundException;
import tech.meteoriteliu.tvmazeclient.model.Show;
import tech.meteoriteliu.tvmazeclient.model.ShowSearchResult;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by meteo on 2017/4/10.
 */
public class TVMazeClient {

    private static final String BASE_URL = "http://api.tvmaze.com";
    private Gson gson;

    public TVMazeClient() {
        this(new Gson());
    }

    private TVMazeClient(Gson gson) {
        this.gson = gson;
    }

    public Show findShowById(String id) throws IOException{
        String url = BASE_URL + "/shows/" + id;
        Connection.Response response = Jsoup.connect(url).ignoreContentType(true).ignoreHttpErrors(true).execute();
        if (response.statusCode() == 404) {
            throw new ResourceNotFoundException(Constants.RESOURCETYPE_SHOW, id);
        }
        Show show = gson.fromJson(response.body(), Show.class);

        return show;
    }

    public Show searchShow(String query) throws IOException{
        String url = BASE_URL + "/singlesearch/shows?q=" + query;
        Connection.Response response = Jsoup.connect(url).ignoreContentType(true).ignoreHttpErrors(true).execute();
        if (response.statusCode() == 404) {
            throw new ResourceNotFoundException(Constants.RESOURCETYPE_SHOW, query);
        }
        Show show = gson.fromJson(response.body(), Show.class);

        return show;
    }

    public List<ShowSearchResult> searchShows(String query) throws IOException{
        String url = BASE_URL + "/search/shows?q=" + query;
        Connection.Response response = Jsoup.connect(url).ignoreContentType(true).ignoreHttpErrors(true).execute();
        Type listType = new TypeToken<ArrayList<ShowSearchResult>>(){}.getType();
        return new Gson().fromJson(response.body(), listType);
    }

    public static void main(String[] args) throws IOException {
        String url = BASE_URL + "/shows/1";
        System.out.println("url=" + url);
        TVMazeClient client = new TVMazeClient();
        List<ShowSearchResult> shows = client.searchShows("c");

        for (ShowSearchResult show : shows) {

            //System.out.println(show.getShow().get_links().getPreviousEpisode());
        }

        Show show = client.searchShow("c");
        System.out.println(show.getName());
    }
}
