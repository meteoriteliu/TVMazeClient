package tech.meteoriteliu.tvmazeclient;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import tech.meteoriteliu.tvmazeclient.model.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
        return findShowById(id, null);
    }

    public Show findShowById(String id, List<Constants.ShowEmbedItem> embedItems) throws IOException{
        String url = BASE_URL + "/shows/" + id;
        if (embedItems != null && !embedItems.isEmpty()) {
            url += "?";
            for (Constants.ShowEmbedItem item : embedItems) {
                url += "embed[]=" + item.getValue() + "&";
            }
        }
        Connection.Response response = getByURL(url);
        Show show = gson.fromJson(response.body(), Show.class);

        return show;
    }

    public Show searchShow(String query) throws IOException{
        String url = BASE_URL + "/singlesearch/shows?q=" + query;
        Connection.Response response = getByURL(url);
        Show show = gson.fromJson(response.body(), Show.class);

        return show;
    }

    public Show searchShow(String query, List<Constants.ShowEmbedItem> embedItems) throws IOException{
        String url = BASE_URL + "/singlesearch/shows?q=" + query;
        if (embedItems != null && !embedItems.isEmpty()) {
            for (Constants.ShowEmbedItem item : embedItems) {
                url += "&embed[]=" + item.getValue();
            }
        }
        Connection.Response response = getByURL(url);
        Show show = gson.fromJson(response.body(), Show.class);

        return show;
    }

    public Show lookupShow(String externalSource, String externalSourceId) throws IOException{
        String url = BASE_URL + "/lookup/shows?" + externalSource + "=" + externalSourceId;
        Connection.Response response = getByURL(url);
        Show show = gson.fromJson(response.body(), Show.class);

        return show;
    }

    public List<ShowSearchResult> searchShows(String query) throws IOException{
        String url = BASE_URL + "/search/shows?q=" + query;
        Connection.Response response = getByURL(url);
        Type listType = new TypeToken<ArrayList<ShowSearchResult>>(){}.getType();
        return gson.fromJson(response.body(), listType);
    }

    public List<PeopleSearchResult> searchPeople(String query) throws IOException {
        String url = BASE_URL + "/search/people?q=" + query;
        Connection.Response response = getByURL(url);
        Type listType = new TypeToken<ArrayList<PeopleSearchResult>>(){}.getType();
        return gson.fromJson(response.body(), listType);
    }

    public List<Episode> schedule(String countryCode, Date date) throws IOException {
        String url = BASE_URL + "/schedule?";
        if (countryCode != null && !"".equalsIgnoreCase(countryCode)) {
            url += "country=" + countryCode;
        }
        if (date != null) {
            url += "&date=" + Constants.formatDate(date);
        }
        Connection.Response response = getByURL(url);
        Type listType = new TypeToken<ArrayList<Episode>>(){}.getType();
        return gson.fromJson(response.body(), listType);
    }

    public List<Episode> fullSchedule() throws IOException {
        String url = BASE_URL + "/schedule/full";
        Connection.Response response = getByURL(url);
        Type listType = new TypeToken<ArrayList<Episode>>(){}.getType();
        return gson.fromJson(response.body(), listType);
    }

    public List<Episode> listEpisodesByShow(String showId, boolean includeSpecials) throws IOException {
        String url = BASE_URL + "/shows/" + showId + "/episodes";
        if (includeSpecials) {
            url += "?specials=1";
        }
        Connection.Response response = getByURL(url);
        Type listType = new TypeToken<ArrayList<Episode>>(){}.getType();
        return gson.fromJson(response.body(), listType);
    }

    public Episode findEpisodeByShowIdAndSeasonAndNumber(String showId, int season, int number) throws IOException {
        String url = BASE_URL + "/shows/" + showId + "/episodebynumber?season="+season+"&number=" + number;
        Connection.Response response = getByURL(url);
        return gson.fromJson(response.body(), Episode.class);
    }

    public Episode findEpisodeByShowIdAndDate(String showId, Date date) throws IOException {
        String url = BASE_URL + "/shows/" + showId + "/episodesbydate?date=" + Constants.formatDate(date);
        Connection.Response response = getByURL(url);
        return gson.fromJson(response.body(), Episode.class);
    }

    public List<Season> listSeasonsByShow(String showId) throws IOException {
        String url = BASE_URL + "/shows/" + showId + "/seasons";
        Connection.Response response = getByURL(url);
        Type listType = new TypeToken<ArrayList<Season>>(){}.getType();
        return gson.fromJson(response.body(), listType);
    }

    public List<Cast> listCastByShow(String showId) throws IOException {
        String url = BASE_URL + "/shows/" + showId + "/cast";
        Connection.Response response = getByURL(url);
        Type listType = new TypeToken<ArrayList<Cast>>(){}.getType();
        return gson.fromJson(response.body(), listType);
    }

    public List<Crew> listCrewByShow(String showId) throws IOException {
        String url = BASE_URL + "/shows/" + showId + "/crew";
        Connection.Response response = getByURL(url);
        Type listType = new TypeToken<ArrayList<Crew>>(){}.getType();
        return gson.fromJson(response.body(), listType);
    }

    public List<Aka> listAkasByShow(String showId) throws IOException {
        String url = BASE_URL + "/shows/" + showId + "/akas";
        Connection.Response response = getByURL(url);
        Type listType = new TypeToken<ArrayList<Aka>>(){}.getType();
        return gson.fromJson(response.body(), listType);
    }

    public List<Show> listShows(int page) throws IOException {
        String url = BASE_URL + "/shows?page=" + page;
        Connection.Response response = getByURL(url);
        Type listType = new TypeToken<ArrayList<Show>>(){}.getType();
        return gson.fromJson(response.body(), listType);
    }

    public People findPeopleById(String id) throws IOException{
        return findPeopleById(id, null);
    }

    public People findPeopleById(String id, List<Constants.PeopleEmbedItem> embedItems) throws IOException{
        String url = BASE_URL + "/people/" + id;
        if (embedItems != null && !embedItems.isEmpty()) {
            url += "?";
            for (Constants.PeopleEmbedItem item : embedItems) {
                url += "embed[]=" + item.getValue() + "&";
            }
        }
        Connection.Response response = getByURL(url);
        People people = gson.fromJson(response.body(), People.class);

        return people;
    }

    private Connection.Response getByURL(String url) throws IOException{
        System.out.println("url=" + url);
        Connection.Response response = Jsoup.connect(url).ignoreContentType(true).ignoreHttpErrors(true).maxBodySize(0).execute();
        System.out.println("response length =" + response.body().length());
        if (response.statusCode() != 200) {
            if (response.statusCode() == 404) {
                throw new HttpStatusException("Not Found", response.statusCode(), url);
            }

            ErrorMessage errorMessage = gson.fromJson(response.body(), ErrorMessage.class);
            String message = errorMessage.getMessage();
            if (message == null || "".equals(message)) {
                message = errorMessage.getName();
            }
            throw new HttpStatusException(message, response.statusCode(), url);
        }
        return response;
    }

    public static void main(String[] args) throws IOException {
        TVMazeClient client = new TVMazeClient();
//        List<ShowSearchResult> shows = client.searchShows("c");
//
//        for (ShowSearchResult show : shows) {
//
//            System.out.println(show.getShow().get_links().getPreviousEpisode());
//        }

//        Show show = client.searchShow("cdddcf");
//        System.out.println(show.getName());

//            Show show = client.lookupShow("dfdf", "2449333");
//        System.out.println(show.getName());

//        List<PeopleSearchResult> pl = client.searchPeople("lauren");
//        for (PeopleSearchResult p : pl) {
//
//            System.out.println(p.getPerson().getImage());
//        }

//        List<Episode> pl = client.listEpisodesByShow("31", false);
//        System.out.println("total=" + pl.size());

//        Episode e = client.findEpisodeByShowIdAndSeasonAndNumber("1", 11, 1);
//        System.out.println("name=-" + e.getName());

//        Episode e = client.findEpisodeByShowIdAndDate("1", new Date());
//        System.out.println("name=-" + e.getName());

//        List<Show> shows = client.listShows(222);
//        System.out.print("ssss=" + shows.get(0).getId());

        People people = client.findPeopleById("1", Arrays.asList(Constants.PeopleEmbedItem.CASTCREDITS));
        System.out.print("name=" + people.get_embedded().getCastcredits().get(0).get_links().getCharacter());
//        for (Episode p : pl) {
//
//           // System.out.println(p.getShow().getName());
//        }

    }
}
