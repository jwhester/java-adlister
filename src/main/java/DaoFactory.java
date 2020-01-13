public class DaoFactory {
    private static Ads adsDao;
    private static Contacts contactDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }
    public static Contacts getContactDao(){
        if (contactDao == null) {
            contactDao = new ContactListDao();
        }
        return contactDao;
    }
}
