package bytes.sync.util;

public class Endpoints {

    private static final String SERVER = "localhost";
    private static final int PORT = 8888;
    private static String BASE_URL = SERVER + ":" + PORT;


    private static String disablePackageApi = BASE_URL + "/package/disable({pkgId})";
    private static String enablePackageApi = BASE_URL + "/package/enable({pkgId})";

    private static String disableRunInBackgroundApi = BASE_URL + "/package/disable({pkgId})";
    private static String enableRunInBackgroundApi = BASE_URL + "/package/enable({pkgId})";

    private static String disableWakelockApi = BASE_URL + "/package/disable({pkgId})";
    private static String enableWakelockApi = BASE_URL + "/package/enable({pkgId})";


    public static String getAPIUrl(API api, String pkgId) {
        String url = "";

        switch (api) {
            case ENABLE_PACKAGE: url = enablePackageApi.replace("{pkgId}", pkgId); break;
            case DISABLE_PACKAGE: url = disablePackageApi.replace("{pkgId}", pkgId); break;

            case ENABLE_RUN_IN_BACKGROUND: url = enableRunInBackgroundApi.replace("{pkgId}", pkgId); break;
            case DISABLE_RUN_IN_BACKGROUND: url = disableRunInBackgroundApi.replace("{pkgId}", pkgId); break;

            case ENABLE_WAKE_LOCK: url = enableWakelockApi.replace("{pkgId}", pkgId); break;
            case DISABLE_WAKE_LOCK: url = disableWakelockApi.replace("{pkgId}", pkgId); break;
        }

        return url;
    }
    

}
