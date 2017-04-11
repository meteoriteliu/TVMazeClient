package tech.meteoriteliu.tvmazeclient.model;

/**
 * Created by meteo on 2017/4/11.
 */
public class CastCredit {
    private CastCreditLinks _links;

    public class CastCreditLinks extends Links{
        private Link show;
        private Link character;

        public String getShow() {
            if (show != null) {
                return show.getHref();
            }
            return null;
        }

        public String getCharacter() {
            if (character != null) {
                return character.getHref();
            }
            return null;
        }
    }

    public CastCreditLinks get_links() {
        return _links;
    }
}
