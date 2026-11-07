package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.content.SharedPreferences;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1540c;

    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        this.f1538a = i10;
        this.f1539b = obj;
        this.f1540c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String string;
        int i10 = this.f1538a;
        Object obj = this.f1540c;
        Object obj2 = this.f1539b;
        switch (i10) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$6$0((CredentialProviderCreatePublicKeyCredentialController) obj2, (Throwable) obj);
                break;
            default:
                kd.b bVar = (kd.b) obj;
                sd.q<SharedPreferences> qVar = ((ld.i) obj2).f16992e.f17019a;
                if (!(bVar instanceof ld.b)) {
                    qVar.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", bVar.b()).putString("com.google.firebase.appcheck.TOKEN_TYPE", "UNKNOWN_APP_CHECK_TOKEN").apply();
                    break;
                } else {
                    SharedPreferences.Editor editorEdit = qVar.get().edit();
                    ld.b bVar2 = (ld.b) bVar;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("token", bVar2.f16978a);
                        jSONObject.put("receivedAt", bVar2.f16979b);
                        jSONObject.put("expiresIn", bVar2.f16980c);
                        string = jSONObject.toString();
                    } catch (JSONException e10) {
                        Log.e("ld.b", "Could not serialize token: " + e10.getMessage());
                        string = null;
                    }
                    editorEdit.putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", string).putString("com.google.firebase.appcheck.TOKEN_TYPE", "DEFAULT_APP_CHECK_TOKEN").apply();
                    break;
                }
        }
    }
}
