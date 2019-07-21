package bytes.sync.network;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;

import org.json.JSONArray;

import bytes.sync.util.API;
import bytes.sync.util.Endpoints;

public class APICall {

    public static void callEnablePackage(String pkgId) {
        AndroidNetworking.get(Endpoints.getAPIUrl(API.ENABLE_PACKAGE, pkgId))
                .setPriority(Priority.HIGH)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) {

                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });

    }

}
